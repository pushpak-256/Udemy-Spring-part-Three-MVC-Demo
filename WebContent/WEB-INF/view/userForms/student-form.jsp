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
  <br> <br>

		<form:select path="country">
		
		<!-- keeping  selected value blank -->
		 <form:option value="" >-- select country --</form:option>
		
			<form:option value="Brazil" label="Brazil" />
			<form:option value="France" >France</form:option>
			<form:option value="India" label="India" />
			<form:option value="Canda" label="Canda" />
		</form:select>

		<input  type="submit" value ="Register">
 </form:form>

</body>

</html>