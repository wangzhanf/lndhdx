# 后端编程【服务器编程】--前端编程【客户端编程】

# 后端编程语言

C++，C，python，Go，Java   ， PHP

## 选择Java的原因

目前Javascript是一统前端编程语言，后端web服务器应用编程 Java 占统治地位。

## Java优势

![image-20220927085153054](Java%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20220927085153054.png)

跨平台，生态系统完善（成熟框架和库  spring）

## 学习资料

1	课堂笔记和代码【gitHub】

2	课程录像【钉钉共享文件】

3	课件，在线方式    https://www.yuque.com/books/share/c49f80dd-cc64-43d2-862f-cd4aa2a339a1/fkigca



# Java基础

## java发展：嵌入式芯片控制【初衷】----》  WEB服务器编程首选

## 版本：1.X    发展到  1.5的时候因为变动较大，称为   5.0   ，  到8.0时提出LTS【长期支持版（5年维护）】，一般间隔3个号的版本都是长期支持版，【5.0，8.0，11，14】都属于长期支持版，本次课程选择11版。

## 提醒：java和JavaScript没有一丝关系（当时JavaScript为了蹭java的流量而已）

## Java语言版本： 

### 1	Java SE：语言基础，标准版

### 2	Java ME：精简，嵌入式设备，缩微版

### 3	Java EE：WEB服务器开发，企业版





## 搭建开发平台

### 需要：1	IDE开发环境， 2	JDK开发工具包

#### 课堂练习： 打开钉钉文件共享，下载 解压到非中文和特殊字符的目录 

![image-20220927091639765](Java%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20220927091639765.png)

![image-20220927092014764](Java%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20220927092014764.png)

### 使用集成开发环境   IDE 加速工作，选择  IntelliJ IDEA   ，不要使用破解版【用不同账号开启 30  天试用】 ，  和webStorm同一个体系。仅是一个编辑器

#### JDK作用

![image-20220927103041858](Java%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20220927103041858.png)

# 使用idea集成jdk进行开发

## 1	使用idea创建一个项目（Project -- 工作区--workspace），可以由多个单元组成（Module -- 子项目）

![image-20220927103634825](Java%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20220927103634825.png)

![image-20220927104302100](Java%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20220927104302100.png)



![image-20220927104859948](Java%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20220927104859948.png)



## 2	创建不同的Module管理代码

![image-20220927105327855](Java%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20220927105327855.png)



## 3	编写第一个java程序

在Module下创建   java 源程序文件  【后缀  .java  】

![image-20220927105708858](Java%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20220927105708858.png)



![image-20220927105947729](Java%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20220927105947729.png)

![image-20220927110714612](Java%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20220927110714612.png)

## 4	运行文件

![image-20220927111049218](Java%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20220927111049218.png)

![image-20220927111411047](Java%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20220927111411047.png)



## 课堂练习：创建自己的第一个java程序，控制台输出自己的姓名

# 注释

注释是对代码的解释，方便未来的自己查看。

不要过度注释。

注释是文档的一部分【可以根据注释形成软件的说明书】

## 注释类型

1	单行注释	//注释内容

2	块注释		/\**注释内容*\*/		主要用于调试代码

3	文档注释     主要用于修饰类和方法，可以使用  @修饰符      ，  可以通过工具【javadoc】 自动生成HTML格式的帮助文件

```java
/**
	注释内容，
*/
```



# 空白符

在java中， 和HTML以及Javascript不同，  空白符号 只用于源代码的组织【层次感】，每条语句结束都    **必须**   使用   " ; " 结束 。

HTML中，多个空白字符会被压缩为1个空白字符

当java编译器编译为字节码时， 所有的注释和空白字符都被删除。



课堂练习：  13：03		提交答案   





# 变量

量：计算机中的一个值，存储于内存中，占用内存中空间

字面量：仅用于表示自己，不代表其他。 一般用作表达式中或者   赋值符号的右侧

```java
a = 123;   //123就是字面量
```

变量：内存中的空间的名字【仅为了让程序员容易理解】

常量：变量的特例， 不变的变量称之为常量

变量赋值

```java
类型名    变量名 = 值;
int		age = 18;
[ | let | var | const]  变量名  = 值 ;  //javascript
```





# 数据类型

![image-20220927142411140](Java%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20220927142411140.png)

数据类型的本质就是数据的**抽象**描述，包括了  数据如何存储，  数据如何表示   ，数据如何读取    

JavaScript【基本：null,undefined,布尔，数值，字符串，    对象：其他（数组，函数，对象）】

## Java中的数据类型

Java是强类型语言【JavaScript是弱类型语言】，  声明的类型一般不能转换

### 1	基本类型

有符号的数据类型：最小值 -1   变成最大值，     最大值  + 1  变成最小值

![image-20220927150357550](Java%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20220927150357550.png)

```java
//1 基本类型
        char firstName = '张';//char类型表示一个字符，character，占2字节， 字符类型使用  单引号
        boolean gender = false;//boolean代表布尔类型，true和false，占1字节。
//        byte b1 = 128;//byte占 1个字节 ，11111111（-128）   ~   0 1111111（127）   ，
        //java是强类型语言，数值类型是有符号【最左侧为1代表负，0代表正】
        //如果数值字面量没有修饰，默认类型    int   ， double
        byte b1 = (byte)144;//byte占 1个字节 ，1 1111111（-128）   ~   0 1111111（127）   ，
        System.out.println(b1);
//        short s1 = 32767;
        short s1 = (short)32768;//short  占2个字节
        System.out.println(s1);

        int i1 = (1<<31) -1;//int占4个字节，默认的整数类型
        System.out.println(i1);

        long l1 = (1<<63);//long 占8个字节
        System.out.println(l1);

        //如果数值字面量没有修饰，默认类型    int   ， double
        float f1 = 3.14F;//float占4个字节，
        System.out.println(f1);

        double d1 = 3.14;//double占8个字节
        System.out.println(d1);
```



### 类型转换

1	隐式的自动类型转换

byte  b1 = 99;   99是默认的整数int，   99属于byte可以表示的范围，此时发生隐式类型转换【小脚放在大鞋】

2	显式的强制类型转换

byte b1 = (新类型名)144; 144是int类型， 通过(byte)将int强转为 byte类型，可能发生数据精度丢失【大脚放在小鞋】

![image-20220927152833756](Java%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20220927152833756.png)



# 课堂练习：练习基本类型的使用，输入个人信息【使用合适的类型去表示】，要求将  8  种基本类型都涉及到【幸运字母char，性别boolean，年龄byte，存活天数short，存活秒数int，数字方式表示手机号码long，近视度float，虚拟体重double】代码和结果截图【16：05】



### 2	引用类型

对象类型，复合类型，由基本类型或者其他对象类型组转的新类型

除了8种基本类型之外的都是引用类型，常见的引用类型 String  表示字符串。

通常引用类型都是通过   new   运算符调用构造函数产生的。

java中， 8种基本类型违反了面向对象思维方式，提出了**包装类**的概念，对8种基本类型能够实现面向对象的封装，8种对应的包装类型    ，使用过程中会自动封装和解包

```java
parseInt(1.23) //典型的面向过程思路
num.parseInt()  //面向对象的思路             ，   iArr.sort()   
```

