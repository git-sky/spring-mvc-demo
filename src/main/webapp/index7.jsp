<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<a href="rest/methodstest/1">GET Request</a>

	<form action="rest/methodstest" method="post">
		<input type="submit" value="POST Request" />
	</form>

	<form action="rest/methodstest/1" method="post">
		<input type="hidden" name="_method" value="PUT"> 
		<input type="submit" value="PUT Request" />
	</form>

	<form action="rest/methodstest/1" method="post">
		<input type="hidden" name="_method" value="DELETE"> 
		<input type="submit" value="DELETE Request" />
	</form>

</body>
</html>