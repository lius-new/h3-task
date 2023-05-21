<template>
  <Layout>
    <div class="user-account-wrapper">
      <div>
        <span>用户名</span>
        <n-input
          type="text"
          :value="userAccountInfo.userName"
          @input="(value:string)=>userAccountInfo.userName = value"
        />
      </div>
      <div>
        <span>密码</span>
        <n-input type="password" :value="userAccountInfo.userPassword" />
      </div>
      <div>
        <span>邮箱</span>
        <n-input
          type="text"
          :value="userAccountInfo.userEmail"
          @input="(value:string)=>userAccountInfo.userEmail = value"
        />
      </div>
      <div>
        <span>用户权限(需等待审批)</span>
        <n-select
          type="text"
          :value="userAccountInfo.userRole"
          @update:value="(value) => (userAccountInfo.userRole = value)"
          :options="optionUserRole"
        />
      </div>
      <div>
        <span>用户状态(禁用:注销)</span>
        <n-select
          type="text"
          :value="userAccountInfo.userStatus == '0' ? '启用' : '禁用'"
          @update:value="(value) => (userAccountInfo.userStatus = value)"
          :options="optionUserStatus"
        />
      </div>
      <div>
        <n-button type="primary" strong secondary>修改</n-button>
      </div>
    </div>
  </Layout>
</template>

<script setup lang="ts">
import { ref, reactive } from "vue";
import { NInput, NButton, NSelect } from "naive-ui";
import { optionUserStatus } from "@/mock/common";
import { getUserByName } from "@/serve/api";
import Layout from "@/components/layout/index.vue";
import { optionUserRole } from "@/mock/common";

const userAccountInfo = reactive({
  userName: ref(""),
  userPassword: ref(""),
  userEmail: ref(""),
  userRole: ref(""),
  userStatus: ref<"0" | "1">(),
});

(async () => {
  let resp = await getUserByName(localStorage.getItem("userName") as string);
  const { userName, userPassword, userEmail, userRole, userStatus } = await resp
    .data.data;
  userAccountInfo.userName = userName;
  userAccountInfo.userPassword = userPassword;
  userAccountInfo.userEmail = userEmail;
  userAccountInfo.userRole = userRole;
  userAccountInfo.userStatus = userStatus;
})();
</script>

<style scoped>
.user-account-wrapper {
  margin: 20px auto;
  padding: 24px;
  width: 64vw;
  border-radius: 12px;
  background-color: white;
  box-shadow: rgba(139, 128, 128, 0.02) 0px 1px 3px 0px,
    rgba(149, 169, 189, 0.15) 0px 0px 0px 1px;
  display: flex;
  flex-direction: column;
  gap: 24px 0;
}
</style>