| 基本类型 | 包装类型      |      |
| -------- | ------------- | ---- |
| boolean  | Boolean       |      |
| char     | **Character** |      |
| byte     | Byte          |      |
| short    | Short         |      |
| int      | **Integer**   |      |
| long     | Long          |      |
| float    | Float         |      |
| double   | Double        |      |





# 运算符



# 课堂练习：【10.15】 7道单选



A	A	D  D  A  B  B



# 课堂练习：【10：50】

![image-20220928103852742](Java%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20220928103852742.png)



# 流程控制

## 分类：

### 1	顺序执行，代码自上而下依次执行【异步程序例外】

### 2	选择分支

#### 2.1	单分支：   if

#### 2.2	双分支：   if.....else....

#### 2.3	多分支：   if...else if....else  if ....else......     每个else和紧邻的上一个if配对

![image-20220928111716099](Java%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20220928111716099.png)

适合于阶段型判断   ，   点判断建议使用switch

#### 2.4	多分支：switch    表达式建议采用可枚举的量【可以转换为整数的量】

switch分支中没有break， 则进入某一分支之后，所有后续分支都将被认为是顺序语句执行，直到遇到break跳出

### 3	循环

#### 3.1	基本循环，使用重复指令【for，while】

## 4	跳转结构

#### 4.1	continue	停止当前循环进入下一次循环

#### 4.2	break	停止当前循环，跳出循环体或者switch块

#### 4.3	return	退出当前函数，return之后的代码都不会被执行



## 课堂练习：存在一个温度数字，确保在   -45 到  45度之间，  每下降10度，添加一份棉衣。  最后输出 棉衣数量



将问题域  转换   到   计算机域    ， 图示表示方法  **N-S** 图    ， 理解 任何复杂的问题都可以转换为双分支的判断模式

![image-20220928134219102](Java%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20220928134219102.png)







# 课堂练习： java实现，   在控制台  输出一个 乘法表    ，  倒三角形式   ，  实现 for   和while的双版本【14：35】





# 数组

放置多个**同样类型**的数据的**顺序**数据结构， 引用类型（拥有数组类或对象的属性和方法）



```
3.1   数组未被明显初始化的部分都会使用默认值初始化
3.2	  数组定义时长度可以使用变量【和C体系不同】
3.3	  数组访问时超过定义时的范围则抛出异常   ArrayIndexOutOfBoundsException数组越界异常
3.4	  数组是引用对象之一，数组存储的数据调用时先判断是否是null，否则会产生NullPointerException空指针异常
3.5	  如果想让数组保存不同类型的数据【不建议】，数组类型选择需要存放类型的泛化类型【共同祖宗类型】，在java世界中  Object  是所有类的祖宗
```

| 数组类型               | 默认值 |                            |
| ---------------------- | ------ | -------------------------- |
| boolean                | false  |                            |
| char                   | '\0'   |                            |
| byte，short，int，long | 0      |                            |
| float，double          | 0.0    |                            |
| 引用类型               | null   | String不是js中的默认值  ”“ |



![image-20220928155730790](Java%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20220928155730790.png)



# 课堂练习： 数组应用例题。【16：25】

假设队列中共有500人，每次从1开始数，数到3的人出队，下一个人接着从1开始数，编写程序找到最后剩下的人是哪一个。









# 学习计算机

## 1	勤于动手【give Me the  code-----代码落地】

## 2	大处着眼，小处着手

## 3	使用，底层原理，螺旋式渐进





# 数组

JavaScript： arr.push()   arr.splice()    arr.sort()     ，不会越界

Java:   同类型，数组会越界【内存模型】



算法【思维方式】



## 数组的操作

![image-20220929090033233](Java%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20220929090033233.png)







# 课堂练习：创建两个数组 src和dst  ，  使用传统的for将src的所有元素复制到dst，    使用arrayCopy将src所有元素复制到dst， 理解不同点。【9：30】



数组的操作主要使用Arrays，Arrays提供了对数组操作的很多方法 ，为了方便使用， 这些方法都采用了static修饰，代表该内容是长久保留的，可以不创建对应对象直接可以调用的。静态方法有点违反面向对象设计原则，主要用于一些工具类的方法修饰。调用方式    工具类名.方法名

![image-20220929100011600](Java%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20220929100011600.png)



![image-20220929102609763](Java%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20220929102609763.png)



# 









# 方法

什么是方法【method - 面向对象】：也称之为函数【function - 面向过程】，也称之为过程【process--科学计算】。

方法作用：封装可重复使用的代码（复用）

方法在定义时，可以通过形参制定调用方法时传递的基础数据，可以将方法的结果通过 返回值返回给调用者，方法调用时开辟方法的栈帧，方法调用结束方法的栈帧即销毁（方法内定义的变量也将被销毁--除了static修饰的之外）



![image-20220929105757749](Java%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20220929105757749.png)



## 方法的定义

![image-20220929111139089](Java%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20220929111139089.png)







## 方法调用的关系图

![image-20220929140602855](Java%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20220929140602855.png)



java方法调用传递参数的形式只有一种，按值传递  ，   引用传递的本质还是按值传递【此时的值是引用的地址值】

![image-20220929142421762](Java%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20220929142421762.png)



# 课堂练习：传参  【14：46  】

idea 工具， 快捷操作     tab  可以自动补全

​	psvm	按 tab   自动补充  main方法

​	sout	按 tab   自动补充    print相关方法



# 方法重载overload

1	运算符和方法 在不同的场景【上下文】做不同的解释，执行不同的操作

2	重载发生在 同一个类中  

3	重载的判定依据是  同一个类   函数签名不同【方法名相同 ，参量（形参列表）的顺序或数量不同】形成重载关系

4	重载属于前绑定【静态多态】

5	重载的典型案例   ，  Arrays  类提供了很多针对不同数组类型的 重载函数

![image-20220929152125083](Java%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20220929152125083.png)



# 



# 课堂练习：创建自己的工具类 ，  可以查找不同类型数组中最大的值【重载实现】【16：00】











# 面向对象

解决问题的思路和方法大概分为2种

1	自上而下的分解  ，将复杂的问题拆分为多个小问题，逐个解决，自上而下的设计，符合 瀑布流方式，贴近工作原理去思考和解决问题【强迫人类使用计算机思维】，通常将这种方式叫做  面向过程、基于DFD（数据流），面向结构 的编程。

![image-20220929162523112](Java%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20220929162523112.png)



2	自下而上：用人的思维解决问题，人最大的特点的归纳总结。将世界上所有具体的事物抽象成一种泛化的描述。 【羊圈关羊，宿舍住人，共同抽象     空间放物（羊，人）】，节省编程过程中的代码复用。也被称为喷泉模型，也叫做  面向对象 编程

![image-20220930085941777](Java%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20220930085941777.png)



# 类

## 类：自己创建的一种新类型， 和Integer是相同的，  利用多种基本类型或类类型组装出来自己方便处理的类型。

## 因为一般类型需要多种具体表现， 类被定义为 产生  具体实例对象  的模板 

## 对象：就是类的实例化结果

## 成员：定义类的时候给类设定的属性【状态,例如姓名，性别，饥饿】或  函数【方法，例如，吃饭，跑步】，原则上来讲，属性【状态】应该只有自己的方法去改变

## 人（年龄（int），体重(float)，宠物（Dog））

![image-20220930094259403](Java%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20220930094259403.png)



## 类的种类

### 1	系统或第三方：   JDK，   Spring   ，  使用即可

