<template>
  <n-modal
    v-model:show="store.modalStore.open"
    preset="dialog"
    :icon="renderIcon(modalProps!.icon)"
    :title="modalProps?.title"
    :content="modalProps?.content"
    :type="(modalProps?.type as any)"
    :positive-text="modalProps?.positiveText"
    :negative-text="modalProps?.negativeText"
    @mask-click="modalProps?.modelButtonCancelClick"
    @positive-click="modalProps?.modelButtonOKClick"
    @negative-click="modalProps?.modelButtonCancelClick"
    @close="modalProps?.modelButtonCancelClick"
  >
    <div v-if="store.modalStore.type === 'edit'" class="edit-modal-wrapper">
      <div>
        <span>用户名 </span>
        <n-input
          :status="(modalProps?.type as any)"
          type="text"
          :value="carInfo.userName"
          disabled
        />
      </div>
      <div>
        <span>车辆名称 </span>
        <n-input
          :status="(modalProps?.type as any)"
          type="text"
          :value="carInfo.carName"
          @input="(v:string)=> carInfo.carName = v"
        />
      </div>
      <div>
        <span>启用/禁止车辆</span>
        <n-select
          :status="(modalProps?.type as any)"
          :value="carInfo.carStatus == '0' ? '启用' : '禁用'"
          @update:value="(value) => (carInfo.carStatus = value)"
          :options="optionUserStatus"
        />
      </div>
      <div v-if="carInfo.carStatus == '0'">
        <span>选择租借的用户</span>
        <n-select
          :status="(modalProps?.type as any)"
          :value="carInfo.rentId"
          @update:value="(value) => (carInfo.rentId = value)"
          :options="rentUserIdList"
        />
      </div>
      <template v-if="carInfo.rentId && carInfo.carStatus == '0'">
        <div>
          <span>开始租借时间</span>
          <n-date-picker
            v-model:formatted-value="carInfo.startTime"
            value-format="yyyy.MM.dd HH:mm:ss"
            type="datetime"
            clearable
          />
        </div>
        <div>
          <span>结束租借时间</span>
          <n-date-picker
            v-model:formatted-value="carInfo.endTime"
            value-format="yyyy.MM.dd HH:mm:ss"
            type="datetime"
            clearable
          />
        </div>
      </template>
    </div>
  </n-modal>
</template>

<script setup lang="ts">
import { useTableOperateModel } from "@/stores/index";
import { useMessage, NModal, NInput, NSelect, NDatePicker } from "naive-ui";
import { optionUserStatus } from "@/mock/common";
import { computed, ref, reactive } from "vue";
import { CloudUploadOutline, TrashBinOutline } from "@vicons/ionicons5";
import { renderIcon, getDataTime } from "@/utils";
import { getAllUser } from "@/serve/api";

const store = useTableOperateModel();
const message = useMessage();

const rentUserIdList = ref<any>([]);

const carInfo = reactive({
  id: store.modalStore.data.id,
  userName: store.modalStore.data.userName,
  carName: ref(store.modalStore.data.carName),
  carStatus: ref<"0" | "1">(store.modalStore.data.carStatus),
  rentId: ref(store.modalStore.data.rentId),
  startTime: ref(getDataTime()),
  endTime: ref(getDataTime()),
});

const modalProps = computed(() => {
  switch (store.modalStore.type) {
    case "edit":
      return editProps;
    case "delete":
      return deleteProps;
  }
});

const loadData = async () => {
  let resp = await getAllUser();

  if (
    resp.data.code &&
    resp?.data?.code === 1102 &&
    resp.data.data.length !== 0
  ) {
    rentUserIdList.value = resp.data.data.map((item: any) => ({
      label: `${item.id}-${item.userName}`,
      value: item.id,
    }));
    rentUserIdList.value.unshift({ label: "取消选择", value: null });
  }
};
loadData();

const deleteProps = {
  icon: TrashBinOutline,
  title: "确认",
  content: "你确认是否删除吗?",
  type: "error",
  positiveText: "确认",
  negativeText: "取消",
  modelButtonOKClick: () => {
    message.success("Submit");
  },
  modelButtonCancelClick: () => {
    message.success("Cancel");
  },
};
const editProps = {
  icon: CloudUploadOutline,
  title: "请编辑车辆信息",
  content: "",
  type: "warning",
  positiveText: "提交",
  negativeText: "取消",
  modelButtonOKClick: () => {
    console.log(carInfo); // 为什么会重新渲染整个表格呢
    message.success("Submit");
  },
  modelButtonCancelClick: () => {
    message.success("Cancel");
  },
};
</script>

<style scoped>
.edit-modal-wrapper,
.add-modal-wrapper {
  margin-top: 32px;
  display: flex;
  flex-direction: column;
  gap: 32px 0;
}
</style>
