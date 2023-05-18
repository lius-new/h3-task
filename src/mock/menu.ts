import { VNode } from "vue";
import { renderIcon } from "@/utils";

import { BookOutline as BookIcon } from "@vicons/ionicons5";

interface MenuItemInterface {
  label: string;
  key: string;
  icon: () => VNode<{ [key: string]: any }>;
  [key: string]: any;
}

const menuOptionsUser: MenuItemInterface[] = [
  { label: "个人信息设置", key: "", icon: renderIcon(BookIcon) },
];
const menuOptionsVip: MenuItemInterface[] = [
  { label: "个人信息设置", key: "", icon: renderIcon(BookIcon) },
  { label: "车辆发布", key: "", icon: renderIcon(BookIcon) },
];
const menuOptionsAdmin: MenuItemInterface[] = [
  { label: "用户管理", key: "", icon: renderIcon(BookIcon) },
  { label: "车辆管理", key: "", icon: renderIcon(BookIcon) },
];

export default {
  menuOptionsUser,
  menuOptionsVip,
  menuOptionsAdmin,
};
