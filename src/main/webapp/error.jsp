<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Error</title>
</head>
<body>
<h2>Error occurred</h2>
<p>Something went wrong. Probably wrong login data.</p>
<a href="<%=request.getContextPath() + "/"%>">Back to main site</a>
</body>
</html>