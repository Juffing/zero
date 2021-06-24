import {createRouter, createWebHashHistory} from "vue-router";

const routes = [
    {
        path: "/",
        component: () => import("../components/Home")
    }
]
const router = createRouter({
    history: createWebHashHistory(),
    routes
});
export default router;
//在main.js中进行引入，并进行挂载注册到全局上