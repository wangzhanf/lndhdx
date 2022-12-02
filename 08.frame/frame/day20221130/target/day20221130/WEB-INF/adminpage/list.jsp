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
    <title>admin列表页</title>
</head>
<body>
<a href="http://localhost:8888/day20221130_war/WEB-INF/adminpage/addForm.jsp">添加一个管理员[错误]</a>
<a href="http://localhost:8888/day20221130_war/admin/addF">添加一个管理员[转发]</a>

    admin列表页
<%--展示数据--%>
    <table border="1">
        <thead>
            <tr>
                <th>序号</th>
                <th>id</th>
                <th>姓名</th>
                <th>操作</th>
            </tr>
        </thead>
        <tbody>
        <%   //request    获取9大对象【servletContext例外】， 通过request可以获取其他对象  %>
<%--            循环产生在行上  ， JSTL 标签库 ，  默认访问4个作用域(scope)  page,request,session ,context --%>
            <c:forEach items="${requestScope.adminList}" var="admin" varStatus="status">
            <tr>
                <td>${status.count}</td>
                <td>${admin.id}</td>
                <td>${admin.adminname}</td>
                <td>
                    <a href="http://localhost:8888/day20221130_war/admin/del?no=${status.count}">删除</a>
                    <a href="http://localhost:8888/day20221130_war/admin/upd?no=${status.count}">修改</a>
                </td>
            </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
