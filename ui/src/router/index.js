import {createRouter, createWebHistory} from "vue-router";

const routes = [
    {
        path: "/",
        component: () => import("../components/Home")
    }, {
        path: "/video",
        component: () => import("../components/Video")
    }
]
const router = createRouter({
    history: createWebHistory(),
    routes
});
export default router;
//在main.js中进行引入，并进行挂载注册到全局上