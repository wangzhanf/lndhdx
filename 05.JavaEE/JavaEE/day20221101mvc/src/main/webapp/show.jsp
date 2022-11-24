<%--
  Created by IntelliJ IDEA.
  User: wangzhanf
  Date: 2022/11/8
  Time: 10:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <div><%=request.getAttribute("message")%></div>
    <img src="/uploadDir/<%=request.getAttribute("url")%>" />
</body>
</html>
