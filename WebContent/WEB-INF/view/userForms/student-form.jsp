<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>student-Registration-form</title>
</head>

<body>
 
 <form:form action="processForm" modelAttribute="student">
 
 First Name : <form:input path="firstName"/>
 <br> <br>
 Last Name : <form:input path="lastName"/>
 
 <input  type="submit" value ="Register">
 
 </form:form>

</body>

</html>