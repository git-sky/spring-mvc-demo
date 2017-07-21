<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	example1:SW1
	<br> Request:${requestScope.SW1}
	<br> Session:${sessionScope.SW1}
	<br> example1:myname
	<br> Request:${requestScope.myname}
	<br> Session:${sessionScope.myname}
	<br> example1:age
	<br> Request:${requestScope.age}
	<br> Session:${sessionScope.age}
	<br>
</body>
</html>