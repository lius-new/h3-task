import { VNode } from "vue";
import {
  Home,
  Login,
  CarManger,
  UserManager,
  UserAccount,
  CarPublish,
} from "@/pages/index";
import { isLogin } from "@/utils";
import { createRouter, createWebHistory, Router } from "vue-router";

interface routesItemInterface {
  path: string;
  name: string;
  component: any | VNode;
  [key: string]: any;
}

const routes: Array<routesItemInterface> = [
  {
    path: "/",
    component: Home,
    name: "root",
    meta: {
      isNeedLogin: true, //是否需要登录
    },
  },
  {
    path: "/user-manager",
    component: UserManager,
    name: "user-manager",
    meta: {
      isNeedLogin: true, //是否需要登录
    },
  },
  {
    path: "/car-manager",
    component: CarManger,
    name: "car-manager",
    meta: {
      isNeedLogin: true, //是否需要登录
    },
  },
  {
    path: "/car-publish",
    component: CarPublish,
    name: "car-publish",
    meta: {
      isNeedLogin: true, //是否需要登录
    },
  },
  {
    path: "/user-account",
    component: UserAccount,
    name: "user-account",
    meta: {
      isNeedLogin: true, //是否需要登录
    },
  },
  { path: "/login", name: "login", component: Login },
];

const router: Router = createRouter({
  history: createWebHistory(),
  routes,
});
//  from, next
router.beforeEach(async (to, _, next) => {
  if (to.meta.isNeedLogin) {
    isLogin(false).then((res: any) => {
      if (res.data.code !== 1005) window.location.href = "/login"; // 非登录状态，跳转到登录
    });
    next();
  } else if (to.path === "/login") {
    isLogin(true).then((res: any) => {
      if (res.data.code === 1005) window.history.go(-1); // 如果已经登录，就返回到前面的链接
    });
    next();
  } else {
    next();
  }
});

export default router;
