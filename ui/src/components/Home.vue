<template>
  <div class="Home" align="center">
    <div class="home-content">
      <div class="index-card"></div>
    </div>
  </div>
</template>

<script>
export default {
  name: "Home"
}
</script>

<style scoped>
.Home{
  height: 100%;
  width: 100%;
}
.home-content{
  height: 100%;
  width: 90%;
  min-width: 1000px;
}
.index-card{
  height: 400px;
  width: 200px;
  border: solid 1px red;
  float: right;
  margin-right: 100px;
}
</style>