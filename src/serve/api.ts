import { httpGet, httpPost } from "./http";

export const login = async (userInfo: any) =>
  await httpPost({
    url: "/user/login",
    data: JSON.stringify(userInfo),
  });

export const register = async (userInfo: any) =>
  await httpPost({
    url: "/user/register",
    data: JSON.stringify(userInfo),
  });

export const authLogin = async () => {
  return await httpGet({ url: "/user/authLogin" });
};
