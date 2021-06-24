<template>
  <div class="Dashboard">
    <Header class="header"></Header>
    <div class="homeRouter">
      <router-view></router-view>
    </div>
  </div>
</template>

<script>
import Header from "./Header"

export default {
  name: 'Dashboard',
  props: {},
  components: {
    Header,
  }
}
</script>

<style scoped>

.Dashboard {
  height: 100%;
  width: 100%;
}

.header {
  position: fixed;
  top: 0;
  z-index: 99;
  width: 100%;
  /*标题的高度*/
  height: 50px;
}

.homeRouter {
  /*高度隔高50px*/
  padding-top: 50px;
  /*设置路由跳转页面的高度*/
  height: calc(100% - 50px);
  width: 100%;
}

</style>
