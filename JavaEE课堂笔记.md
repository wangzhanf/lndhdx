# 强调：周日提交JavaSE项目

# JavaWeb

# Java的版本

## 1	JavaME：Java微小版，嵌入式

## 2	JavaSE：Java 标准版，语言特性

## 3	JavaEE：Java企业版，Enterprise ， SE的基础上添加了API，最重要的就是web相关的API。



# 1	 **Web应用基础** 

## 1.1	架构模式----Client/Server

![image-20221026081659407](JavaEE%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20221026081659407.png)

## 1.2	架构模式----Browser/Server

![image-20221026082153606](JavaEE%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20221026082153606.png)





## 1.3	Web的工作机制

![image-20221026083735725](JavaEE%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20221026083735725.png)



## 1.4	创建第一个JavaEE项目

### 推荐使用idea管理开发，推荐使用maven构建和编译。

![image-20221026084903990](JavaEE%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20221026084903990.png)



### 推荐每天创建一个Module组织项目

![image-20221026085926209](JavaEE%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20221026085926209.png)





## 1.5	idea下配置tomcat

![image-20221026092437361](JavaEE%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20221026092437361.png)

### idea配置tomcat并发布 web应用【module或project】

![image-20221026092804645](JavaEE%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20221026092804645.png)

![image-20221026093026720](JavaEE%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20221026093026720.png)





![image-20221026094035647](JavaEE%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20221026094035647.png)



![image-20221026094528014](JavaEE%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20221026094528014.png)



![image-20221026094823701](JavaEE%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20221026094823701.png)



## 1.6	JavaEE项目的标准结构

![image-20221026104428399](JavaEE%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20221026104428399.png)









# 2	Servlet

## javaSE基础上扩展出来的包，典型就是   Servlet  ，Servlet包不属于JDK

## 编程中客户端脚本程序叫   scriptless    ,通常叫  script，   服务器端脚本程序   servless   ,   Java中叫 servlet   



## Servlet封装好的接口由 Servlet包提供的。该包可以选择导入到项目中，也可以使用WEB容器【Tomcat 内置了servlet包】提供的包

## 2.1	导入servlet包，修改pom.xml

如何找到依赖包：  

1	maven的官网： https://search.maven.org/

2	阿里的镜像

```xml
<dependencies>
    <dependency>
        <groupId>javax.servlet</groupId>
        <artifactId>javax.servlet-api</artifactId>
        <version>4.0.1</version>
        <!--    scope :  包影响的范围
    test    仅在测试时生效
    complie 编译和测试时都生效，会随项目发布而发布
    provided 开发时生效，但是不会发布，运行环境会提供该包副本 servlet
           -->
        <scope>provided</scope>
    </dependency>
</dependencies>
```



## 2.2	第一个Servlet

## Servlet 本质上就是 特殊的java程序，【jsp本质上就是一个Servlet】，Servlet默认可以处理HTTP等网络请求

![image-20221026113113115](JavaEE%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20221026113113115.png)



## 2.3	Servlet概念

### ![image-20221026114132747](JavaEE%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20221026114132747.png)

## 2.4	手写一个Servlet

Servlet的工作流程

#### 1	继承链    Servlet    》    GenericServlet   》   HttpServlet         》    用户自己的Servlet

#### 2	为了能够接受用户的HTTP特定方法请求， 覆写HttpServlet提供的方法

#### 3	HttpServlet提供的方法接口中，有  HttpServletRequest   负责封装客户所有的请求，   

#### 4	HttpServletResponse负责封装响应给客户的内容。

#### 5	由web容器完成URL地址到Servlet类的映射【后端路由】，修改站点的web.xml  , Servlet3.0开始，可以在类上使用  @WebServlet 取代  xml文件的配置





![image-20221026132038942](JavaEE%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20221026132038942.png)

![image-20221026132437608](JavaEE%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20221026132437608.png)



## 课堂练习：模拟网页表单用户登录，用户名zs和密码123返回成功。





