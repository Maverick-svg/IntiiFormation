<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/IntiiFormation/ListFormationServlet" method="post">
<input type="text" name="ville" placeholder="Entrée nom de la ville">
<input type="submit" value="lister">

<h3>${listes}</h3>
</form>
</body>
</html>