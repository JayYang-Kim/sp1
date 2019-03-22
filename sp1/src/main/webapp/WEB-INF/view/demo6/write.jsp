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
	<form action="<%=cp%>/demo6/request" method="post">
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
			<span>회원구분 : </span>
			<select name="memberType">
				<c:forEach var="t" items="${memberTypes}">
					<option value="${t}">${t}</option>
				</c:forEach>
			</select>
		</div>
		<div>
			<span>학력 : </span>
			<select name="hak">
				<c:forEach var="h" items="${haks}">
					<option value="${h}">${h}</option>
				</c:forEach>
			</select>
		</div>
		<div>
			<button>보내기</button>
		</div>
	</form>
</body>
</html>