<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Your note</title>
</head>
<body>
<%
    String note = (String) request.getAttribute("note");
    if (note != null) {
%>
<h2>Your note</h2>
<p><%=note%></p>
<%
} else {
%>
<h2>Note with such ID does not exist.</h2>
<%
    }
%>
</body>
</html>