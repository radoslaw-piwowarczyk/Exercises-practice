<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Administration panel</title>
</head>
<body>
<h1>Hello<%=request.getParameter("username")%></h1>
<p>It is a center to control the world. Here you can:</p>
<ul>
    <li>User management</li>
    <li>Moderate the content added by others</li>
    <li>Analize site statistics</li>
    <li>and much more</li>
</ul>
</body>
</html>