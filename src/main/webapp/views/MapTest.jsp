<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
${requestScope.staff}中的${requestScope.staff[0]}是本文作者
<br/>
大家看看一下幸运数:${requestScope.luckynumber}
<br/>
地址列表：${requestScope.addlist}
<br/>
</body>
</html>