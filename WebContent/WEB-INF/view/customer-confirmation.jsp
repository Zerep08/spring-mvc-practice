<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Customer confirmation</title>
</head>
<body>

The customer is: ${customer.firstName} ${customer.lastName}

<br><br>

FreePasses: ${customer.freePasses}

<br><br>

Zipcode: ${customer.zipCode}
</body>
</html>