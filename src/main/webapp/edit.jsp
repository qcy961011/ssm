<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="${pageContext.request.contextPath}/user/updataUser.action" method="post">
		<input type="hidden" value="${user.id }" name="id">
		username:<input type="text" name="username" value="${user.username }" /> <br> 
		password:<input type="text" name="password" value="${user.password }" /> <br> 
		sex:<input type="text" name="sex" value="${user.sex }" /> <br> 
		<input type="submit"  /> <br> 
	
	</form>

</body>
</html>