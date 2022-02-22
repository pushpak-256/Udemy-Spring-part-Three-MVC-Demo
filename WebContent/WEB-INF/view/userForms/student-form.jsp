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
 
 First Name : <form:input path="firstName" />
		<br>
		<br>
 Last Name : <form:input path="lastName" />
		<br>
		<br>

		<form:select path="country">


			<form:options items="${ student.countryList}" />

			<!-- keeping  selected value blank -->
			<!-- 		<form:option value="" >-- select country --</form:option>
	          <form:option value="Brazil" label="Brazil" />
			<form:option value="France" >France</form:option>
			<form:option value="India" label="India" />
			<form:option value="Canda" label="Canda" />   -->

		</form:select>

		<br>
		<br>

		<label>Favorite Languge :</label> &nbsp; &nbsp;
		
		<form:radiobuttons path="favoriteLanguage" items="${student.languageList }"/>
   
<%--      JAVA<form:radiobutton path="favoriteLanguage" value="Java" /> &nbsp; --%>
<%--     PYTHON<form:radiobutton path="favoriteLanguage" value="python" />&nbsp; --%>
<%--     C++<form:radiobutton path="favoriteLanguage" value="c++" />&nbsp; --%>
<%--             C#<form:radiobutton path="favoriteLanguage" value="c#" />&nbsp; --%>

 <br> <br>
 
		<input type="submit" value="Register">
	</form:form>

</body>

</html>