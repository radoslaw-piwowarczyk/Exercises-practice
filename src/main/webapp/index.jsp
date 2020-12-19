<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Notepad</title>
</head>
<body>
<h1>Notepad</h1>
<form action="save" method="post">
    <fieldset>
        <label for="noteId">Note identifier</label>
        <input name="noteId" id="noteId" />
    </fieldset>
    <fieldset>
        <label for="noteContent">Note content</label>
        <textarea name="noteContent" id="noteContent"></textarea>
    </fieldset>
    <fieldset>
        <label for="privateNote">Private note</label>
        <input name="noteType" type="radio" value="priv" id="privateNote" checked />
        <label for="publicNote">Public note</label>
        <input name="noteType" type="radio" value="pub" id="publicNote" />
    </fieldset>
    <input type="submit" value="Zapisz"/>
</form>
</body>
</html>