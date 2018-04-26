<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function getAll() {
		var name = document.getElementsByName("uid")[0];
		if (name == null) {
			window.location.href = '/root/user/getAll.action';
		}
	}
</script>
</head>
<body onload="getAll()">
	<form action="${pageContext.request.contextPath}/user/del.action"
		method="post">
		<table width="90%" border="1">
			<tr>
				<td><input type="checkbox" value=""></td>
				<td>用户id</td>
				<td>用户名</td>
				<td>密码</td>
				<td>&nbsp;</td>
			</tr>

			<c:forEach items="${ulist }" var="user">

				<tr>
					<td><input type="checkbox" name="uid" value="${user.id }"></td>
					<td>${ user.id}</td>
					<td>${ user.username}</td>
					<td>${ user.password}</td>
					<td><a
						href="${pageContext.request.contextPath}/user/edit.action?userid=${user.id}">修改</a></td>
				</tr>

			</c:forEach>
		</table>
		<input type="submit" />

	</form>
</body>
</html>