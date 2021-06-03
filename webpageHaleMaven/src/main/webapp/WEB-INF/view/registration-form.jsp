<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  

<!doctype html>
<html lang="en">

<head>
	<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
	<title>회원가입</title>
	
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	
	<!-- Reference Bootstrap files -->
	<link rel="stylesheet"
		 href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
	
	<script	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	
	<!-- 달력 -->
	<link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
	<script src="//code.jquery.com/jquery.min.js"></script>
	<script src="//code.jquery.com/ui/1.11.4/jquery-ui.min.js"></script>
	
	
	
		<style>
		.error {color:red}
	</style>

</head>

<body>

	<div>
		
		<div id="loginbox" style="margin-top: 50px;"
			class="mainbox col-md-3 col-md-offset-2 col-sm-6 col-sm-offset-2">
			
			<div class="panel panel-primary">

				<div class="panel-heading">
					<div class="panel-title">회원가입 하기</div>
				</div>

				<div style="padding-top: 30px" class="panel-body">

					<!-- 회원가입 Form -->
					<form:form action="${pageContext.request.contextPath}/register/processRegistrationForm" 
						  	   modelAttribute="crmMember"
						  	   class="form-horizontal">

					    <!-- 메시지 : error, alert 등등 ... -->
					    <div class="form-group">
					        <div class="col-xs-15">
					            <div>
								
									<!-- 에러메시지 스타일 -->
									<c:if test="${registrationError != null}">
								
										<div class="alert alert-danger col-xs-offset-1 col-xs-10">
											${registrationError}
										</div>
		
									</c:if>
																			
					            </div>
					        </div>
					    </div>

						<!-- 유저 아이디 -->
						<div style="margin-bottom: 25px" class="input-group">
<!-- 							<span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span> 
 -->							<form:errors path="mem_username" cssClass="error" />
							<form:input path="mem_username" placeholder="아이디 (*)" class="form-control" />
						</div>

						<!-- 비밀번호 -->
						<div style="margin-bottom: 25px" class="input-group">
<!-- 							<span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span> 
 -->							<form:errors path="mem_password" cssClass="error" />
							<form:password path="mem_password" placeholder="비밀번호 (*)" class="form-control" />
						</div>
						
						<!-- 비밀번호 확인-->
						<div style="margin-bottom: 25px" class="input-group">
<!-- 							<span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span> 
 -->							<form:errors path="matchingMem_password" cssClass="error" />
							<form:password path="matchingMem_password" placeholder="비밀번호 확인 (*)" class="form-control" />
						</div>
					
						
						<!-- 닉네임 -->
						<div style="margin-bottom: 25px" class="input-group">
<!-- 							<span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span> 
 -->							<form:errors path="mem_nickname" cssClass="error" />
							<form:input path="mem_nickname" placeholder="별명 (*)" class="form-control" />
						</div>
						
	
						
						<!-- 이메일  -->
						<div style="margin-bottom: 25px" class="input-group">
<!-- 							<span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span> 
 -->							<form:errors path="mem_email" cssClass="error" />
							<form:input path="mem_email" placeholder="이메일 (*)" class="form-control" />
						</div>
						
						
						<div style="margin-bottom: 25px" class="input-group">
							<script>
								$(function() {
									$("#datepicker1").datepicker({
										changeMonth: true,
										chagneYear: true,
										dateFormat : 'yy-mm-dd'
									});
								});
							</script>
							<form:errors path="mem_birthday" cssClass="error"/>
							<form:input path="mem_birthday" placeholder="생일 (*)" type="text" id="datepicker1" class="form-control" />

						</div>
						
						

						<!-- 등록 버튼  -->
						<div style="margin-top: 10px" class="form-group">						
							<div class="col-sm-6 controls">
								<button type="submit" class="btn btn-primary">등록하기</button>
							</div>
						</div>
						
					</form:form>
	<a href="${pageContext.request.contextPath}/">홈으로</a>

				</div>

			</div>

		</div>

	</div>

</body>
</html>