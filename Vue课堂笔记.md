# 项目3总结

## 主流应用开发模式：前后端分离

## 后端通过Controller【Servlet】向前端提供数据【JSON】

## 前端通过View【BootStrap+jQuery---（HTML+CSS+Javascript）】，收集数据，AJAX请求，接收数据，渲染数据。



## 分析缺陷

![image-20221114081103968](Vue%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20221114081103968.png)

### 客户端浏览器和服务器交互过于频繁，数据在本地没有有效利用，使用传参或者全局变量【模块】

### 流程化：简化流程



# 前端框架  Vue

## 目的：简化工作，提高效率（虚拟DOM），双向数据绑定





## 简述MVVM

![image-20221114082900506](Vue%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20221114082900506.png)





### Model是数据【javascript】，View是界面  ，   ViewModel协调双方





# Vue

## 是一个js框架，   发音   View    ，  MVVM设计模式

## Vue 学习以 最广泛 的2.x   入手，   再  3.x 新特性。  引入 js   学习， 后期使用  cli   脚手架开发。



# 入门

## 1	安装

https://v2.vuejs.org/js/vue.min.js

## 2	HTML页面中引入

```
<script src="js/vue.min.js"></script>
```

## 3	创建MVVM中的   View  

```
<p class="myView"><!--    代表Vue监听的View区域-->    {{ myName }}</p>
```

## 4	创建   model和viewmodel部分

```javascript
<script>
    adata={//model模型
        myName:"wangzhanf",
        myAge:18
    };
    new Vue({//viewModel
        el:".myView",//监听的view区域，匹配原则  选择器
        data:adata
    });
</script>
```



# 课堂练习：手工编写实现，展现个人基本信息，简单排版，尝试显式照片【9：30】



## {{}}   mustach语法，只能用在 标签内容中    ，属性中使用    v-bind进行绑定，  通过v-model将表单view和model绑定

# 课堂练习：Vue实现手工编写实现展示个人信息，上方输入，下方模板展现。  拓展【原生JavaScript实现】



# 基本语法

|                 | 原生JavaScript                   | jQuery                               |
| --------------- | -------------------------------- | ------------------------------------ |
| v-text          | innerText   属性【左值 或 右值】 | text() getter,  text("con")   setter |
| v-html          | innerHTML                        | html(),html("con")                   |
| v-bind或v-model | value                            | val()                                |



## {{}}   mustach插值语法，仅用于把内容作为普通字符串插入显式。使用v-html注意注入攻击【尽量避免】





# {{}}   v-bind    v-model【v-bind：value】 v-text，v-html





# 属性绑定

## 对HTML的属性进行动态改变

## 使用v-bind指令进行绑定     v-bind:属性名=“model的变量名”

## 使用频繁可以使用缩写模式        :属性名=“model的变量名”

## 绑定多个class时使用布尔属性模式，    视图中使用   {}  对象方式key:value    ,    key代表样式名  ，value代表布尔值，  布尔值为真则key生效



## 绑定多个style时使用对象表示的key：value，key代表 css特性名，  value代表JavaScript变量 指向 css特性值，key如果是   -  连接，  使用驼峰写法改变【font-size   ==》   fontSize  ==>  'font-size'】





# 课堂练习：现有数据

## [

## 	{id:1,name:"zs"},{id:2,name:"ls"}..........

## ]

## 编号为奇数数据显示为红色



# CSS的ABCD优先级算法    1000

## 有行内，A为1

## 有id ，B为1

## 有class和伪类	，C加1

## 有标签和伪元素，  D加1     







# 课堂练习：熟悉动态绑定style

![image-20221114144910876](Vue%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20221114144910876.png)







![image-20221115081147523](Vue%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20221115081147523.png)







# 1	复习JavaScript编程  





# 事件处理

## 某种状态的发生【鼠标，键盘，图片加载，dom就绪，xhr】

## 不同的处理方式【忽略，默认，自定义】

## preventDefault  取消默认行为，   可以给事件处理函数    onXXXX  绑定自己的函数



# 课堂练习：   文本框输入值，当change发生时更新页面内容



# 课堂练习： 菜单展示，点击li输出当前li内容， 点击ul弹出欢迎光临。





# 对象的属性绑定--Vue的监听机制

# Vue事件， 如果调用的函数指明参数，则默认事件函数的第一个事件对象参数失效，可以通过   $event  对事件对象占位 $event 传递

