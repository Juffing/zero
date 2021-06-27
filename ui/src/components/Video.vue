<template>
  <div class="Video">
    <el-button type="text" @click="addCodeVisible = true">点击打开 Dialog</el-button>
    <el-dialog title="提示" v-model="addCodeVisible" width="400px" :before-close="handleClose" :close-on-click-modal="false">
      <div>
        <el-form ref="form" :model="addCodeForm" label-width="80px" size="mini">
          <el-form-item label="番号：">
            <el-input v-model="addCodeForm.code"></el-input>
          </el-form-item>
          <el-form-item label="名称：">
            <el-input v-model="addCodeForm.name"></el-input>
          </el-form-item>
          <el-form-item label="描述：">
            <el-input v-model="addCodeForm.descp"></el-input>
          </el-form-item>
          <el-form-item size="large">
            <el-button @click="handleClose">取消</el-button>
            <el-button type="primary" @click="onSubmit">提交</el-button>
          </el-form-item>
        </el-form>
      </div>
    </el-dialog>
  </div>
</template>

<script>
export default {
  name: "Video",
  data() {
    return {
      addCodeVisible: false,
      addCodeForm: {
        code: '',
        name: '',
        descp: '',
      },
    };
  },
  methods: {
    handleClose() {
      this.addCodeVisible = false;
      this.addCodeForm = {
        code: '',
        name: '',
        descp: '',
      }
    },
    onSubmit() {
      this.$axios.post(this.$url + '/backend/code', {
        'code':this.addCodeForm.code,
        'name':this.addCodeForm.name,
        'descp':this.addCodeForm.descp
      })
      .then((response) => {
        if (response.data.code == 200) {
          this.addCodeVisible = false;
        }
        console.log(response)
      })
    },
  }
}
</script>

<style scoped>
.Video >>> .el-dialog .el-dialog__header{
  background-color: aquamarine;
  padding: 2px 10px;
}
.Video >>> .el-dialog .el-dialog__header .el-dialog__title{
  font-size: 16px;
  font-weight: 600;
}
.Video >>> .el-dialog .el-dialog__header .el-dialog__headerbtn{
  top: 6px;
  right: 10px;
}
.Video >>> .el-dialog .el-dialog__header .el-dialog__headerbtn .el-dialog__close {
  font-weight: 600;
  color: #303133;
}
</style>