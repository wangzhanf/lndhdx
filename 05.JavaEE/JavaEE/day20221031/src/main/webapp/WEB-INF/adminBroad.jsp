<%@ page import="java.util.Date" %>
<%--
  Created by IntelliJ IDEA.
  User: wangzhanf
  Date: 2022/10/31
  Time: 8:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String contextPath = request.getContextPath();
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--jsp--%>
<%--<%= request%>--%>
<%
    //未登录用户不能直接进入该页面，根据session判断
    request.getSession();
    HttpSession httpSession = request.getSession();
    Boolean flag = (Boolean)httpSession.getAttribute("sta");
    if(flag){
%>
        只能管理员看到,用户名：<%=httpSession.getAttribute("un")%>
        <a href="<%= contextPath%>/logout.do">退出登录</a>
<%
    }else{
%>
    <a href="<%= contextPath%>/index.jsp" target="_self">返回登录页</a>
<% }%>

</body>
</html>
