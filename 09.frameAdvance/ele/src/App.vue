<template>
  <div id="app">
    <!-- 最好这个组件本身什么内容都不渲染，存在的意义就是组织其他组件 -->
    {{ msg }}
    <button v-on:click="showMsg">showMsg</button>
    <!-- 页面加载时自动请求远端数据渲染到页面中 -->
    <ul>
      <li v-for="(item,index) in blists" v-bind:key="index">
        <i class="fa fa-car"></i>  {{ index }} -- {{ item.bid }} -- {{ item.businessName}} -- {{ item.businessArress }}
      </li>
    </ul>
  </div>
</template>

<script>
//导入模块
import axios from 'axios';    //js库
//import qs from 'qs';          //js库
import 'font-awesome/css/font-awesome.min.css' //css库

// 根vue实例
export default {
  name: 'App',
  data:function(){
    return {
      msg:'hello',
      blists:[
        {
          bid: 1,
          businessName: '炒饼',
          businessArress: '1楼东侧'
        },
        {
          bid: 2,
          businessName: '麻辣香锅',
          businessArress: '2楼西侧'
        }
      ]
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
  beforeMount:function(){
    //this对象会随着程序的调用发生改变，一般是 当前vue实例  ，或者全局对象  window
    //建议进入函数保存this以方便调用
    let that = this;
    this.msg = "new content";
    console.log("beforeMount:",this.msg);
    //异步请求获得数据更新   blists
    axios.get('http://localhost:140/businesses').
    then(function(res){
      console.log(res);
      console.log("that",that);
      console.log("blists",that.blists);
      that.blists = res.data.dataZone.list;
      console.log("blists",that.blists);
      console.log("blists",res.data.dataZone.list);
    }).
    catch(function(d){
      console.log(d);
    });

  },
  mounted:function(){
    //类似于document.ready   ， 浏览器准备展示
    //请求网络数据
    console.log("mounted:",this.msg);
  },
  beforeUpdate:function(){
    //数据改变，依赖于该数据的部分， 数据检查
    console.log("beforeUpdate:",this.msg);
  },
  updated:function(){
    //虚拟DOM构建完毕，通过DIFF算法和真实DOM对比，重新render渲染
    console.log("updated:",this.msg);
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
