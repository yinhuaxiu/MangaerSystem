<%--
  Created by IntelliJ IDEA.
  User: nzq
  Date: 2020/6/23
  Time: 10:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script>
        window.location.hash="no-back";
        window.location.hash="Again-No-back-button";
        window.onhashchange=function(){window.location.hash="no-back";}
    </script>
</head>
<body>
      <%
          out.print("抱歉，该用户已被系统删除，无法使用本系统提供的功能，请您重新注册账户");
      %>
        <a href="${pageContext.request.contextPath}/main/register_Page.action">注册</a>
</body>
</html>
