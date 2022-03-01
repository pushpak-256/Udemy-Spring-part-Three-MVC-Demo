<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<style>
.error {
	color: red
}
</style>
<meta charset="ISO-8859-1">
<title>student-Registration-form</title>
</head>

<body>

	<form:form action="processForm" modelAttribute="student">
 
 First Name : <form:input path="firstName" />
		<form:errors path="firstName" class="error" />
		<br>
		<br>
 Last Name : <form:input path="lastName" />
 <form:errors path="lastName" class="error" />
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
		
		<form:radiobuttons path="favoriteLanguage"
			items="${student.languageList }" />

		<%--      JAVA<form:radiobutton path="favoriteLanguage" value="Java" /> &nbsp; --%>
		<%--     PYTHON<form:radiobutton path="favoriteLanguage" value="python" />&nbsp; --%>
		<%--     C++<form:radiobutton path="favoriteLanguage" value="c++" />&nbsp; --%>
		<%--             C#<form:radiobutton path="favoriteLanguage" value="c#" />&nbsp; --%>

		<br>
		<br>
		<form:checkboxes path="os" items="${student.operationgSysList}" />
		<br>
		<br>

		<form:label path="secretCode"> Secret Code : </form:label>
		<form:input path="secretCode" />
		<form:errors path="secretCode" class="error" />
		<br>
		<br>


		<input type="submit" value="Register">
	</form:form>

</body>

</html>