### 2	自定义：	

```java
[public][abstract|final]class 类名[extends父类][implements接口列表]
{  
      属性声明及初始化；
      方法声明及方法体；
}

```







# 课堂练习：创建一个手机类，并且通过方法展现相关属性。【10：23】



## 创建类的时候需要注意的事项

### 1	类是现实世界中，一般使用名词表示 

### 2	类的名称建议使用 大驼峰写法    OnlineStudentList

### 3	属性一般都使用private修饰，方法一般都是使用public修饰

### 4	一般建议属性定义在前面，方法都放在后面，可以使用快捷键  ctrl+alt+L  快速修正代码



# 构造函数

面向对象编程中， 创建一个类的具体实例时需要方便的对当前实例对象初始化其属性，并且需要在内存开辟空间存放该对象。 构想了一个  特殊的方法     ，和类名同名  ，没有返回值 ，  该方法会被   new  运算符调用 ， 将开辟的空间引用通过new返回 。一般语言都会在类中提供一个**默认**的空参构造函数，可以选择自定义构造函数，当显式存在一个构造函数后，默认的构造就不会再提供【需要手工创建】，构造方法也可以重载，构造函数也可以互相调用【一般  多参构造  调用   少参构造】。

![image-20220930110250906](Java%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20220930110250906.png)



傻瓜化编程：  创建一个类，设定所有属性， 通过代码生成器生成对应的空参，带参构造，getter和setter方法。





# 创建对象

最根本创建对象的方式  就是   使用new运算符   调用  构造函数   创建一个对象，并将对象的引用【地址】 赋值个一个变量【可以要创建对象的类或者其父类】以方便使用

通过    对象名.属性     或者     对象名.方法()      调用对象的相干成员

![image-20220930141749977](Java%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20220930141749977.png)

# 匿名对象

类似  JavaScript 中  匿名函数[函数就是Function对象]        ,     ol.onclick =  function(){}   ,    匿名函数的应用场合，函数仅被调用一次 ， 应用场合

```javascript
ol.onclick = function(){}
arr.sort(function(){})
```



java中对于只用到一次的对象，可以使用匿名对象， 创建的对象不需要用变量接收，直接传递或调用其方法。

# 课堂练习：创建一个车的类Car，拥有属性 maxSpeed， price  .   默认值分别是  200，10，

# 通过showMe方法展示该车的基本信息， 创建空参和带参构造函数，创建一个方法可以进行两辆车车的比较   compar (Car car)    ,  在主函数中使用匿名对象完成业务【15：25】



# 前端：HTML+CSS+Javascript

# 后端：Java+MySQL











![image-20221009084053993](Java%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20221009084053993.png)



# 面向对象

## 类，对象，成员属性，成员方法，构造方法，内存结构

# 面向对象高级特性

## 1	目标，掌握面向对象的  4 大特征：封装，继承，多态，抽象

## 2	继承

### 继承的主要目的：复用父类或祖先类提供的属性和方法，本质上还是代码复用。

### 在继承关系中我们还能发现一个规律：子类是父类的一种，也可以说“子类就是父类”。  is-A     ，    子类对象  is   A   父类

### 在Java中， 默认所有的类都继承自Object

### 子类对象拥有父和祖先的所有属性和方法

![image-20221009101702863](Java%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20221009101702863.png)

# 课堂练习： 10：35

![image-20221009102121602](Java%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20221009102121602.png)

### 继承关系中实例化的过程

#### 	子类【派生类】拥有其父类及祖先类【超类或基类】的所有属性和方法，子类对象中包含父类对象内容，在子类构造时，默认构造函数的第一行隐式调用父类的构造函数，  先执行父类的构造方法再执行子类的构造方法。

#### 涉及到代码块的执行。当类加载的时候静态代码块会被首先执行【执行1次】，非static代码块在每次构造对象时都会被执行【执行多次】，构造函数才会被执行，构造函数也可以显性的调用。







# 包

## 代码组织模式，通过包定义命名空间【防变量冲突】，**隔离**作用

package  包名;    表示当前文件的  字节码  文件所在的包位置，以此位置查找对应的其他字节码文件，如果没有package， 则意味当前在  默认包中【一个独立的module】

在集成开发工具中， 创建的包默认会采用和包相同的目录结构组织代码



![image-20221009141205375](Java%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20221009141205375.png)

## 包的引用

1	使用不属于当前包的类时，可以使用全路径【FQDN】方式描述， 每次使用都需要全路径

2	如果程序中需要使用其他包中的类，那么要先引入该包，才能不加前缀地调用这个类。

![image-20221009142441006](Java%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20221009142441006.png)

# 课堂练习：创建一个包，包内有两个类（Dog，Cat）， 分别使用全路径方式和导入包方式使用这两个类。



# 封装

## 使用访问权限修饰符【private,protected,public,无】对类的成员【属性，方法】进行控制，可以暴露需要公开的成员，隐藏只需要内部使用的成员

![image-20221009150250539](Java%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20221009150250539.png)

## 常用方式：需要隐藏的使用private修饰【建议所有成员属性都使用private】 ，  需要公开的使用public修饰。

## 可以为成员属性提供getter和setter方法获取以及设置值。





# 课堂练习：创建一个Person类， 含有私有private成员【pid编号，pname姓名，page年龄，pmoney钱包】，分别手工编写其setter和getter，要求，pid从1000开始，每产生一个实例pid+1，姓名不能为admin，年龄必须介于 0-100之间，减少pmoney必须通过  buy方法，通过toString展示基本信息。【16：00】



# 关于链式编程模式

## 基本表现：  对象.方法1();   对象.方法2();   对象.方法3();

## 某相声演员.抽烟();   某相声演员.喝酒();   某相声演员.烫头(); 

## 转换为：对象.方法1().方法2().方法3()；

## 某相声演员.抽烟().喝酒().烫头();     //链式编程

## 实现基础：方法执行结束之后返回当前对象本身【this】

## 课堂练习：类拥有name属性，有两个方法，分别在name外包裹  【】  和  {} 【8：55】









# 权限修饰符

## 1	public，protected，默认friendly，private

## 2	属性一般都是private，方法一般都是public

## 3	封装的权限限定

## 4	private只有在当前类的内部方法才可以访问，getter和setter的由来；

## 5	friendly默认，只要是在一个包中的类均可以访问

## 6	protected，只有后代才可以访问

## 7	public，任意都可以访问









# 关于修饰符的应用场合--单例设计模式

## 设计模式：就是编程套路，他人总结出来解决问题的思路。

## 设计模式的目的：复用编程思维

## 复用的层次：

### 1	代码复用【复制粘贴（CV大法）-- 函数封装】

### 2	算法复用【处理逻辑】

### 3	思想复用【设计模式】

### 4	架构复用【架构模式】



## 单例设计模式：部分场景情况下， 某个类只需要一个具体实例，例如 数据库连接对象【只需要一个】   

## 设计思路：不允许外部直接创建对象【私有化构造函数】，开放一个静态类static方法使其能够返回一个创建好的对象，已创建的对象应该是static的

# 

## 课堂练习：假设整个班级Grade全员共享一个电视机Tv。分别通过饿汉式和懒汉式描述该逻辑【10：55】





# 

# 方法覆盖override

## 覆盖也称之为覆写或重写override，重载overload，覆盖和重载是两个概念

## 重载发生在一个类内

