<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="savedetails" method="post">
	<label>Customer Id</label>
		<input type="text" name="cid"/>
		<label>Customer Name</label>
		<input type="text" name="cname"/>
		<label>Customer Address</label>
		<input type="text" name="address"/>
		<label>Customer Age</label>
		<input type="text" name="age"/>
		
		<input type="submit" value="Regsiter"/>
		
	</form>

</body>
</html>