# 3	Servlet声明周期

从生到死，不同阶段做不同的事

## 出生   ---     学习    ---     工作     ---     养老      ----    入土

## 1	出生：Servlet进程【单进程】，默认情况  用户访问URL时创建

## 2	派生一个子进程给用户提供服务

### 2.1		init，初始化阶段，执行1次

### 2.2		通过service调用get和post等处理，执行多次

### 2.2		destroy，销毁阶段，执行1次

## 3	结束时销毁派生的子进程



# 课堂练习： 仿照实现ELE后台网页登录【挂数据库】







# 上课回顾20221027

## 通过java实现服务器端web编程【动态页面】





# 4	Servlet定位

## 4.1	一般将Servlet定位为用户访问控制的门面，叫做   controller ，   完整的web应用体系   

![image-20221027084156735](JavaEE%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20221027084156735.png)



![image-20221027085322425](JavaEE%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20221027085322425.png)



## 4.2	loadOnStartup

### 一般做站点初始化的Servlet配置该项， 缺点是持续占用资源









### 课堂练习：  验证urlPatterns，loadOnstartup选项的作用。 



# 5	中文乱码问题

## 5.1	客户端网页【.html .jsp    产生的乱码】，浏览器引发，通过  <meta 标签指定编码

## 5.2	请求产生的乱码【将请求数据封装在HttpServletRequest  产生乱码】，调用HttpServletRequest 对象的  setCharacterEncoding方法，最早调用

## 5.3	响应产生的乱码【将响应数据封装在HttpServletResponse  产生乱码】调用HttpServletResponse 对象的  setCharacterEncoding方法，响应前调用，  还需要关注响应的内容是什么

# 课堂练习：  实现添加一个食品到现有数据库中



# 6	返回JSON

## 当下开发的基本模式是  完全的  前后端分离   ，  中间通过标准数据通信即可（JSON） 

![image-20221027113259215](JavaEE%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20221027113259215.png)

## 服务器需要的必要条件

### 1	设置MIME类型为JSON

### 2	将java对象序列化为JSON对象【JSON的字符串对象】

添加依赖

```xml

<dependency>
    <groupId>com.fasterxml.jackson.core</groupId>
    <artifactId>jackson-databind</artifactId>
    <version>2.10.0</version>
</dependency>
```



# 7	实现Food的增删改查

![image-20221027131557445](JavaEE%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20221027131557445.png)



![image-20221028082941487](JavaEE%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20221028082941487.png)





# 8	跨域问题

## 正常请求Servlet时，URL正确访问正常，当通过JavaScript的异步请求URL时，浏览器安全策略默认不允许访问自己站点之外的数据【CROSS】

## 跨域概念

![image-20221028101003415](JavaEE%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20221028101003415.png)



产生     Referrer Policy: strict-origin-when-cross-origin



## 解决方案：

### 1	浏览器设置，在chrome浏览器快捷方式后粘贴该代码

###  --disable-web-security --user-data-dir=c:\MyChromeUserData

优势：开发时常用

### 2	服务器通过设置响应头，允许客户端跨域

#### resp.setHeader("Access-Control-Allow-Origin", "*"); 

优势：客户端无需处理，需要所有的Servlet都添加此代码



### 3	jsonp解决跨域



### 课堂练习：将项目拆分为前后端分离，idea编写后端，webStorm编写前端， 设置浏览器允许跨域【10：45】   

# 



# 8	后端返回前端数据的标准格式

## 1	仅关注返回是否正确，标识表示   类似  404和200

## 2	返回的数据应该是没有限制的，弹性增长的

## 3	方便组装，static 

## 4	需要第三方包进行序列化，所以需要提供getter和setter







# 课堂练习： 实现自己的MessageAndData ， 通过后端 封装  MessageAndData标准包，前端获取并解析【13：37】



# 9	会话跟踪

## 9.1	会话：一个**”浏览器“**从打开到关闭之间访问服务器的过程。

