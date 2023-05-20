import { VNode, Component, h } from "vue";
import { authLogin } from "@/serve/api";
import { NIcon } from "naive-ui";

interface renderIconFunc {
  (icon: Component): () => VNode<{ [key: string]: any }>;
}

export const renderIcon: renderIconFunc = (icon: Component) => {
  return () => h(NIcon, null, { default: () => h(icon) });
};

export const isLogin: () => any = async () => {
  // 验证登录， 如果返回结果code!==1005,表示没有登录
  const res = await authLogin();
  if (res.data.code !== 1005) {
    localStorage.clear();
    window.location.href = "/login";
  }
};

// 由登录界面过来的。
export const toLoginIsLogin = async () => {
  //  验证登录，如果已经登录，就返回到之前的页面，而不是进入到登录页面
  const res = await authLogin();
  if (res.data.code === 1005) window.history.go(-1);
};
