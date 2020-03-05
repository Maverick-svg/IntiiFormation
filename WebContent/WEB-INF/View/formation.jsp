<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
<form action ="/IntiiFormation/AjoutFormationServlet" method="post">
<input type="text" name="theme" placeholder="veuillez saisir thème de la formation">
<input type="number" name="lieu" placeholder="veuillez saisir l'id du Lieu">
<input type="submit" value="envoie">
</form>
</body>
</html>