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
    (window as any).$message.warning(`${res.data.msg}. 即将退出`, {
      duration: 3000,
    });

    setTimeout(() => {
      localStorage.clear();
      window.location.href = "/login";
    }, 3000);
  }
};

// 由登录界面过来的。禁止访问
export const toLoginIsLogin = async () => {
  //  验证登录，如果已经登录，就返回到之前的页面，而不是进入到登录页面
  const res = await authLogin();
  if (res.data.code === 1005) window.history.go(-1);
};

export const mapUserKey = (key: string) => {
  return {
    id: "用户id",
    userName: "用户名",
    userPassword: "用户密码",
    userEmail: "用户邮箱",
    userRole: "用户权限",
    userStatus: "用户状态",
  }[key];
};
export const mapCarKey = (key: string) => {
  return {
    id: "车辆id",
    userName: "用户名",
    carName: "车辆名称",
    carStatus: "可用状态",
    rentId: "租借状态",
  }[key];
};

// 封装表格中的数据columnt-car
export const encapsulatedDataCol = (func: Function, column: any) => {
  if (!column) return;

  return Object.keys(column).map((item: string) => {
    return { key: item, title: func(item) };
  });
};

// 封装表格中的数据
export const encapsulatedCarData = (data: any) => {
  if (!data) return;
  return data.map((item: any) => {
    item["carStatus"] = item["carStatus"] === 0 ? "可用" : "不可用";
    item["rentId"] = item["rentId"] === null ? "未租借" : "已租借";
    return item;
  });
};

export const encapsulatedUserData = (data: any) => {
  if (!data) return;
  return data.map((item: any) => {
    item["userEmail"] = item["uesrEmail"] ? item["userEmail"] : "邮箱为空";
    item["userRole"] =
      item["userRole"] === "USER"
        ? "普通用户"
        : item["userRole"] === "ADMIN"
        ? "管理员"
        : "VIP用户";

    item["userStatus"] = item["userStatus"] === 0 ? "可用" : "不可用";
    return item;
  });
};

// 获取当前时间格式: 2007.06.30 12:08:55
export const getDataTime = (): string => {
  const now = new Date();
  const year = now.getFullYear();
  const month = now.getMonth();
  const day = now.getDate();

  const date =
    year +
    "." +
    (month + 1 < 10 ? `0${month + 1}` : month + 1) +
    "." +
    (day < 10 ? `0${day}` : day);

  const time = now
    .toTimeString()
    .match(/(20|21|22|23|[0-1]\d):[0-5]\d:[0-5]\d/);

  return date + " " + (time === null ? "10:00:00" : time[0]);
};