## 子类对父类的方法重新实现，覆写发生在继承链上，覆写就是对父类提供的方法提供更加具体的实现，父类提供的方法可以认为是接口的基本定义。

## 覆写的表现：子类和父类使用同样的方法声明【不能是private】， 覆写的方法建议使用   @Override  注解进行标识

## 覆盖原则

### 1	相同的方法名

### 2	相同的参数列表（参数数量、参数类型、参数顺序都要相同），参量的名称无所谓

### 3	相同的返回值类型【其他语言要求，子类的返回类型窄于父类的返回类型】

### 4	子类覆盖方法的访问权限要大于等于父类中被覆盖方法的访问权限【public  >  protected  >  friendly  >  private(覆写方法不可能是private)】



## 思考：java中所有的类直接或间接的继承了Object类。意味着Object类中的成员会被子类所拥有，代表子类也可以覆写Object提供的成员，利用这种特性提供一种标准接口（）。



## 课堂练习：有三个类， Animal，Homers，Dog  ，   都存在  age属性，  都存在 eat方法 ，比较年龄【假设狗 3岁 等同于人类的   20 + 3 * 5  岁】，还需要输出对象的基本信息【13：40】



```
instanceof    判断某个实际对象是否属于某个类以及父类
this instanceof  Object   //  true

```

# 对象的构成

假设   Sub继承了 Base

![image-20221010144124816](Java%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20221010144124816.png)

可以使用父类对象声明变量类型，接收子类构造出来的具体实例对象的引用，调用时自动向上造型为基类，如果存在方法的覆写，则按照方法指针的指向调用到真实创建对象时的具体方法

![image-20221010144642736](Java%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20221010144642736.png)





## 总结：编程过程中建议new对象的时候，使用其父类声明的对象接收变量，函数传参的时候，参量的声明使用父类声明，符合抽象化编程。----多态的实际应用场景



# 多态

### 同样的消息在不同的上下文【环境】有不同的响应



## 多态的种类

### 1	静态多态，静态连编，编译时多态，前期绑定：方法重载，运算符重载

### 2	动态多态，动态运行，运行时多态，后期绑定：方法的覆写，父对象声明接收子对象









# 抽象类

### 抽象类仅仅用来组织结构， 无需产生具体实例

### 抽象方法使用  abstract   修饰   ，代表该类也是  abstract  的

### 拥有抽象方法的类必定是抽象类，但是抽象类中不是必须要有抽象方法。

### 子类【派生类】必须要覆写父类的abstract方法【如果子类也是abstract则由具体后代覆写】

# 课堂练习：9：45

![image-20221011093044159](Java%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20221011093044159.png)



# 





# final

## 1	final修饰的变量意味着是常量，定义时必须给初始值，后期无法重新赋值。

## 2	final修饰的方法，意味着派生类中不允许覆写

## 3	final修饰的类，意味着该类不能被继承。







# 接口

## 抽象类限制较多，java中类只能单继承【类只有一个直系父类】

## 接口可以弥补此缺陷，接口可以多实现，间接的实现了java多继承的功能

## 接口其实是特殊的抽象类   通过  interface  定义

### 接口可以继承接口，  interface IB extends IA

### 接口中也可以定义变量，默认修饰使用  public static final   ,  接口中的属性更常见的用法是做常量定义。

## 接口主要提供规则和规范

## 接口如何定义：

```java
public interface Runable {
}
```



## 接口的实现

```java
//多实现
class 计算机 extends 电子设备 implements USB,Runable, Serializable{
    
}
```

## 接口中的方法：

### 1	默认修饰符是  public  absctract   :  接口的方法必须被重新实现

### 2	新版本的java可以给接口提供默认方法， 需要使用default修饰，不被强制要求覆写









# 课堂练习：  将抽象类的实现转换为通过接口实现【12：00】





## 基于接口实现优势：

### 1	基于接口的多实现增补java不能多继承

### 2	灵活

### 3	java编程不推荐使用抽象类，推荐使用接口，

#### 	3.1	如果需要将数据方便的序列化 Serializable（标记接口）

#### 	3.2	如果声明自己可以被克隆，实现 Cloneable （标记接口）

#### 	3.3	如果声明自己可以被和其他对象比较，实现 Compareable接口（覆写compareTo方法）







# 重要通知

## 10月12日恢复线下授课，明早8点未被隔离的进入教室上课，隔离和居家继续线上【线上同时直播】。13号要求所有在校同学进入教室上课。 需要自带插排。







# 面向对象回顾

## 1	类，对象，成员，内存

## 2	抽象，继承，封装，多态【方法重载，方法覆写】

## 3	class，interface，abstract，default，final，static，this，super，setter，getter



# 课堂练习：假设制定游戏的模型，拥有职责【进攻，防守，治疗】（职责描述），拥有角色【长弓战士，骑士，盾牌战士，医生】（姓名和等级），能力配备 【发射武器，增加寿命】， 能够实现2名角色之间能够PK 【扩展团体作战】【14：55】



# 类：一般都是名词

# 对象：这个，那个     --  名词

# 抽象类【接口】：能力（形容词）







# 异常

## 没有按照程序流程执行的过程

### 1	硬件异常，由硬件中断时钟实现

### 2	系统异常，调用慢速设备

### 3	软件异常，脱离了当前的程序流【事件回调函数】



## 程序如何解决错误或异常

#### 1	语法错误：IDE提示解决

#### 2	逻辑错误：推荐使用debug调试

#### 3	资源错误：程序跳转模式实现【ljump  ---》  try.....catch】,异常处理机制





## java中Exception是程序员必须要处理的

### RuntimeException， 属于多态引起【动态多态引发】

## 异常的基本结构：

## 1	try......catch    结构，  try放运行的代码，catch放处理的代码

## 2	catch只能捕获 1个异常，类似于acl列表

## 3	catch列表编排时，小的异常（具体的）放在前面，大的异常（宽泛的）放在后面

## 4	无需自己处理的异常，可以在方法声明表示

## 5	对于不管是否存在异常都需要执行的代码【关闭文件，关闭数据，关闭资源】 都可以放在  

# 



# 建议：idea中，按两次 shift  键，可以检索相关信息，   输入关键字   RuntimeException  或  re  缩写





# 课堂练习：编写一个方法，比较两个字符串。假如其中一个字符串为空，会产生NullPointerException异常，比较规则，忽略大小写。在方法声明中通告该异常，并在适当时候触发异常，然后编写一个程序捕获该异常。







# 常见的工具类

## 最常见的架构模式   -   分层

![image-20221012132217145](Java%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20221012132217145.png)

## 分层的最大特点：  下层为上层提供服务，上层通过SAP使用下层的服务，SAP  在软件行业一般叫做     API【应用程序接口】



# 课堂案例：自己编写一个公民的类（id，name），覆写  hashCode【id的3次方】，覆写equals【hashCode相同则认为相同】，覆写 toString【打印 hashCode值】【13：55】



# 包装类

## 为什么需要包装类：基本类型不符合面向对象设计原则。java为了使语言完整的符合面向对象。提出了8个基本类型的对应包装类【包装类是原始类型的首字母大写，int对应  Integer，char对应Character】，包装类其实就是一个静态【static】工具集 ，对于基本的数据使用不建议， 使用时 包装类和基本类型 会自动  转换  ，   声明的时候使用包装类声明， 实际使用基本类型的时候它会自动拆包。





