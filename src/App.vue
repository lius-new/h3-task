<template>
  <n-layout style="height: 100vh" class="root-container">
    <n-layout-header
      :inverted="inverted"
      bordered
      style="display: flex; justify-content: end"
    >
      <n-menu mode="horizontal" :inverted="inverted" :options="menuOptions" />
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
          :inverted="inverted"
          :collapsed-width="64"
          :collapsed-icon-size="22"
          :options="menuOptions"
        />
      </n-layout-sider>
      <n-layout>this </n-layout>
    </n-layout>
  </n-layout>
</template>

<script lang="ts" setup>
import { h, reactive, ref, Component } from "vue";
import { NIcon, NMenu, NLayout, NLayoutHeader, NLayoutSider } from "naive-ui";
import {
  BookOutline as BookIcon,
  PersonOutline as PersonIcon,
} from "@vicons/ionicons5";

function renderIcon(icon: Component) {
  return () => h(NIcon, null, { default: () => h(icon) });
}

const menuOptions = reactive([
  {
    label: "且听风吟",
    key: "hear-the-wind-sing",
    icon: renderIcon(BookIcon),
  },
  {
    label: "1973年的弹珠玩具",
    key: "pinball-1973",
    icon: renderIcon(BookIcon),
    // disabled: false,
    children: [
      {
        label: "鼠",
        key: "rat",
      },
    ],
  },
  {
    label: "舞，舞，舞",
    key: "dance-dance-dance",
    icon: renderIcon(BookIcon),
    children: [
      {
        type: "group",
        label: "人物",
        key: "people",
        children: [
          {
            label: "叙事者",
            key: "narrator",
            icon: renderIcon(PersonIcon),
          },
          {
            label: "羊男",
            key: "sheep-man",
            icon: renderIcon(PersonIcon),
          },
        ],
      },
    ],
  },
]);

const inverted = ref(false);
</script>

<style>
div.root-container.n-layout .n-layout-scroll-container {
  display: flex;
  flex-direction: column;
}
</style>
