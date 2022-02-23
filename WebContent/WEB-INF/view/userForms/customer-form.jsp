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

		</table>
		<input type="submit" value="Enter" />

	</form:form>

</body>
</html>