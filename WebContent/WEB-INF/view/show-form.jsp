<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form:form action="processForm" modelAttribute="student">

First Name: <form:input path="name" />

		<br>
		<br>

Last Name: <form:input path="lastName" />

		<br>
		<br>

Country: <form:select path="country">
			<form:options items="${student.countryOptions}" />
			
		</form:select>

		<br>
		<br>
Favorite programming language:

Java <form:radiobutton path="language" value="Java"/>
PHP <form:radiobutton path="language" value="PHP"/>
Ruby <form:radiobutton path="language" value="Ruby"/>		
		
		
		<br>
		<br>
OS that you have experience:

Linux <form:checkbox path="oS" value="Linux"/>
Mac OS <form:checkbox path="oS" value="Mac OS"/>
Windows <form:checkbox path="oS" value="Windows"/>		
		
		<br><br>
		<input type="submit" value="Submit">

	</form:form>








</body>
</html>