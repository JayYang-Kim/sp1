<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
	String cp = request.getContextPath();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="<%=cp%>/demo7/request" method="post">
		<div>
			<span>아이디 : </span>
			<input type="text" name="id"/>
		</div>
		<div>
			<span>비밀번호 : </span>
			<input type="text" name="pwd"/>
		</div>
		<div>
			<span>이름 : </span>
			<input type="text" name="name"/>
		</div>
		<div>
			<span>나이 :</span>
			<input type="text" name="age"/>
		</div>
		<div>
			<button>보내기</button>
		</div>
	</form>
</body>
</html>