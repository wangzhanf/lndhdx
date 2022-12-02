<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/12/1
  Time: 13:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>admin修改页</title>
</head>
<body>
    admin修改页
<%--展示修改表单--%>
    <form method="post" action="http://localhost:8888/day20221130_war/admin/update">
        <input readonly="readonly" type="text" name="id" value="${requestScope.admin.id}" />
        <input type="text" name="adminname" value="${requestScope.admin.adminname}" placeholder="输入用户名" />
        <input type="text" name="password" value="${requestScope.admin.password}" placeholder="输入密码" />
        <input type="submit" value="确定修改" />
    </form>
</body>
</html>
