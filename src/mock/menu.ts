import { VNode } from "vue";
import { renderIcon } from "@/utils";

import {
  AccessibilityOutline,
  CarSportOutline,
  ArrowUp,
  HandRightOutline,
  LogInOutline,
} from "@vicons/ionicons5";

interface MenuItemInterface {
  label: string;
  key: string;
  icon: () => VNode<{ [key: string]: any }>;
  [key: string]: any;
}

const menuOptions: MenuItemInterface[] = [
  {
    label: "用户管理",
    key: "user-manager",
    icon: renderIcon(AccessibilityOutline),
  },
  { label: "车辆管理", key: "car-manager", icon: renderIcon(CarSportOutline) },
  { label: "车辆发布", key: "car-publish", icon: renderIcon(ArrowUp) },
  {
    label: "个人信息设置",
    key: "user-account",
    icon: renderIcon(HandRightOutline),
  },
];
const userOptions: MenuItemInterface[] = [
  {
    label: "用户信息",
    key: "user-account",
    icon: renderIcon(HandRightOutline),
  },
  {
    label: "注销",
    key: "cancellation",
    icon: renderIcon(LogInOutline),
  },
];

export default { menuOptions, userOptions };
