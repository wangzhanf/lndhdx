<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8" />
</head>
<body>
<h2>Hello World!</h2>
<h3></h3>
<%
    String contextPath = request.getContextPath();
%>
<form action="<%= contextPath%>/login.do">
    <input type="text" name="uname" />
    <input type="text" name="upass" />
    <input type="submit" value="login" />
</form>
<script>
    window.onload = function(){
        let str =  window.decodeURIComponent(window.location.href);
        document.querySelector("h3").innerHTML = str.split("=")[1];
    };
</script>
</body>
</html>
