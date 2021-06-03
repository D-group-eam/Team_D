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

	<div>
		
		<div id="loginbox" style="margin-top: 50px;"
			class="mainbox col-md-3 col-md-offset-2 col-sm-6 col-sm-offset-2">
			
			<div class="panel panel-info">

				<div class="panel-heading">
					<div class="panel-title">로그인</div>
				</div>

				<div style="padding-top: 30px" class="panel-body">

<!-- Login Form -->
					<form action="${pageContext.request.contextPath}/authenticateTheUser" 
						  method="POST" class="form-horizontal">

	<!-- 메시지 파트 -->
					    <div class="form-group">
					        <div class="col-xs-15">
					            <div>
								
		<!-- 로그인 메시지 -->
								
									<c:if test="${param.error != null}">
										
										<div class="alert alert-danger col-xs-offset-1 col-xs-10">
											아이디와 비밀번호가 맞지 않아요
										</div>
		
									</c:if>
										
		<!-- 로그아웃 메시지 -->

									<c:if test="${param.logout != null}">
										            
										<div class="alert alert-success col-xs-offset-1 col-xs-10">
											로그아웃 완료됐어요
										</div>
								    
									</c:if>
									
					            </div>
					        </div>
					    </div>

	<!-- 유저 이름 입력 파트-->
						<div style="margin-bottom: 25px" class="input-group">
							<span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span> 
							
							<input type="text" name="username" placeholder="아이디" class="form-control">
						</div>

	<!-- 패스워드 버튼 입력 파트-->
						<div style="margin-bottom: 25px" class="input-group">
							<span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span> 
							
							<input type="password" name="password" placeholder="비밀번호" class="form-control" >
						</div>

	<!-- 로그인버튼 -->
						<div style="margin-top: 10px" class="form-group">						
							<div class="col-sm-6 controls">
								<button type="submit" class="btn btn-success">로그인</button>
							</div>
						</div>

	<!-- CSRF 토큰 -->						
						<input type="hidden"
							   name="${_csrf.parameterName}"
							   value="${_csrf.token}" />
				
					</form>

				</div>
				
			</div>
<!-- 회원가입 버튼 -->
			<div>
				<a href="${pageContext.request.contextPath}/register/showRegistrationForm" class="btn btn-primary" role="button" aria-pressed="true">회원가입</a>
			</div>
			
			
				<a href="${pageContext.request.contextPath}/">홈으로</a>
			

		</div>

	</div>

</body>
</head></html>