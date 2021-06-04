<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>

<!doctype html>
<html>
<head>
<title>안녕~</title>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<!-- 부트스트랩-->
	<link rel="stylesheet"
		 href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
	
	<script	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>

<body>
<h2>

<security:authorize access="isAnonymous()">
손님 
</security:authorize>

<security:authorize access="isAuthenticated()">
<security:authentication property="principal.username"/> 
</security:authorize>

<br> 반가워~</h2>
	
	<security:authorize access="isAnonymous()">
			<div class="">
				<button type="submit" class="btn btn-success" onClick="location.href='${pageContext.request.contextPath}/login'">로그인</button>
			</div>
	</security:authorize>
	
	<security:authorize access="isAuthenticated()">
		<p>
		<form:form action="${pageContext.request.contextPath}/logout" method="POST">
			<input type="submit"class="btn btn-danger"  value="로그아웃"/>
		</form:form>
		</p>
	</security:authorize>
	
		<a href="${pageContext.request.contextPath}/member/">마이페이지</a>		
		<a href="${pageContext.request.contextPath}/admin/">관리자모드</a>			
	

</body>

</html>