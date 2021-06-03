<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html>
<head>
<title>관리자 모드</title>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<!-- 부트스트랩-->
	<link rel="stylesheet"
		 href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
	
	<script	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<h2>관리자페이지</h2>
<h3>회원리스트</h3>
<table class="table table-striped">
<thead>
<tr>
<th>ID</th>
<th>아이디</th>
<th>별명</th>
<th>이메일</th>
<th>생일</th>
<th>비고</th>
</tr>
</thead>

<c:forEach var = "tempMember" items="${members}" >
<!-- 유저별 업데이트 링크 -->
<!-- 파라미터에 멤버 아이디를 넣어서 전달 -->
<c:url var ="updateLink" value="${pageContext.request.contextPath}/member/editMember">
<c:param name="memberId" value="${tempMember.mem_id}"/>
</c:url>

<!-- 유저별 삭제 링크 -->
<c:url var ="deleteLink" value="${pageContext.request.contextPath}/member/deleteMember">
<c:param name="memberId" value="${tempMember.mem_id}"/>
</c:url>

<tr>
<td>${tempMember.mem_id}</td>
<td>${tempMember.mem_username}</td>
<td>${tempMember.mem_nickname}</td>
<td>${tempMember.mem_email}</td>
<td>${tempMember.mem_birthday}</td>
<!-- 업데이트 버튼 -->
<td>
<button type="submit" class="btn btn-success" onClick="location.href='${updateLink}'">수정</button>

<!-- 삭제 버튼 -->
<button type="submit" class="btn btn-danger" onClick="location.href='${deleteLink}'">삭제</button>
</td>

</tr>
</c:forEach>


</table>
<a href="${pageContext.request.contextPath}/">홈으로</a>


</body>
</html>