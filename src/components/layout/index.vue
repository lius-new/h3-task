<template>
  <n-layout style="height: 100vh" class="root-container">
    <n-layout-header
      :inverted="inverted"
      bordered
      style="display: flex; justify-content: end; padding-right: 4vw"
    >
      <n-dropdown
        trigger="hover"
        :options="menuOptionList.userOptions"
        @select="userMenuHandleClick"
      >
        <Avatar />
      </n-dropdown>
    </n-layout-header>
    <n-layout has-sider>
      <n-layout-sider
        bordered
        show-trigger
        collapse-mode="width"
        :collapsed-width="64"
        :width="240"
        :native-scrollbar="false"
        :inverted="inverted"
      >
        <n-menu
          :value="currentMenu"
          :inverted="inverted"
          :collapsed-width="64"
          :collapsed-icon-size="22"
          :options="menuOptions"
          :on-update:value="menuHandleClick"
        />
      </n-layout-sider>
      <n-layout><slot></slot> </n-layout>
    </n-layout>
  </n-layout>
</template>

<script lang="ts" setup>
import { reactive, ref } from "vue";
import Avatar from "@/components/avator/index.vue";
import {
  NMenu,
  NLayout,
  NLayoutHeader,
  NLayoutSider,
  NDropdown,
} from "naive-ui";
import menuOptionList from "@/mock/menu";
import { useRoute, useRouter } from "vue-router";
import { computed } from "vue";

const inverted = ref(false);
const menuOptions = reactive([...menuOptionList.menuOptions]);
const router = useRouter();
const route = useRoute();

const currentMenu = computed(() => route.path.substring(1));

const userMenuHandleClick = (key: string) => {
  if (key === "cancellation") {
    localStorage.clear();
    router.push("/login");
  } else if (key === "user-account") {
    router.push("/user-account");
  }
};

const menuHandleClick = (key: string) => {
  switch (key) {
    case "user-manager":
      router.push("/user-manager");
      break;
    case "car-manager":
      router.push("/car-manager");
      break;
    case "car-publish":
      router.push("/car-publish");
      break;
    case "user-account":
      router.push("/user-account");
      break;
  }
};
</script>

<style>
div.root-container.n-layout .n-layout-scroll-container {
  display: flex;
  flex-direction: column;
}
</style>
