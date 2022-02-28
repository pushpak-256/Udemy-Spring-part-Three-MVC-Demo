<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>customer-confirmation</title>
</head>
<body>

Congratulations !! &nbsp;
<strong> ${customer.firstName} &nbsp; ${customer.lastName} &nbsp;</strong>
your are confirmed. &nbsp; &nbsp; Free Passes :  ${customer.freePasses}
 <br>
 Pin-Code : ${customer.pinCode}
 <br>
 Course-Code : ${customer.courseCode}
 
</body>
</html>