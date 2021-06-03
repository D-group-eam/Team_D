<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<!doctype html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<!-- 부트스트랩-->
	<link rel="stylesheet"
		 href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
	
	<script	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>관리자페이지</title>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
</head>
<body>
<h2>회원정보 수정</h2>

<!-- 수정 폼 -->
<form action="${pageContext.request.contextPath}/member/saveMember" 
						  method="POST" class="form-horizontal">



</form>


</body>
</html>