## 9.2	为什么需要会话：因为HTTP是无状态协议，为了确保 最简单的     请求-响应    模式

## 9.3	如何解决

### 9.3.1	隐藏表单域【用户看不到，每次请求服务器携带表单数据】

### 9.3.2	URL重写【数据携带在URL地址后】

### 9.3.3	Session 服务器端保持会话技术

### 9.3.4	Cookie 客户端保持会话技术





![image-20221028142044201](JavaEE%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20221028142044201.png)





# 上课回顾

## POM管理模式，配置文件  pom.xml   ,项目为节点组成树型结构，构建了父子关系【继承，打包方式决定了POM的类型--{pom，war，jar}】

## HTTP协议是无状态协议，服务器端使用session，客户端使用cookie，   通过SSIONID识别





# Servlet其实就是实现了XXXServlet接口或抽象类的java程序，jsp【Java Server Pages】就是一个Servlet

### Web编程，一般有 9大对象，包括request，response，session等，通过request都可以获得。

### Web编程，存在4大作用域，Application【ServletContext】，Session，Page，Request





# JSP

## <%%>			写java代码

## <%= %>		输出指令

## < %@  %>	导入包等java指令





# 课堂练习：实现登录和登出【9：40】



# Web（Servlet）的跳转



![image-20221031100244237](JavaEE%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20221031100244237.png)



![image-20221031101222506](JavaEE%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20221031101222506.png)

# Servlet，jsp  地址问题

## 1	Servlet中的地址   以   /  代表   应用的根目录



![image-20221031110226138](JavaEE%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20221031110226138.png)

![image-20221031110305580](JavaEE%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20221031110305580.png)

## 2	jsp和HTML中的地址    以  / 代表     站点的根目录

![image-20221031110414779](JavaEE%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20221031110414779.png)



## 3	解决办法， 使用绝对路径实现地址通用，引发应用的地址根据发布改变。可以通过





# JavaEE三大组件

## 1	Servlet	服务

## 2	Filter	过滤器

## 3	Listener	监听器



# Filter 过滤器

![image-20221031131143599](JavaEE%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20221031131143599.png)

## 1	过滤器一般只过滤对动态资源的访问

## 2	过滤器的方法结束一般都是 阻断访问【return

##  false】或者将封装对象继续插入到过滤器链继续处理。



## 在面向对象程序设计中， 加强某个功能，采取的方法有【1、继承类，2、实现接口，3、持有对象】





# 上课回顾20221101

## 1	转发和重定向【目的：跳转】

|          | 重定向              | 转发                                      |
| -------- | ------------------- | ----------------------------------------- |
| 请求数量 | 2                   | 1                                         |
| 对象控制 | HttpServletResponse | HttpServletRequest                        |
| 方法     | sendRedirect()      | DispacerServlet.forward()                 |
| 携带数据 | 需要重新携带数据    | 带着Request对象转发                       |
| URL限制  | 可以是外部          | 只能发生在内部，可以转发到WEB-INF安全目录 |



## 2	JavaEE的3大组件

### Filter	是不是Servlet？   是

### 特殊的Servlet，  通过路径匹配决定是否拦截，处理request对象和response对象之后放行 或  截断。

### Filter主要应用场景：字符编码，跨域，登录验证





# Listener组件，监听器组件

## Listerner也是一个特殊的Servlet

## 本质上就是事件，【某种状态改变，事件产生之后一般处理措施（忽略，默认处理，自定义处理函数 JavaScript用  onXXX）】

## JavaWeb编程中的事件主要是服务器9大对象的状态。

## Servlet监听器采用类似观察者模式实现对事件的监听。

## 常见监听器： servletContextListener【Application】，SessionListener ，RequestListener

![image-20221101083833735](JavaEE%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20221101083833735.png)



## 监听器主要监听对象的创建和销毁以及属性改变，自动触发【事件产生后自动调用】，无需路径映射



## 监听器主要是运维人员使用较多，记录日志





# MVC设计模式

## 1	复用级别

