<%--
  Created by IntelliJ IDEA.
  User: nzq
  Date: 2020/6/19
  Time: 17:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%
    out.print("用户名或密码错误");
    response.setHeader("refresh","2,system/login.jsp");
%>
</body>
</html>
