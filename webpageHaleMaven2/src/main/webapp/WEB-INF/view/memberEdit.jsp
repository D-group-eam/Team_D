<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  

<!doctype html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<!-- 부트스트랩-->
	<link rel="stylesheet"
		 href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>	
	<script	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	
	
	<link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
	<script src="//code.jquery.com/jquery.min.js"></script>
	<script src="//code.jquery.com/ui/1.11.4/jquery-ui.min.js"></script>
	
		
		<style>
		.error {color:red}
	</style>
	
<title>관리자페이지</title>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
</head>
<body>

<!-- 탑 메뉴 -->
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
							<li class="active"><a href="${pageContext.request.contextPath}/member/editMember">회원 정보 변경</a></li>
							<li><a href="${pageContext.request.contextPath}/member/changePassword">비밀번호변경</a></li>

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

<div class="rows">
<div class="container">
 
   <div clss="col-xs-12 col-sm-12">
      <h1 class="bg-primary text-center" style="width:100%; padding-top:20px; padding-bottom:20px; text-align:center">회원 정보 수정</h1>
      <div class="col-xs-3 col-sm-3"></div>
     <div class="col-xs-6 col-sm-6">
 

      
<!-- 수정 폼 -->
		<form:form action="${pageContext.request.contextPath}/member/saveMember" 
						modelAttribute="EditMember"  class="">
						
         <table class="table table-striped" >
            <tr>
              <th>등록할 회원 ID </th>
              <td> ${EditMember.mem_username}</td>
              <form:input type= "hidden" path="mem_username"/>
            </tr>
 
            <tr>
              <th>이름 </th>
              <td>
              <form:errors path="mem_nickname" cssClass="error"/>
              <form:input class="form-control" path="mem_nickname" />
              </td>
            </tr>
 
            <tr>
              <th>Email</th>
			<td>
			<form:errors path="mem_email" cssClass="error"/>
			<form:input class="form-control" path="mem_email" />
			</td>
            </tr>

            <tr>
              <th>연락처 </th>
              <td>
              <form:errors path="mem_phone" cssClass="error"/>
              <form:input class="form-control" path="mem_phone" />
              </td>
            </tr> 
 
            <tr>
              <th>주소 </th>
			<td>
			<form:errors path="mem_address1" cssClass="error"/>
			<form:input class="form-control" path="mem_address1" />
			</td>
            </tr>
            
			<tr>
              <th>주소2 </th>
			<td>
			<form:errors path="mem_address2" cssClass="error"/>
			<form:input class="form-control" path="mem_address2" />
			</td>
            </tr>
            <tr>
            
              <th>주소3 </th>
			<td>
			<form:errors path="mem_address3" cssClass="error"/>
			<form:input class="form-control" path="mem_address3" />
			</td>
            </tr>
            <tr>
            
              <th>주소4 </th>
			<td>
			<form:errors path="mem_address4" cssClass="error"/>
			<form:input class="form-control" path="mem_address4" />
			</td>
            </tr>

            <tr>
              <th>우편번호</th>
			<td>
			<form:errors path="mem_zipcode" cssClass="error"/>
			<form:input class="form-control" path="mem_zipcode" />
			</td>
            </tr>
 
            <tr>
              <th>성별 </th>
              <td>
              <form:errors path="mem_sex" cssClass="error"/>
              <form:select calss="form-control" path="mem_sex"> 
              	<form:option value="0" label="남자" />
              	<form:option value="1" label="여자"/> 
              </form:select>
              </td>
            </tr>
            
             <tr>
              <th>이메일 수신 </th>
              <td>
    			<form:radiobutton path="mem_receive_email" value="1" label="수신" />
    			<form:radiobutton path="mem_receive_email" value="0" label="비수신" />
    			<form:errors path="mem_receive_email" cssClass="error"/>
    			
              </td>
            </tr>
            <tr>
              <th>문자 수신 </th>
              <td>
				<form:radiobutton path="mem_receive_sms" value="1" label="수신" />
    			<form:radiobutton path="mem_receive_sms" value="0" label="비수신" />
				<form:errors path="mem_receive_sms" cssClass="error"/>              
              </td>
            </tr>
            
            
            <tr>
            	<th>생일</th>
            	<td>
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
            	<form:input path="mem_birthday" type="text" id="datepicker1" class="form-control" />
            	</td>
            </tr>
 
            <tr class="text-center">
              <td colspan="2">
                <input type="hidden" name="id1" value="" >
                <input type="submit"class="btn btn-success"  value="정보변경하기"/>
              </td>
            </tr>
         </table>
         
    </form:form>

							
     </div>
   </div>
 
 
</div>
</div>				
			
</body>
</html>
