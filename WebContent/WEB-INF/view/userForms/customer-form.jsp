<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>customer-form</title>
<style>
.error {
	color: red
}
</style>
</head>
<body>

	<form:form action="processForm" modelAttribute="customer">

		<table>
			<tr>
				<td><form:label path="firstName">first name : </form:label></td>
				<td><form:input path="firstName" /></td>
			</tr>

			<tr>
				<td><form:label path="lastName">last name(*): </form:label></td>
				<td><form:input path="lastName" /> <form:errors
						path="lastName" cssClass="error" /></td>
			</tr>

			<tr>
				<td><form:label path="freePasses">Free Passes </form:label></td>
				<td>
				        <form:input path="freePasses" />
				        <form:errors path="freePasses" cssClass="error" />
				</td>
			</tr>
			
			<tr>
				<td><form:label path="pinCode">Pin-Code</form:label></td>
				<td>
				        <form:input path="pinCode" />
				        <form:errors path="pinCode" cssClass="error" />
				</td>
			</tr>

		<tr>
				<td><form:label path="courseCode">Course-Code</form:label></td>
				<td>
				        <form:input path="courseCode" />
				        <form:errors path="courseCode" cssClass="error" />
				</td>
			</tr>

		</table>
		<input type="submit" value="Enter" />

	</form:form>

</body>
</html>