<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2026/3/18
  Time: 15:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>我的世界</title>
</head>
<body>
    <h1>欢迎回来!</h1>
    <%
        String name =(String)session.getAttribute("username");
    %>
    <h2>
        <%=name%>
    </h2>
    <a href=${pageContext.request.contextPath}/logout>退出</a>
</body>
</html>
