<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<head>
    <meta charset="UTF-8">
    <title>Secret site</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/secret" method="post">
    <label for="pass">Password</label>
    <input type="password" name="pass" id="pass">
    <button type="submit">Send</button>
</form>
</body>
</html>