### 1.1	代码复用（函数和方法的封装）

### 1.2	算法复用（逻辑思想）	

### 1.3	设计模式（套路，单例模式，观察者模式   ，   GOF 23种设计模式）

### 1.4	架构模式（分层架构，黑板风格）



## 2	MVC

### M-Model【模型】    ，协调数据传递，		代表  实体类  POJO/Entry

### V-View【视图】，展示，提供用户和系统交互接口  ，代表    jsp/html

### C-Controller【控制器】，负责流程流转，组装结果， 代表    Servlet

![image-20221101103918936](JavaEE%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20221101103918936.png)





# MVC项目实战

## 1	创建项目并导入相关依赖包

```xml
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/maven-v4_0_0.xsd">
    <parent>
        <artifactId>JavaEE</artifactId>
        <groupId>vip.epss</groupId>
        <version>1.0-SNAPSHOT</version>
    </parent>
    <modelVersion>4.0.0</modelVersion>
    <artifactId>day20221101mvc</artifactId>
    <packaging>war</packaging>
    <name>day20221101mvc Maven Webapp</name>
    <url>http://maven.apache.org</url>

    <properties>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
        <maven.compiler.source>11</maven.compiler.source>
        <maven.compiler.target>11</maven.compiler.target>
    </properties>

    <dependencies>
<!--        数据库-->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.21</version>
        </dependency>
<!--        servlet-->
        <dependency>
            <groupId>javax.servlet</groupId>
            <artifactId>javax.servlet-api</artifactId>
            <version>4.0.1</version>
        </dependency>
<!--        转换为JSON-->
        <dependency>
            <groupId>com.fasterxml.jackson.core</groupId>
            <artifactId>jackson-databind</artifactId>
            <version>2.10.0</version>
        </dependency>
<!--        单元测试-->
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.13</version>
            <scope>compile</scope>
        </dependency>
    </dependencies>
    <build>
        <finalName>day20221101mvc</finalName>
    </build>
</project>

```



## 2	构建项目目录

### 2.1	后端结构

![image-20221101105905186](JavaEE%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20221101105905186.png)



### 2.2	前端结构

![image-20221101110258834](JavaEE%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20221101110258834.png)





## 3	单独开启后端和前端项目基础测试

![image-20221101110555498](JavaEE%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20221101110555498.png)



![image-20221101110632951](JavaEE%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20221101110632951.png)



## 4	规划基本功能

![image-20221101112514656](JavaEE%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20221101112514656.png)

后端至少需要提供 增删改查，     首先提供   列表功能



## 5	实现Servlet【列表】



## 6	实现Filter

# 

## 7	实现View

## VIew负责提供用户接口，负责向Controller发AJAX请求，负责将Controller返回的Model转换的JSON渲染。

## 本次使用：   BootStrap + jQuery + 字体库

### 本地导入和CDN区别：开发过程建议本地导入，IDE工具有提示，   运营时建议CDN方式。

### 前端开发过程：需要组件查阅BootStrap资料，复制粘贴， jQuery需要独立学习编程模式，查阅调用。











# jQuery

## 1	什么是jQuery ： 简化JavaScript编程的库。库实现了多终端兼容和链式编程。

## 2	jQuery目标：写得更少，做得更多

## 3	jQuery语法

### jQuery是JavaScript库， 被封装的JavaScript代码，可以和原生JavaScript混用。

### jQuery被封装为jQuery对象，通过全局函数 jQuery()  展现，可以使用别名   $() 

### 语法构成：    $(css选择器).方法1().方法2()....................................    支持链式编程，但不是所有的方法都支持链式

|            | window.onload        | $(document).ready(callback) |
| ---------- | -------------------- | --------------------------- |
| 来源       | 原生JavaScript       | jQuery                      |
| 是否可多次 | 不可以               | 可以                        |
| 对象       | 全局global，  window | DOM，document               |
| 简写       | 不支持               | $(callback);                |

![image-20221102095424227](JavaEE%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20221102095424227.png)

