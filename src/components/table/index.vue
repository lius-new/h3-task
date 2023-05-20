<template>
  <n-data-table
    key="(row:any) => row.key"
    :columns="columns"
    :data="data"
    :pagination="{ pageSize }"
    striped
  />
  <TableModel v-if="store.modalStore.open" />
</template>
<script setup lang="ts">
import { NDataTable, NButton, NButtonGroup } from "naive-ui";
import { ref, onBeforeMount, h } from "vue";
import TableModel from "@/components/table-modal/index.vue";
import { useTableOperateModel } from "@/stores/table-model";

interface PropsInterface {
  filterValue: string;
  func: Function;
  [key: string]: any;
}

const props = withDefaults(defineProps<PropsInterface>(), {});

const columns = ref<any>([]); // 表中的字段名
const data = ref<any>([]); // 表中数据
const store = useTableOperateModel(); // store

onBeforeMount(async () => {
  // 获取数据
  const resp = await props.func();

  if (
    resp.data.code &&
    resp?.data?.code === 1102 &&
    resp.data.data.length !== 0
  ) {
    data.value = resp.data.data;
    columns.value = Object.keys(resp.data.data[0]).map((item) => ({
      title: item,
      key: item,
    }));
    columns.value.push({
      title: "action",
      key: "action",
      render(row: any) {
        return h(
          NButtonGroup,
          {
            style:
              "display: flex; flex-flow: row wrap; justify-content: flex-start; gap: 8px 12px;",
          },
          [
            h(
              NButton,
              {
                round: true,
                ghost: true,
                type: "warning",
                onClick: () => {
                  store.openEditModal(row);
                },
              },
              { default: () => "编辑" }
            ),
            h(
              NButton,
              {
                round: true,
                ghost: true,
                type: "error",
                onClick: () => {
                  store.openDeleteModal(row);
                },
              },
              { default: () => "删除" }
            ),
          ]
        );
      },
    });
  }
});
</script>
