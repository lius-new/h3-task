<template>
  <n-modal
    v-model:show="store.modalStore.open"
    preset="dialog"
    :icon="renderIcon(modelProps.icon)"
    :title="modelProps.title"
    :content="modelProps.content"
    :type="(modelProps.type as any)"
    :positive-text="modelProps.positiveText"
    :negative-text="modelProps.negativeText"
    @mask-click="modelProps.modelButtonCancelClick"
    @positive-click="modelProps.modelButtonOKClick"
    @negative-click="modelProps.modelButtonCancelClick"
    @close="modelProps.modelButtonCancelClick"
  >
    <div v-if="store.modalStore.type === 'edit'" class="edit-modal-wrapper">
      <div v-for="(value, key) in store.modalStore.data" :key="key">
        <span v-if="key as any !== 'id'">请重写编写: {{ key }}</span>
        <template
          v-if="key as any !== 'userRole' && key as any !== 'userStatus' && key as any !== 'id'"
        >
          <n-input
            :status="(modelProps.type as any)"
            placeholder=""
            type="text"
            :value="value"
            @input="(event:any) => store.changeModalData(key, event)"
          />
        </template>
        <template v-else-if="(key as any) === 'userRole'">
          <n-select
            :status="(modelProps.type as any)"
            :value="value"
            @update:value="(value) => store.changeModalData(key, value)"
            :options="optionUserRole"
          />
        </template>
        <template v-else-if="(key as any) === 'userStatus'">
          <n-select
            :status="(modelProps.type as any)"
            :value="value === 0 ? '启用' : '禁用'"
            @update:value="(value) => store.changeModalData(key, value)"
            :options="optionUserStatus"
          />
        </template>
      </div>
    </div>
    <div v-else-if="store.modalStore.type === 'add'" class="add-modal-wrapper">
      <div v-for="(value, key) in store.modalStore.data" :key="key">
        <span>请输入你的: {{ key }}</span>
        <template
          v-if="key as any !== 'userRole' && key as any !== 'userStatus'"
        >
          <n-input
            placeholder=""
            type="text"
            :value="value"
            :status="(modelProps.type as any)"
            @input="(event:any) => store.changeModalData(key, event)"
          />
        </template>
        <template v-else-if="(key as any) === 'userRole'">
          <n-select
            :status="(modelProps.type as any)"
            :value="value"
            @update:value="(value) => store.changeModalData(key, value)"
            :options="optionUserRole"
          />
        </template>
        <template v-else-if="(key as any) === 'userStatus'">
          <n-select
            :status="(modelProps.type as any)"
            :value="value == 0 ? '启用' : '禁用'"
            @update:value="(value) => store.changeModalData(key, value)"
            :options="optionUserStatus"
          />
        </template>
      </div>
    </div>
  </n-modal>
</template>
<script setup lang="ts">
import { useTableOperateModel } from "@/stores/index";
import { useMessage, NModal, NInput, NSelect } from "naive-ui";
import { optionUserRole, optionUserStatus } from "@/mock/common";
import { computed } from "vue";
import {
  CloudUploadOutline,
  TrashBinOutline,
  PersonAddOutline,
} from "@vicons/ionicons5";
import { renderIcon } from "@/utils";

const store = useTableOperateModel();
const message = useMessage();
const modelProps = computed(() => {
  switch (store.modalStore.type) {
    case "edit":
      return editProps;
    case "add":
      return addProps;
    case "delete":
      return deleteProps;
  }
});

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
  title: "请编辑如下个人信息",
  content: "",
  type: "warning",
  positiveText: "提交",
  negativeText: "取消",
  modelButtonOKClick: () => {
    console.log(store.modalStore.data);

    message.success("Submit");
  },
  modelButtonCancelClick: () => {
    message.success("Cancel");
  },
};
const addProps = {
  icon: PersonAddOutline,
  title: "添加新用户",
  content: "",
  type: "success",
  positiveText: "提交",
  negativeText: "取消",
  modelButtonOKClick: () => {
    console.log(store.modalStore.data);
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
