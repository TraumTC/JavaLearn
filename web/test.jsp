<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2026/3/17
  Time: 19:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <div>
        <h1>欢迎回来</h1>
        <%
//            从servlet获取数据  转发
            String name= "转发：name="+(String) request.getAttribute("name");
//            重定向
            String name3= "重定向：name= "+(String)session.getAttribute("name");
//            从url ?name= 获取数据
            String name1 = "uri: names="+ request.getParameter("names");
        %>
        <h2><%=name%></h2>
        <h2><%=name1%></h2>
        <h2><%=name3%></h2>
    </div>
</body>
</html>
