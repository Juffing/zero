<template>
  <!--  <img alt="Vue logo" src="./assets/logo.png">-->
  <div id="app">
    <Dashboard/>
  </div>
</template>

<script>
import Dashboard from './components/Dashboard.vue'

export default {
  name: 'App',
  components: {
    Dashboard
  }
}
</script>

<style>
#app {
  height: 100%;
  width: 100%;
}
</style>
