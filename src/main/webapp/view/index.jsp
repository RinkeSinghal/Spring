<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 	Welcome
 	
 	<form action="addCustomer" method="post">
 		Enter customer id : <input type="text" name="id"><br>
 		Enter customer name : <input type="text" name="name"><br>
 		<input type="submit">
 	</form>
 	<hr>
 	<form action="getCustomer" method="get">
 		Enter customer id : <input type="text" name="id"><br>
 		<input type="submit">
 	</form>
 	
 	
</body>
</html>