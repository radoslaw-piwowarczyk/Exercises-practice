<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Level of your hydration</title>
</head>
<body>
<h1>Tracking the level of your hydration</h1>
<form action="control">
    <button name="option" value="water">Add a glass of water</button>
    <button name="option" value="clear">Reset the counter</button>
</form>

<%
    Object water = request.getSession().getAttribute("water");
    if (water == null) {
%>
<h2>Today you haven't drank any water yet!</h2>
<%
} else {
%>
<h2>Today you've drank: <%=water%>ml water</h2>
<%
    }
%>
</body>
</html>