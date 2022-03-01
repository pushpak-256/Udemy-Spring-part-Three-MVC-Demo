<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>student-confirmation</title>
</head>

Congratulations !! &nbsp;
<strong> ${student.firstName} &nbsp; ${student.lastName} &nbsp;</strong>
your are confirmed.

<br> Country of Origin : ${student.country}

<br> Country of Origin : ${student.favoriteLanguage}

<br>
 secretCode : ${student.secretCode}
<br>

<label> Operationg systems: </label>
<ul>
	<c:forEach var="os" items="${student.os}">
		<li>${os}</li>
	</c:forEach>
</ul>

<body>

</body>
</html>