# 课堂练习：

## 编写程序，将    整形值   156   转换为  byte类型





# 异常

# 脱离了正常的流  ，   硬件，操作系统，软件

## Java异常：语法错误----IDE  ， 逻辑错误--DEBUG，资源错误--侠义异常处理



# 常用的工具类

## 练习：    字符串   ”123.45“  转换为对应的包装类和基本类型，  144转换为对应的包装类和字符串

# 

# 字符串

## 除了8种基本类型之外最常用的类型，String是引用类型

## StringBuffer对象代表一组**可改变**的Unicode字符序列，StringBuilder   效率比StringBuffer高。StringBuffer是线程安全的

## 判断字符串对象是否相同的写法，使用  从Object继承来的equals方法

## String的三个类全部对toString进行了覆写

![image-20221013100649378](Java%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20221013100649378.png)









# Date类

## 1	学会查看源码学习

## 2	Date是  java.util  包

## 3	默认使用UTC时间，从 1970年1月1日起 ，毫秒数

## 课堂练习：统计计算1连续加到10000所需要的时间。





# 集合：重点

## 数组是组织同类数据的一个集合【数据结构】，为了追求性能，连续存储，编译器会在编译阶段分配内存空间【栈】，数组是不能动态增长的。部分场景下不能预先获得空间大小【堆】，java为了使用动态数据结构方便，携带了一整套的数据结构模式【集合，也叫集合框架，容器】

## 接口：定义规范的纯粹抽象【实现多继承】

## 名词解释：

## 1	List，   列表，类似于数组线性结构

## 2	Set，    集合，不重复不排序的集合

### 3	Map，	 映射，key-value，字典，通过key操作value，



## 集合框架也可以通过多态方式存放不同的类型【和数组一样，声明的时候使用 父类或接口 声明】，集合创建的时候可以使用    泛型  声明， 确保存放的数据是指定类或其后代，【泛型  ：将数据类型作为参数传递】



基本语法练习：

# 开辟一个容器用以存储  多个  Student ，   假定学生不能重复添加



# 1	Collection是集合框架的根接口，Collection中声明的方法，继承或者实现的类或接口都具有该方法。



#  

## 课堂练习：创建一个学生信息登记查询系统，   可以插入学生基本信息【姓名，年龄，性别】， 该系统能够查询当前学生人数，打印所有学生列表， 查找是否包含指定学生， 查找并列出所有男生【14：25】





# 课堂练习: 在已有代码基础上完成容器的删除功能，考虑如何改造为万能容器







# 集合框架容器的遍历

## 1	通过toArray转换为数组，再遍历

## 2	迭代器【智能指针】，属于内部类

## 3	for变体

![image-20221014103121499](Java%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20221014103121499.png)

# 















# 数据持久化

## 数据不会断电消失，通过文件形式存放，结构化方式存放（数据库）

## 1	文件方式

### 1.1	输入和输出流，从程序角度【内存】，输入就是内存读取，输出就是内存输出到文件里

### 1.2	一切皆文件【磁盘上文件1.txt,  网络，鼠标，键盘，显示器】

### 1.3	有字符流【普通文件】和字节流【二进制文件】，部分字符的占位宽度不固定，

### 1.4	文件所属  Java.io  包  , 可以使用  System.out    System.in  操作标准的输出【显示器，stdout，2】和输入文件【键盘，stdin，0】

### 1.5	File是文件的句柄【操作文件的指针】，  类似C语言FILE*

### 1.6	文件操作可以多次包装，通过包装不同的类让流操作起来更方便







## //将读取到的数据封装到  Map



# 数据库

方便数据的存取

## 数据库分类

### 1	文件型数据库（txt，  excel ， access）

### 2	关系型数据库（MySQL，SQL Server，Oracle，DB2）

### 3	网状型

### 4	内存型数据库（MangDB）

## 关系型数据库

#### 应用范围目前是最广的，利用数据之间的关系描述结构，可以通过标准的   SQL 【SQL-92版】  进行操作。

#### 关系型数据库中利用 ER实现设计和描述。  entry(实体)   Raltional（关系），通过ORM（Object  Raltional  Model）思想实现

| 单元 | 数据库   | 面向对象设计中 |
| ---- | -------- | -------------- |
|      | 表       | 类             |
|      | 字段     | 成员属性       |
|      | 记录     | 对象           |
|      | 多个记录 | 集合框架       |



# 数据库的安装---MySQL的多版本共存安装







## 1	官网下载：https://dev.mysql.com/downloads/mysql/

![image-20221017090850291](Java%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20221017090850291.png)



### 附加：MySQL是开源的，依靠服务盈利的。MySQL 5.7  之后架构发生了巨大的改变，版本号直接跃迁为   8.0  ，  二进制安装版和zip压缩版【推荐--多版本共存】



## 2	将压缩版解压到 非中文和无特殊字符目录

![image-20221017093319611](Java%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20221017093319611.png)

### 3	编写配置文件my.ini   

![image-20221017094104536](Java%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20221017094104536.png)

### 4	初始化数据库

用管理员身份执行命令行

![image-20221017094316019](Java%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20221017094316019.png)

![image-20221017095050693](Java%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20221017095050693.png)

## 5	将MySQL安装为服务【开机自动在后台运行】

![image-20221017101342203](Java%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20221017101342203.png)

## 6	使用MySQL默认提供的客户端工具修改密码

![image-20221017102323647](Java%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20221017102323647.png)

```mysql
mysql>alter user 'root'@'localhost' identified with mysql_native_password by '111111';

```

## 7	客户端工具取代 mysql.exe（不易使用）

常见工具有：   idea集成了datagrip   ， Navicat      ，    sylog      ，       PHPMyAdmin（网页版客户端）

#### 连接数据库需要4要素： 驱动，  url   ，   用户名   ，    密码

![image-20221017111329947](Java%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20221017111329947.png)

![image-20221017111918535](Java%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20221017111918535.png)

![image-20221017112122597](Java%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20221017112122597.png)





# 数据库的基本操作

#### 不要依赖于鼠标操作，鼠标操作局限性太大，项目中全部使用SQL脚本实现操作【指导思想，  脚本的运行不依赖于任何条件】。

#### 对于数据库的操作主要分为对数据库组件操作（数据库，表，视图，字段，约束，索引）和数据操作。

#### 数据库组件的主要操作指令：

##### 增【create】：

![image-20221017130752945](Java%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20221017130752945.png)

##### 删【drop 】

##### 改【alter】

##### 查【show】



#### 数据的主要操作指令：

#### 增【insert】

#### 删【delete，truecate】

#### 改【update】

#### 查【select】





## MySQL典型的C/S架构的关系型数据库

![image-20221018080814969](Java%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20221018080814969.png)



## 对数据库的操作

### 1	组件的操作：增create删drop改alter查show

### 2	数据的操作：(C)增insert(D)删delete,truncate(U)改update(R)查select   ,   CRUD





# JDBC编程

## 应用编程的本质就是让普通用户可以间接的操作数据库数据。

![image-20221018082452362](Java%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20221018082452362.png)

### JDBC就是一套API接口，用以解耦 编程语言和数据库之间的紧密度

### JDBC是java官方提供的**接口**，数据库厂商实现该接口【叫做驱动】

## JDBC的常用类和接口

#### 1	DriverManager

#### 2	SQLException

#### 3	Connection