### 和toggle有关的方法都是在两种状态之间切换

### 通常前端编程中存在各种事件（状态改变）， click，keyup等 ，原生JavaScript通过 给对象的  事件处理函数onclick，onkeyup  赋值（绑定），jQuery实现了对应的事件函数  click()   ,keyup()   ,可以传递回调函数作为处理函数

### 如果元素是动态增加的，如何绑定事件，原生JavaScript通过事件委托方式实现，   jQuery 的  on方法就是事件委托函数。

# 课堂练习：点击某个按钮，给< ul>添加一个  li   ,   每点击每个  li，让当前点击的li   变色 后消失





## 1	jQuery对DOM的操作

### 父对象调用：   append,prepend,before,after

### 子对象调用：   appendTo,prependTo,insertBefore,insertAfter



## 2	原生JavaScript对象和jQuery转换

### jQuery对部分原生方法未提供，原生对象需要使用jQuery方法

### 原生  --》  jQuery的转换：      $(原生对象)   

### jQuery  --》  原生的转换：      $() .get(0)     







# jQuery的AJAX实现



![image-20221102131405390](JavaEE%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20221102131405390.png)



## jQuery实现AJAX

### load（）方法， 和原生JavaScript没有区别

## ajax方法（），属于jQuery对象方法，    携带1个对象参数，选项通过 key-value表示

## get（）方法和post()方法简化访问

![image-20221102134845087](JavaEE%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20221102134845087.png)





# 课堂实现：   通过ajax方法访问servlet获取所有的商家数据  



## jQuery方法

|          | 原生JavaScript的属性 | jQuery |
| -------- | -------------------- | ------ |
| HTML代码 | innerHTML            | html() |
| 纯文本   | innerText            | text() |
| 表单值   | value                | val()  |

#### jQuery中一般的方法都具有  getter和setter能力   ，   text()   获取getter，    text("内容")  设置setter   ， 对于attr，   attr("属性名")  是getter    ， attr("属性名"，“属性值”)  是 setter

### jQuery删除方法：     empty()清空当前对象的子对象，remove() 删除当前对象和子对象    

# 预习：DOM和虚拟DOM







# HTML属性

## 1	通用属性： 所有标签都能使用的属性，   id   class   title

## 2	受限属性：部分标签可用   ，    href属性  只能用在a和link标签

## 3	布尔属性：值只能是true和false，值不为空则为true，建议：  readonly="readonly"  

## 4	自定以属性： 建议   data-     开头







# jQuery中attr()，   prop()对比

## attr()可以操作所有属性， 修改DOM结构

## prop()主要操作布尔属性，修改发生在浏览器，效率高







# 分页逻辑

![image-20221104143530605](JavaEE%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20221104143530605.png)



# 作为前端，必须知道的内容：  总记录数 ，必须传递给后端  页码数+每页记录数











# 上传文件

## 常用HTTP方法

### 1	GET： 获取，幂等，优势可以在URL地址后携带数据，小于512字节

### 2	POST：单独打HTTP包，可以发送大型数据，字符数据和二进制数据分离。

## 上传文件： 1	分段 【分离普通表单的字符数据和文件表单的二进制数据】   ， 前端通过   form的属性分离   ，2	服务器端获取二进制数据写入【临时文件】持久化设备【磁盘或数据库】 返回地址给应用。

## 步骤

### 1	导入包

![image-20221108095311162](JavaEE%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20221108095311162.png)

### 2	创建上传表单

```html
<form method="post" action="up.do" enctype="multipart/form-data">
    <input type="file" name="avatar" />
    <input  type="submit" value="up" />
</form>
```



### 3	编写上传Servlet





# 验证码：

## 

![image-20221108143701453](JavaEE%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20221108143701453.png)

## 实现验证码，  服务器程序必须具备 ，  文件操作的能力，  访问session能力。  浏览器中验证码的源文件地址就是  servlet的地址    < img  src="http://localhost:7777/day20221101mvc/vcode.do"/>

























