<template>
  <div id="app">
    <button v-on:click="showMsg">showMsg</button>
  </div>
</template>

<script>
// 根vue实例
export default {
  name: 'App',
  data:function(){
    return {
      msg:'hello'
    }
  },
  components: {
  },
  beforeCreate:function(){
    //仅仅完成了   event和lifecyle   阶段，不能访问实例对象
    console.log("beforeCreate:",this.msg);
    //this.showMsg();
  },
  created:function(){
    //完成了响应式功能，响应式依赖的数据改变，相关的组件都会自动更新
    console.log("Created:",this.msg);
    this.showMsg();
  },
  methods:{
    showMsg:function(){
      console.log("showMsg:",this.msg);
    }
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
