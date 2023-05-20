<template>
  <Layout>
    <div class="page-content">
      <div class="operate-menu">
        <n-button type="info" @click="addUserClickHandle"> 添加用户 </n-button>
        <n-input
          v-model:value="filterValue"
          type="text"
          placeholder="请输入用户名"
        />
      </div>
      <Table :func="getAllUser" :filterValue="filterValue" />
    </div>
  </Layout>
</template>

<script setup lang="ts">
import { ref } from "vue";
import { NButton, NInput } from "naive-ui";
import Layout from "@/components/layout/index.vue";
import Table from "@/components/table/index.vue";
import { useTableOperateModel } from "@/stores/table-model";
import { getAllUser } from "@/serve/api";

const store = useTableOperateModel();
const filterValue = ref<string>("");

const addUserClickHandle = () => {
  store.openAddModal({
    userName: "",
    userPassword: "",
    userEmail: "",
    userRole: "USER",
    userStatus: 0,
  });
};
</script>

<style scoped>
.page-content {
  padding: 20px;
}

.operate-menu {
  display: flex;
  padding-top: 20px;
  padding-bottom: 20px;
  gap: 24px;
}
</style>
