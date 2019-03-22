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
			<form action="<%=cp%>/join/step2" method="post">
				<div>
					<span>아이디 : </span>
					<input type="text" name="id"/>
				</div>
				<div>
					<span>비밀번호 : </span>
					<input type="password" name="pwd"/>
				</div>
				<div>
					<span>전화번호 : </span>
					<input type="text" name="tel"/>
				</div>
				<div>
					<button type="button" onclick="location.href='<%=cp%>/join/main'">이전단계</button>
					<button type="submit">회원가입</button>
				</div>
				<div>
					${msg}
				</div>
			</form>
		</div>
	</body>
</html>