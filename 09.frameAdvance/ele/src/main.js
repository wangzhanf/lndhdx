import Vue from 'vue'
import App from './App.vue'

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