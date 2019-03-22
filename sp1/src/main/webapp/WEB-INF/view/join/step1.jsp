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
			<form action="<%=cp%>/join/step1" method="post">
				<div>
					<span>이름 : </span>
					<input type="text" name="name" value="${user.name}"/>
				</div>
				<div>
					<span>이메일 : </span>
					<input type="text" name="email" value="${user.email}"/>
				</div>
				<div>
					<button>다음단계</button>
				</div>
				<div>
					${msg}
				</div>
			</form>
		</div>
	</body>
</html>