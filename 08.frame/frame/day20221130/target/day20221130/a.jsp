<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/11/30
  Time: 14:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
成功登录的管理页面  <%=session.getAttribute("uname")%>
<a href="http://localhost:8888/day20221130_war/hello/logout.do">登出</a>
<hr />
<a href="http://localhost:8888/day20221130_war/admin/index">Admin管理[默认列表页面]</a>

<hr />






<form method="post" action="http://localhost:8888/day20221130_war/hello/he3">
    <input type="submit" value="提交" />
</form>

<a href="http://localhost:8888/day20221130_war/hello/he5?username=zs&age=18&salary=123.45">参数封装1</a>
<a href="http://localhost:8888/day20221130_war/hello/he5?username=zs&age=18&salary=123.45&hobby=football&hobby=basketball">参数封装2</a>
<a href="http://localhost:8888/day20221130_war/hello/he6?uname=zs&age=18&salary=123.45&hobby=football&hobby=basketball">参数封装3[变量名不同]</a>
<form method="get" action="http://localhost:8888/day20221130_war/hello/he5">
    <input type="text" name="username"/>
    <input type="number" name="age" />
    <input type="number" name="salary" />
    <label>
        <input type="checkbox" name="hobby" value="football" />足球
        <input type="checkbox" name="hobby" value="football" />篮球
        <input type="checkbox" name="hobby" value="tennis" />网球
    </label>
    <input type="submit" value="提交" />
</form>

<form method="get" action="http://localhost:8888/day20221130_war/hello/he7">
    <input type="text" name="adminname"/>
    <input type="text" name="password" />
    <input type="text" name="info.phone" />
    <input type="text" name="info.avatar" />

    <input type="submit" value="提交验证对象的封装" />
</form>

<form method="get" action="http://localhost:8888/day20221130_war/hello/he8">
    <input type="text" name="adminname"/>
    <input type="text" name="password" />

    <input type="submit" value="提交验证对象的封装和session自动注入" />
</form>

</body>
</html>
