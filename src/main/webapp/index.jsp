<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Control centre - log in<</title>
</head>
<body>
<h2>Log in</h2>
<form action="<%=request.getContextPath() + "/login"%>" method="post">
    <div>
        <label for="username">Username</label>
        <input name="username" id="username">
    </div>
    <div>
        <label for="password">Password</label>
        <input name="password" type="password" id="password">
    </div>
    <input type="submit" value="Log in">
</form>
</body>
</html>