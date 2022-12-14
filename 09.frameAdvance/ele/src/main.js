//main.js    全局入口  ，   在此引入模块可以被全局引用
import Vue from 'vue'
import App from './App.vue'

import {axios} from 'axios';
import qs from 'qs';
import 'font-awesome/css/font-awesome.min.css';
//引入自己创建的包
import {getCurDate,setSessionStorage} from './common.js';

//将导入的第三方库添加到 Vue  的原型链上，以方便调用  
Vue.prototype.$axios = axios;   //在vue实例中通过   this.$axios即可调用
Vue.prototype.$getCurDate = getCurDate;
Vue.prototype.$setSessionStorage = setSessionStorage;
Vue.prototype.$qs = qs;
Vue.config.productionTip = false

// 脚手架给定的默认方式
// new Vue({
//   render: h => h(App),
// }).$mount('#app')

// 手动开发时常用的方式
new Vue({
  el:'#app',
  render: h => h(App),
})