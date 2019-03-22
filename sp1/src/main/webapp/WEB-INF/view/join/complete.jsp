<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
	String cp=request.getContextPath();
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>회원가입</title>
		<style type="text/css">
			*{padding:0;margin:0;}
			.container{width:1024px;margin:0 auto;}
		</style>
	</head>
	<body>
		<div class="container">
			<h3>가입 완료</h3>
			<div>
				${msg}
			</div>
		</div>
	</body>
</html>