#### 4	Statement，Prepare Statement，CallableStatement

#### 5	ResultSet



## JDBC的编程步骤

### 1	载入JDBC驱动【一般的数据库驱动都是   .jar 包，Maven自动包依赖管理实现自动导入包】

#### 1.1	新建一个project或则module，使用maven进行管理

![image-20221018085108447](Java%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20221018085108447.png)



#### 1.2	修改pom.xml添加依赖包

BOM：Browser Object Model

DOM：Document Object Model

POM：Project Object Model

![image-20221018094807773](Java%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20221018094807773.png)



#### 1.3	在源代码中通过  Class.forName()  加载驱动程序   【Class 叫做  Java中的反射类】，将厂商提供的字节码驱动加载到当前程序

### 2	定义URL： 包括连接数据库的4要素【url ，  用户名， 密码  ，  库】连接得到Connection【资源】

### 3	选择表达式对象【Statement，PrepareStatement，CallableStatement】【资源】  ---   组装SQL语句

### 4	执行xxxxStatement  ，  ---执行SQL语句

### 5	得到ResultSet结果集【资源】，处理结果集

### 6	关闭资源



# 





# 国内使用Maven报错的处理措施--使用maven的国内镜像

## 1	修改maven的配置文件  settings.xml 

![image-20221018092230902](Java%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20221018092230902.png)



## 2	重启idea创建maven项目进行测试







# java程序操作数据库

## 1	解压版安装了MySQL【多版本共存，C/S】

## 2	JDBC架构意义【解耦 程序 和  数据库】，4要素【驱动，url，用户，密码】

## 3	驱动包等第三方依赖包通过Maven， 修改maven的配置文件  pom.xml  

## 4	JDBC编程步骤







# 关于数据库操作工具类的定义和使用

## 目的：将冗余的代码封装为方法，达到复用

## 指导思想：类方法【static方法】，将共同部分剥离，弹性



## 解决问题：

### 1	日期表示方式不符合本地化策略

### 2	SQL有可能会被注入【采用PreparedStatement】



# PreparedStatement

## 1	预处理语句，编译一次多次运行，效率高

## 2	填充参数形式，对于传入的参数过滤SQL攻击代码

## 3	PreparedStatement接口是Statement接口的子接口

## 4	通过setxxx()方法对sql语句中的？占位符进行填充









# 项目2--JavaSE项目

## 需求：饿了么的后台管理【基于console终端】

## 实现：分组实现，线上同学4人一组【虚拟团队】，线下3人一组

## 成果物：可运行的后台管理程序

## 技术：Java + MySQL + JDBC





# 1	设计数据关系，推荐使用E-R图模式

## Entry实体：对应程序里的类，对应数据库中的表，方框表示

## Ralational关系：1对1，1对多，多对多，线段表示

## property属性：对应程序里的成员属性，对饮该数据表中的字段，椭圆表示。

## 约束属性：主键外键，表之间关系一般都是主外键关系，主键用下划线，外键用波浪线

## 多对多关系表述，在数据库中通过中间表映射，一般无需在程序中创建对应实体

![image-20221019113303338](Java%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20221019113303338.png)



课堂任务：每个小组实现E-R图

![image-20221019134622991](Java%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20221019134622991.png)

# 2	数据结构初始化操作

## 2.1	将数据ER图转换为文档【程序开发的依据】

### 所有的数据表都通过表格文档方式说明，部分关键术语通过字典文件提供。

#### 字典文件样板

| 索引 | 关键词 | 解释                     |
| ---- | ------ | ------------------------ |
| 1    | PK     | primary key  主键        |
| 2    | AI     | auto_increment  自增字段 |
| 3    | NN     | Not Null   不允许为空    |
| 4    | FK     | foreign key   外键       |
| 5    | UQ     | unique  唯一约束         |
| 6    | ID     | index   索引列           |

### 为了便于日志操作，所有表都有一些固定字段

#### 例如   时间字段【时间戳类型  timeStamp】





#### admin（管理员表）

| No   | 字段名    | 数据类型  | size | 默认値            | 约束                        | 说明         |
| ---- | --------- | --------- | ---- | ----------------- | --------------------------- | ------------ |
| 1    | id        | Integer   |      |                   | PK、AI、NN                  | 管理员编号   |
| 2    | adminName | varchar   | 20   |                   | NN、UQ                      | 管理员名称   |
| 3    | password  | varchar   | 128  |                   | NN                          | 密码         |
| 4    | uptime    | timestamp |      | current_timestamp | on update current_timestamp | 记录修改时间 |

#### info（详细信息表）

| No   | 字段名 | 数据类型  | size | 默认値            | 约束                        | 说明         |
| ---- | ------ | --------- | ---- | ----------------- | --------------------------- | ------------ |
| 1    | id     | Integer   |      |                   | PK、AI、NN                  | 信息编号     |
| 2    | aid    | Integer   |      |                   | FK                          | 管理员编号   |
| 3    | phone  | varchar   | 11   |                   | UQ                          | 手机号码     |
| 4    | avatar | varchar   | 120  |                   |                             | 用户头像     |
| 5    | gender | boolean   |      |                   |                             | 性别         |
| 6    | uptime | timestamp |      | current_timestamp | on update current_timestamp | 记录修改时间 |

#### business（商家表）

| No   | 字段名          | 数据类型  | size  | 默认値            | 约束                        | 说明                   |
| ---- | --------------- | --------- | ----- | ----------------- | --------------------------- | ---------------------- |
| 1    | id              | Integer   |       |                   | PK、AI、NN                  | 商家编号               |
| 2    | password        | varchar   | 128   |                   | NN                          | 密码                   |
| 3    | businessName    | varchar   | 40    |                   | NN                          | 商家名称               |
| 4    | businessAddress | varchar   | 50    |                   |                             | 商家地址               |
| 5    | businessExplain | varchar   | 40    |                   |                             | 商家介绍               |
| 6    | starPrice       | decimal   | (5,2) | 0.00              |                             | 起送费                 |
| 7    | deliveryPrice   | decimal   | (5,2) | 0.00              |                             | 配送费                 |
| 8    | aid             | Integer   |       |                   | FK、NN                      | 维护该信息的管理员编号 |
| 9    | uptime          | timestamp |       | current_timestamp | on update current_timestamp | 记录修改时间           |

#### food（食品表）

| No   | 字段名      | 数据类型  | size  | 默认値            | 约束                        | 说明         |
| ---- | ----------- | --------- | ----- | ----------------- | --------------------------- | ------------ |
| 1    | id          | Integer   |       |                   | PK、AI、NN                  | 食品编号     |
| 2    | foodName    | varchar   | 30    |                   | NN                          | 食品名称     |
| 3    | foodExplain | varchar   | 30    |                   |                             | 食品介绍     |
| 4    | foodPrice   | decimal   | (5,2) |                   | NN                          | 食品价格     |
| 5    | bid         | Integer   |       |                   | FK、NN                      | 所属商家编号 |
| 6    | uptime      | timestamp |       | current_timestamp | on update current_timestamp | 记录修改时间 |

#### orderMap（订单映射表）

