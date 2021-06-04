<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  


<!doctype html>
<html lang="en">
<head>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<title>Login Page</title>
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<!-- 부트스트랩 -->
	<link rel="stylesheet"
		 href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
	
	<script	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

	<div class="navbar-wrapper">
		<div class="container">
			<nav class="navbar navbar-inverse navbar-static-top">
				<div class="container" id="header_menu">
					<div class="navbar-header">
						<button type="button" class="navbar-toggle collapsed"
							data-toggle="collapse" data-target="#navbar"
							aria-expanded="false" aria-controls="navbar">
							<span class="sr-only"></span> <span class="icon-bar"></span> <span
								class="icon-bar"></span> <span class="icon-bar"></span>
						</button>

					</div>
					<div id="navbar" class="navbar-collapse collapse">
						<ul class="nav navbar-nav">
							<li><a href="${pageContext.request.contextPath}/">Home</a></li>
							<li class="active"><a href="${pageContext.request.contextPath}/member/editMember">회원 정보</a></li>

							<li><a href="${pageContext.request.contextPath}/member/verifyPassword">비밀번호변경</a></li>

							<!-- <li><a href="/asp-shoppingMall/mall/memberList.asp">회원록록</a></li>

							<li><a href="/asp-shoppingMall/mall/logout.asp">로그아웃</a></li>
							<li class="dropdown"><a href="#" class="dropdown-toggle"
								data-toggle="dropdown" role="button" aria-expanded="false">님
									환영합니다. <span class="caret"></span>
							</a>
								<ul class="dropdown-menu" role="menu">
									<li><a href="/asp-shoppingMall/mall/regedit.asp">회원정보
											수정</a></li>
									<li><a href="#">Another action</a></li>
									<li><a href="#">Something else here</a></li>
									<li class="divider"></li>
									<li class="dropdown-header">Nav header</li>
									<li><a href="#">Separated link</a></li>
									<li><a href="#">One more separated link</a></li>
								</ul></li> -->
						</ul>
					</div>
				</div>
			</nav>
		</div>
	</div>

	<div class="container">

		<div clss="col-xs-12 col-sm-12">
			<h1 class="bg-primary text-center"
				style="width: 100%; padding-top: 20px; padding-bottom: 20px; text-align: center">회원
				정보 수정</h1>
			<div class="col-xs-3 col-sm-3"></div>
			<div class="col-xs-6 col-sm-6">
			
	<form:form action="${pageContext.request.contextPath}/member/saveMember" 
						modelAttribute="EditMember"  class="">	
	<h3> 비밀번호를 한 번 더 입력해주세요</h3>
	<input type="password" value=""  class="form-control" name="passwd" />
	<input type="submit"class="btn btn-success"  value="정보변경하기"/>
	
	</form:form>
			
			
			
			</div>
		</div>
	</div>





</body>
</html>