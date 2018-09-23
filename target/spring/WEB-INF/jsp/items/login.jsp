<%--
  Created by IntelliJ IDEA.
  User: heqin
  Date: 2018/9/20
  Time: 20:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>系统登陆</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/login.html" method="post">
    用户账户:<input type="text" name="username">
    用户密码: <input type="password" name="password">
    <input type="submit" value="登陆">
</form>
</body>
</html>