| No   | 字段名 | 数据类型  | size | 默认値            | 约束                        | 说明         |
| ---- | ------ | --------- | ---- | ----------------- | --------------------------- | ------------ |
| 1    | id     | Integer   |      |                   | PK、AI、NN                  | 订单编号     |
| 2    | aid    | Integer   |      |                   | NN、FK                      | 管理员编号   |
| 3    | fid    | Integer   |      |                   | NN、FK                      | 食品编号     |
| 4    | uptime | timestamp |      | current_timestamp | on update current_timestamp | 记录修改时间 |



## 2.2	以文档为参考编写SQL脚本

### 脚本应该是与环境无关

### 创建表时先创建主键所在表，删除表时先删除外键所在表

```mysql
# 库的操作
drop database if exists ele_se;
create database if not exists ele_se;
use ele_se;

# 初始化环境
# set character set utf8;
# set foreign_key_checks=false; -- 不检查外键约束

# 表操作
drop table if exists orderMap;
drop table if exists food;
drop table if exists business;
drop table if exists info;
drop table if exists admin;


create table if not exists admin(
    id integer auto_increment comment '管理员编号',
    adminName varchar(20) not null unique comment '管理员名称',
    password varchar(128) not null comment '密码',
    uptime timestamp default current_timestamp on update current_timestamp comment '记录修改时间',
    primary key `admin_pk` (`id`)
)comment '管理员表';

create table if not exists info(
    id integer auto_increment comment '信息编号',
    aid integer not null comment '管理员编号',
    phone varchar(11) unique comment '手机号码',
    avatar varchar(120) comment '用户头像',
    gender boolean comment '性别',
    uptime timestamp default current_timestamp on update current_timestamp comment '记录修改时间',
    primary key `info_pk` (`id`),
    constraint foreign key `fk_info_aid_to_admin_id` (`aid`) references admin(`id`)
)comment '详细信息表';

create table if not exists business(
    id integer auto_increment comment '商家编号',
    password varchar(128) not null comment '密码',
    businessName varchar(40) not null comment '商家名称',
    businessAddress varchar(50) comment '商家地址',
    businessExplain varchar(40) comment '商家介绍',
    starPrice decimal(5,2) default 0.00 comment '起送费',
    deliveryPrice decimal(5,2) default 0.00 comment '配送费',
    aid integer default 1 comment '管理员编号',
    uptime timestamp default current_timestamp on update current_timestamp comment '记录修改时间',
    primary key `business_pk` (`id`),
    constraint foreign key `fk_business_aid_to_admin_id` (`aid`) references admin(`id`)
) comment '商家表';

create table if not exists food(
    id integer auto_increment comment '食品编号',
    foodName varchar(30) not null comment '食品名称',
    foodExplain varchar(30) comment '食品介绍',
    foodPrice decimal(5,2) not null  comment '食品价格',
    bid integer not null comment '所属商家编号',
    uptime timestamp default current_timestamp on update current_timestamp comment '记录修改时间',
    primary key `food_pk` (`id`),
    constraint foreign key `fk_food_bid_to_business_id` (`bid`) references business(`id`)
)comment '食品表';

create table if not exists orderMap(
     id integer auto_increment comment '订单编号',
     aid integer not null comment '管理员编号',
     fid integer not null comment '食品编号',
     uptime timestamp default current_timestamp on update current_timestamp comment '记录修改时间',
     primary key `orderMap_pk` (`id`),
     constraint foreign key `fk_orderMap_aid_to_admin_id` (`aid`) references admin(`id`),
     constraint foreign key `fk_orderMap_fid_to_food_id` (`fid`) references food(`id`)
)comment '订单映射表';

# 数据操作【插入测试数据】
insert into admin (adminName, password) values ('wangzf','123456'),
                                               ('admin','654321')
;
insert into info (aid, phone, avatar, gender) values (1,'13898647536','a.png',true);
insert into business
    (password, businessName, businessAddress, businessExplain, aid)
VALUES
    ('123', 'kfc', '博川校区', '开封菜', 2),
    ('123', '杨国福', '博川校区', '麻辣烫', 2),
    ('123', '麻辣香锅', '黄泥川', '非常辣', 1)
;
insert into food
    (foodName, foodExplain, foodPrice, bid)
values
    ('甜筒','双色甜筒',3.5,1),
    ('汉堡','牛肉双层',13.5,1),
    ('鱼丸','淀粉丸',3.2,2),
    ('粉丝','土豆粉',3.5,2),
    ('方便面','廉帅博',4.5,2),
    ('海带','当年生海带',1.5,2)
;

insert into orderMap (aid,fid) values (1,1),
                                      (1,2),
                                      (1,6),
                                      (2,1),
                                      (2,6),
                                      (2,3)
;

# 批量插入测试数据  采用存储过程解决【函数】
create procedure benchBusiness(IN rownum integer)
BEGIN
    declare count integer default 1;
    while count<rownum do
            insert into business
            (password, businessName, businessAddress, businessExplain, aid)
            VALUES
                ('123', concat('商家',count), concat('地址',count), concat('介绍',count), 2);
            set count = count + 1;
    end while;
end;
# 调用存储过程
call benchBusiness(999);

select count(*) from business;


# 多表联查
# 1 直接相连  - 结果是  笛卡尔 乘积   总记录数  A * B
select  * from admin,info;
# 2 外连接  --  基表选择记录少的  ，如果多表有同名字段，会引发歧义问题
select
    *
from admin
left join info on id = aid;

# 建议模式
select
     a.id as pid,
     a.adminName as adminName,
     a.password as password,
     a.uptime as puptime,
     i.id as sid,
     i.phone as phone
 from admin as a
          left join info as i
                    on a.id = i.aid
where a.id = 2
;

select * from food;
select * from food where id = 1;
select * from food,business;
select * from food,business where id = 1;
select
    f.id as fid,
    f.foodName as foodName,
    f.foodExplain as foodExplain,
    f.foodPrice as foodPrice,
    f.bid as bid,
    f.uptime as fuptime,
    b.businessName as businessName,
    b.businessExplain as businessExplain
from food as f
left join business as b
on f.bid = b.id
where f.id = 1;
-- 课堂实践：  完成登录验证业务

delete from orderMap where fid in (1,2);
delete from food where bid=1;
delete from business where id = 1;
-- 课间休息 ：  14：05

select 1,2;
select id from food where bid=1;
delete from orderMap where fid in (select id from food where bid=1);













```















# 上课回顾20221020

## JDBC编程步骤：加载驱动【反射】，连接Connection【句柄】，Statement处理SQL语句，执行SQL动作，处理结果集ResultSet，关闭资源

## 通过工具类简化编程：抽取公用代码，封装为方法，为了方便调用使用static修饰。

## SQL字串拼接语法复杂，有可能被SQL注入攻击，执行批量任务缓慢，采用Statement的派生PreparedStatement【SQL中用？占位，setXXX填充占位】

## 项目开发基本步骤：需求--》人员分工--》ER设计--》文档化--》开发【数据库】--》程序架构











# 开发环境的配置

## idea + Maven + JDK11 + Git

## 1	idea创建空Maven支持项目Project或者模块Module

## 2	进入项目或者模块所在的目录【工作区】，使其被git所托管

![image-20221020084700788](Java%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20221020084700788.png)

## 3	代码托管中心（github.com）创建仓库

![image-20221020085107250](Java%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20221020085107250.png)

## 4	设置团队成员

![image-20221020085632016](Java%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20221020085632016.png)

## 5	将本地仓库和远程仓库映射

![image-20221020091103612](Java%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20221020091103612.png)