## 通过v-on绑定事件，每个事件都可以使用多个修饰符，事件调用的函数定义在  methods 段， 调用函数可以传参，$event明确传递事件对象本身。





# 条件渲染

## v-if   。。。。    影响的是使用该指令的当前标签容器， DOM元素节点改变。 优势：安全

## v-show,    通过display：none   实现， DOM元素节点不做改动，改变了属性节点  优势： 效率





# 课堂练习：选择身份【学生，教师】，显式不同的操作界面【自己的信息，班级内所有学生的信息】

# 循环-    v-for

## 1	遍历次数    

```html
<li v-bind:data-id="i" v-for="i of 9"> {{ i }} </li>
```

## 2	遍历数组



## 3	遍历对象

![image-20221116083734169](Vue%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20221116083734169.png)







# Vue方法

## 1	都组织在methods段中

## 2	JavaScript方法都是平等的，放在methods便于组织。

## 3	方法可以传参，方法如果没有参数，是否带括号没有区别



# 计算属性

## 1	都组织在computed段中

## 2	计算属性本质上是属性，使用时不能带()

## 3	计算属性拥有getter和setter

## 4	会在依赖的数据改变时调用getter

## 5	给依赖属性赋值调用setter【本质 重载 = 运算符】



# 监听器

## 1	都组织在watch段中

## 2	监听基本类型

## 3	除了基本类型【栈】的复杂类型【堆】必须深度监听【本质，堆中的内容在程序中被认为是地址】

## 4	支持声明式编程和命令式编程

## 5	也可以监听 计算属性  





# 课堂练习：  使用事件监听方式实现购买数量最小为1  ，最大为 99 ，   当总金额大于100时减去10元并弹框提醒。



# 课堂练习：完成新增功能



# 过滤器

## 

![image-20221117140801652](Vue%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20221117140801652.png)

## 类似于操作系统的   管道   操作：     |   



## 过滤器分全局过滤器和本地过滤器，   通用工具类  。

![image-20221117141541800](Vue%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20221117141541800.png)

## 使用过滤器时：功能过滤器在前，修饰过滤器在后











# 组件

## 可复用的部分

## 分为局部组件和全局组件【高度抽象】



![image-20221118102814652](Vue%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20221118102814652.png)

应用就是组件套组件，组件树

![image-20221118103113289](Vue%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20221118103113289.png)





# Vue调试工具   vue-devtools 调试工具



## 1	使用vue的开发版，不能是压缩版     

## 2	打开chrome的开发者模式     ，拖拽  插件  到浏览器即可

## 3	重启浏览器

## 4	打开浏览器调试工具 





# 父给子  传递信息

## 1	使用子组件时通过属性传递   

```html
<son 属性名="需要传递的信息"></son>
```

## 2	子声明使用父传递的属性

```javascript
props：['属性名']
```

## 3	子使用属性

和普通data数据相同



# 子给父 传递信息

## 自定义事件event触发trigger机制，emit

## 1	父在使用子组件时，子标签中绑定 自定义事件  

```html
<soncomponent v-on:事件名称="事件回调函数"></soncomponent>
```

## 2	自定义事件的回调函数

```javascript
methods:{
    事件回调函数:function(接收数据的参数列表......){
        
    }
}
```



## 2	子组件在合适的时机发送信号

```javascript
this.$emit("事件名称",传递的数据.......);
```



# 20221121上课回顾

## 1	Vue由可复用组件构成的

## 2	组件分为   根组件，父组件，子组件

## 3	父传子，子通过props声明接收

## 4	子传父，自定义事件触发模式









# 课堂练习：使用根组件实现   todoList功能   

# ![image-20221121090733227](Vue%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20221121090733227.png)





# Vue路由

## 路由就是路径选择，Vue是前端框架，做前端路由

## @WebServlet(urlParttern="/xx.do")  , Servlet的Controller，   Controller做后端路由的

## Vue的路由做出单页应用（SPA：single page  application），只有一个index.html页面  ， 使用路由切换不同的组件的展示





# 课堂练习：完成基本路由导航



## 默认路由索引类似网站的默认索引页（index  ,    default页面），默认索引指定默认组件

## 路由守卫【先自学】

# 课堂练习：完成路由嵌套和默认路由，参照微信布局





# 课堂练习：  实现通过parmas  实现传参







![image-20221121141211249](Vue%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20221121141211249.png)

