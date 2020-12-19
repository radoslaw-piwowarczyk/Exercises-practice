<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Wizyty</title>
</head>
<body>
<h1>Cześć!</h1>
<h2>Twoja liczba odwiedzin na naszej stronie: <%= request.getAttribute("numberOfVisits")%></h2>
<a href="remove">Wyzeruj licznik</a>
</body>
</html>