![image-20221020091151851](Java%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20221020091151851.png)

## 6	其他团队成员同意加入团队开发，克隆仓库到本地即可工作

git clone git@github.com:wangzhanf/llgsepro.git

git pull

注意：  团队成员独立编写文件

# 修改maven配置文件导入依赖的包

## 修改pom.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>vip.epss</groupId>
    <artifactId>day20221020SEPro</artifactId>
    <version>0.2-SNAPSHOT</version>

<!--    项目的基本配置，源代码版本，jdk编译后目标字节码版本，字符集-->
    <properties>
        <maven.compiler.source>11</maven.compiler.source>
        <maven.compiler.target>11</maven.compiler.target>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    </properties>

<!--    依赖包-->
    <dependencies>
<!--        java连接mysql数据库的驱动包-->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.21</version>
        </dependency>
<!--        单元测试包，java的单元测试通常采用junit-->
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.13</version>
            <scope>compile</scope>
        </dependency>

    </dependencies>

</project>

```



# 搭建项目的基本结构

## 推荐使用包管理技术【管理作用域】

![image-20221020103529266](Java%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20221020103529266.png)

# 在pojo包中创建领域模型

## 数据库中表对应的实体类【俗称   简单java类，领域类，domain类】

### 1	实体类的数量和库中表的数量应该相同【多对多映射的中间表可能没有实体类】

### 2	实体类的名称和表名是一致的，SQL不区分大小写，类名应该是大写字母开头

### 3	实体类的属性名和表的字段名相同，属性类型和字段类型要兼容。

### 4	如果存在表之间关系，遵循原则 【1 1对1时 外键字段或属性包装为 对应主键的对象。】【2 1对多时 主键字段或属性 持有 外键对象的集合】

### 5	提供空参构造，提供带参构造【自动增长列，自动更新时间，持有的对象，可以为空   这些字段无需放在构造函数中】

### 6	对所有属性都提供对应的getter和setter方法

### 7	为了方便测试输出，建议覆写  toString方法

### 8	实现接口   Serializable ， 方便类通过网络传输



# DAO的设计和实现

### 采用分层架构模式，降低整个程序的耦合度，利用分层中下层为上层提供服务的特性，利用上层调用下层接口使用服务的特性。

![image-20221020132419228](Java%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20221020132419228.png)

## DAO设计原则：方法功能单一【专一原则】，采用统一接口【定义规范】

### 建议使用接口定义常见的方法，在各个实现类覆写方法。

### 通过使用泛型类型参数方式实现抽象表示





# 工具类的封装和使用

## 1	数据库工具类

## 2	TimeStamp时间戳类，



# Dao层某个实体的具体业务







# 上课回顾20221021

## 1	利用git和github可以实现小组合作。

## 2	数据表到实体类映射【1对1，则持有对方的对象。1对多，则持有对方对象的框架集合】

## 3	为了提供统一的API接口：分层规划

## 4	基于接口的程序设计【泛型的应用】

## 5	工具类的开发【单例】







# Dao层的方法处理

## 1	查询数据时采用链式编程方便组装对象

## 2	方法的测试，项目中只有一个main函数作为入口







# 测试

## 测试：评测程序和需求是否一致。

## 测试的分类：

### 1	黑盒测试：功能测试，只关注输入和输出，无需了解细节。

### 2	白盒测试：覆盖测试，了解逻辑结构，分析，代码审查。

### 3	灰盒测试：介于白盒和黑盒之间。

### 4	压力测试：负载能力，【极值压力 * 0.8  = 负载能力】

### 5	冒烟测试：破坏性测试，



## 测试用例：

### 边界值，因果图，环境，路径覆盖



## 测试的周期

### 1	需求										验收测试（外部）

### 2	概要设计								系统测试（内部）

### 3	详细设计								集成测试（组装测试）

### 4	编码										单元测试





## 单元测试

### 主要是测试某个类或函数的算法是否和预期一致

## 1	main充当测试函数，调用被测试单元，伪装数据【缺陷：main函数一个项目只能有1个】

## 2	单独编写测试函数，在main函数中调用，【main的逻辑关系混乱，main的代码臃肿，测试方法都需要是static才能方便调用，发布时需要手工删除测试代码】

## 3	可以利用独立的单元测试库处理，实现逻辑【每个普通方法在运行时临时伪装为main的沙箱运行】



## Junit进行单元测试

### 1	导入junit包[maven 的配置文件  pom.xml]

```xml

<!--        单元测试包，java的单元测试通常采用junit-->
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.13</version>
            <scope>compile</scope>
        </dependency>
```



### 2	在项目中创建测试代码目录

![image-20221021094112433](Java%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20221021094112433.png)

### 3	编写测试代码

```java
package vip.epss.test.dao;

import org.junit.Test;
import vip.epss.dao.AdminDao;
import vip.epss.pojo.Admin;

public class AdminDaoTest {
    @Test
    public void testSelectOne(){
        AdminDao adminDao = new AdminDao();
        Admin admin = adminDao.selectByPrimaryKey(1);
        System.out.println(admin);
        return;
    }
    
    @Test
    public void testDeleteOne(){
        AdminDao adminDao = new AdminDao();
        Boolean aBoolean = adminDao.deleteByPrimaryKey(3);
        System.out.println(aBoolean);
        return;
    }
}

```



# 多表联查

## ResultSet提供的方法中   getXXXXX(字段名)   ，这个字段名 临时结果集中的字段名【别名】

```mysql
# 多表联查
# 1 直接相连  - 结果是  笛卡尔 乘积   总记录数  A * B
select  * from admin,info;
# 2 外连接  --  基表选择记录少的  ，如果多表有同名字段，会引发歧义问题
select
    *
from admin
left join info on id = aid;

# 建议模式
select
     a.id as pid,
     a.adminName as adminName,
     a.password as password,
     a.uptime as puptime,
     i.id as sid,
     i.phone as phone
 from admin as a
          left join info as i
                    on a.id = i.aid
where a.id = 2
;
```





# 上课回顾20221024

## 接口规则定义和实现，多表数据联查，单元测试













# 业务层的设计和实现

## 业务层Service： 整合Dao的基础操作【集成操作】

## 指导思想：基于接口的设计原则

## 教学过程:  先实践，再抽象接口

![image-20221024094041756](Java%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20221024094041756.png)









# 商家注册

![image-20221024111213940](Java%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20221024111213940.png)





# 调试BUG的过程

## 1	看出错提示，看第1条

## 2	选择恰当地方打断点。

## 3	开启DeBug调试





# 删除一个商家KFC

## 1	事务，   transaction    ，  

## 2	ACID特性

### 	A原子特性	要么都成功要么都失败，select操作是只读操作不涉及，增删改 操作默认commit，如果需要多个SQL实现原子性，关闭默认的commit





# UI

## User  Interface，用户接口，用户和系统交互的界面，分层体系中 用View层表示

## 指导原则：简单明了

## 用户进入的门面：main函数（客户端程序--追求简单），console终端程序--键盘输入执行指令



![image-20221025085321243](Java%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20221025085321243.png)

# MIS   Managerment  Information System 标准流程

![image-20221025134817684](Java%E8%AF%BE%E5%A0%82%E7%AC%94%E8%AE%B0.assets/image-20221025134817684.png)

# javaSE项目【项目2】   截止日期：10月30日 24：00 

# web，HTTP，Servlet编程



































