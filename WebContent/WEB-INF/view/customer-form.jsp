<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">

<title>Customer Form</title>

<style > .error{color:red} </style>

</head>
<body>

<i>Asterisk means required.</i>

	<form:form action="processForm" modelAttribute="customer">

<br><br>
First Name: <form:input path="firstName" />
			<form:errors path="firstName" cssClass="error"/>
		<br>
		<br>

Last Name(*): <form:input path="lastName" />
			  <form:errors path="lastName" cssClass="error"/> 

		<br>
		<br>

FreePasses: <form:input path="freePasses" />
			<form:errors path="freePasses" cssClass="error"/>

	<br>
		<br>

ZipCode: <form:input path="zipCode" />
			<form:errors path="zipCode" cssClass="error"/>	
	
		
		<br>
		<br>
		<input type="submit" value="Submit">

	</form:form>




</body>
</html>