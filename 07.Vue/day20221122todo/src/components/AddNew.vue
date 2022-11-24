<template>
  <div>
    <input type="text" v-model="tempItem" v-on:keyup.enter="addItem" placeholder="要做的事情" />
  </div>
</template>

<script>
export default {
  //子组件的开始
  name: "AddNew",
  data:function(){
    return {
      tempItem:''
    };
  },
  methods:{
    addItem:function(){
      if(this.tempItem.trim()==""){
        return;
      }
      this.$emit('pleaseAddItem',this.tempItem);//发信号给关心你的组件【父组件】
      this.tempItem='';
    }
  }
  //子组件结束
}
</script>

<style scoped>

</style>