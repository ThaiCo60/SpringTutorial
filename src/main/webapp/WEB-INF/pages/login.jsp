<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<link href="${pageContext.request.contextPath}/WEB-INF/pages/css/stylesheet.css" type="text/css" rel="stylesheet">
</head>
<body>
	<form action="" method="post">
		<div class="content">
			<div class="line">
				<div class="title">
					<p>User name:</p>
				</div>
				<div class="input">
					<input type="text" name="username">
				</div>
			</div>
			<div>
				<div>
					<p>Password:</p>
				</div>
				<div>
					<input type="password" name="password">
				</div>
				<div>
					<input type="submit" value="submit">
				</div>
			</div>
		</div>
		<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
	</form>
</body>
</html>