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
<%--    上传多个文件的js插件--%>
    <script src="https://unpkg.com/dropzone@5/dist/min/dropzone.min.js"></script>
    <link rel="stylesheet" href="https://unpkg.com/dropzone@5/dist/min/dropzone.min.css" type="text/css" />
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



<%--测试REST风格的设计--%>
    <a href="http://localhost:8888/day20221130_war/adminrest/opt/5">REST查(GET)</a>

    <form method="post" action="http://localhost:8888/day20221130_war/adminrest/opt">
        <input type="text" name="adminname"/>
        <input type="text" name="password" />
        <input type="submit" value="验证REST增(POST)" />
    </form>

    <form method="post" action="http://localhost:8888/day20221130_war/adminrest/opt/5">
        <input type="hidden" name="_method" value="DELETE" />
        <input type="submit" value="验证REST删(DELETE)" />
    </form>

    <form method="post" action="http://localhost:8888/day20221130_war/adminrest/opt/5">
        <input type="hidden" name="_method" value="PUT" />
        <input type="text" name="adminname" />
        <input type="text" name="password" />
        <input type="submit" value="验证REST改(UPDATE)" />
    </form>

    <form method="post" action="http://localhost:8888/day20221130_war/admin/upload" enctype="multipart/form-data">
        <input type="file" name="upfile" />
        <input type="submit" value="上传" />
    </form>


<%--多文件上传普通形式--%>
<form method="post" action="http://localhost:8888/day20221130_war/admin/uploads" enctype="multipart/form-data">
    <input type="file" name="upfiles" />
    <input type="file" name="upfiles" />
    <input type="file" name="upfiles" />
    <input type="submit" value="上传多个文件" />
</form>


<%--多文件上传使用插件形式--%>
<form action="http://localhost:8888/day20221130_war/admin/uploads" class="dropzone" id="my-awesome-dropzone"></form>
<input type="submit" value="提交" />
</body>
</html>
