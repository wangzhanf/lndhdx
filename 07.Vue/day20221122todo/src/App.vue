<template>
  <div id="app">
<!--    使用组件-->
    <AddNew v-on:pleaseAddItem="okAdd"></AddNew>
    <hr />
    <h2>计划列表</h2>
    <TheList v-on:pleaseMoveItem="okMove" v-bind:sendlist="planList"  v-bind:opttype="false"></TheList>
    <hr />
    <h2>完成列表</h2>
    <TheList v-on:pleaseDelItem="okDel" v-bind:sendlist="completeList" v-bind:opttype="true"></TheList>
  </div>
</template>

<script>
//导入其他组件
import AddNew from  './components/AddNew.vue'
import TheList from './components/TheList.vue'

export default {
  name: 'App',
  components: {
    //注册组件   子组件的标签名:组件名称
    // AddNew:AddNew,
    // TheList:TheList
    AddNew,
    TheList
  },
  data(){
    return {
      planList:[],
      completeList:[]
    };
  }
  ,
  methods:{
    okAdd(recvData){//默认传参
      this.planList.push(recvData);
    },
    okMove(recvIndex){
      this.completeList.unshift(this.planList.splice(recvIndex,1)[0]);
    },
    okDel(recvIndex){
      this.completeList.splice(recvIndex,1);
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
