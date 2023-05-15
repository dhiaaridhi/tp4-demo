<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
<jsp:useBean id="c" class="modele.clientBean" scope="session"></jsp:useBean>
<h2>nom : <jsp:getProperty property="nom" name="c"/></h2>
<h2>prenom : <jsp:getProperty property="prenom" name="c"/></h2>
<h2>adresse : <jsp:getProperty property="adresse" name="c"/></h2>
<h2>tel : <jsp:getProperty property="tel" name="c"/></h2>
<h2>email : <jsp:getProperty property="email" name="c"/></h2>
</body>
</html>