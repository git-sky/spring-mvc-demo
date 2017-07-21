<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
1<br/>
<a href="c3/rq1?username='happyBKs'&age=19">happyBKs age=19</a><br/>
<a href="c3/rq1?age=20">nousername age=20</a><br/>
<a href="c3/rq1?username='happyBKs'&age=20&pwd='hhhh'">happyBKs age=20 pwd</a><br/>
<a href="c3/rq1?username='happyBKs'&age=20">happyBKs age=20</a><br/>

<form action="c3/rq1" method="post">
<input type=text name="username" />
<input type=text name="age" />
		<input type="submit" value="post it" />
	</form>

<br/>
2<br/>
<a href="c3/rq2">go</a><br/>
</body>
</html>