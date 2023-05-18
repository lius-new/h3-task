import { VNode, Component, h } from "vue";
import { authLogin } from "@/serve/api";
import { NIcon } from "naive-ui";

interface renderIconFunc {
  (icon: Component): () => VNode<{ [key: string]: any }>;
}

export const renderIcon: renderIconFunc = (icon: Component) => {
  return () => h(NIcon, null, { default: () => h(icon) });
};

// 通过login参数来判断是否是由登录页面调用的，如果是登录页面，获取不到token,就会一直刷新，避免一直刷新
export const isLogin: (login: boolean) => any = async (login: boolean) => {
  let token = localStorage.getItem("token");
  if (!token && !login) window.location.href = "/login"; // 如果是login,那么就不需要

  // 验证登录
  return await authLogin();
};
