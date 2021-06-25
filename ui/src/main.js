import { createApp } from 'vue'
import App from './App.vue'
import router from './router/index'
import ElementPlus from 'element-plus'
import 'element-plus/lib/theme-chalk/index.css'
import axios from 'axios'

const app = createApp(App);

app.config.globalProperties.$axios = axios;
app.config.globalProperties.$url = 'http://localhost:9005';

app.use(router)
app.use(ElementPlus)

app.mount('#app')
