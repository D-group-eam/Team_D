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
							<li class="active"><a href="${pageContext.request.contextPath}/admin/memberList">회원목록</a></li>
							<li><a href="${pageContext.request.contextPath}/shop/addItem">상품등록</a></li>

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
<div class="col-xs-12 col-sm-12">
      <h1 class="bg-primary text-center" style="width:100%; padding-top:20px; padding-bottom:20px; text-align:center">회원목록</h1>
      <div class="col-xs-3 col-sm-3"></div>
     <div class="col-xs-6 col-sm-6">




</div>
</div>
</div>
</div>

<!-- ---------------------------------------------------------------------------------------------------------
 -->

<table class="table table-striped">
<thead>
<tr>
<th>ID</th>
<th>상품</th>
<th>별명</th>
<th>이메일</th>
<th>생일</th>
<th>비고</th>
</tr>
</thead>

<c:forEach var = "tempMember" items="${members}" >
<!-- 유저별 업데이트 링크 -->
<!-- 파라미터에 멤버 아이디를 넣어서 전달 -->
<%-- <c:url var ="updateLink" value="/member/editMember">
</c:url> --%>

<!-- 유저별 삭제 링크 -->
<c:url var ="deleteLink" value="/admin/delete/${tempMember.mem_username}">
</c:url>

<tr>
<td>${tempMember.mem_id}</td>
<td>${tempMember.mem_username}</td>
<td>${tempMember.mem_nickname}</td>
<td>${tempMember.mem_email}</td>
<td>${tempMember.mem_birthday}</td>
<!-- 업데이트 버튼 -->
<td>
<button type="button" class="btn btn-success" data-toggle="modal" data-target="#${tempMember.mem_id}" >
  수정
</button>



<!-- 삭제 버튼 -->
<button type="submit" class="btn btn-danger" onClick="location.href='${deleteLink}'">삭제</button>
</td>
</tr>
	<form:form action="${pageContext.request.contextPath}/admin/saveMember" 
						modelAttribute="EditMember"  class="">

<!-- 회원 정보 수정 창 -->
<div class="modal fade" id="${tempMember.mem_id}" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel">Modal 제목</h4>
      </div>
      
<!--  바꾸는 부분 -->
      <div class="modal-body">
      
       
						
             등록할 회원 ID
             : ${tempMember.mem_username}
              <form:input type= "hidden" path="mem_username" value= "${tempMember.mem_username }"/>
            
 
             이름 
              
              <form:errors path="mem_nickname" cssClass="error"/>
              <form:input class="form-control" path="mem_nickname"  value = "${tempMember.mem_nickname}"/>
             
 
            
              Email
			
			<form:errors path="mem_email" cssClass="error"/>
			<form:input class="form-control" path="mem_email" value = "${tempMember.mem_email}"/>
			
            

            
              연락처 
              
              <form:errors path="mem_phone" cssClass="error"/>
              <form:input class="form-control" path="mem_phone" value = "${tempMember.mem_phone}"/>
              
            
 
            
              주소 
			
			<form:errors path="mem_address1" cssClass="error"/>
			<form:input class="form-control" path="mem_address1" value = "${tempMember.mem_address1}"/>
			
            
            
			
              주소2 
		
			<form:errors path="mem_address2" cssClass="error"/>
			<form:input class="form-control" path="mem_address2" value = "${tempMember.mem_address2}"/>
			
            
            
             주소3
		
			<form:errors path="mem_address3" cssClass="error"/>
			<form:input class="form-control" path="mem_address3" value = "${tempMember.mem_address3}"/>
	
             주소4
			
			<form:errors path="mem_address4" cssClass="error"/>
			<form:input class="form-control" path="mem_address4"  value = "${tempMember.mem_address4}"/>

             우편번호
			
			<form:errors path="mem_zipcode" cssClass="error"/>
			<form:input class="form-control" path="mem_zipcode" value = "${tempMember.mem_zipcode}"/>
			
 
           
             성별
             
              <form:errors path="mem_sex" cssClass="error"/>
              <form:select calss="form-control" path="mem_sex" value = "${tempMember.mem_sex}"> 
              	<form:option value="0" label="남자" />
              	<form:option value="1" label="여자"/> 
              </form:select>
            
             
              이메일 수신
              
    			<form:radiobutton path="mem_receive_email" value="1" label="수신" />
    			<form:radiobutton path="mem_receive_email" value="0" label="비수신" />
    			<form:errors path="mem_receive_email" cssClass="error"/>
    			
             
              문자 수신 
              
				<form:radiobutton path="mem_receive_sms" value="1" label="수신" />
    			<form:radiobutton path="mem_receive_sms" value="0" label="비수신" />
				<form:errors path="mem_receive_sms" cssClass="error"/>              
             
            
            
            
            	생일
            	
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
            	<form:input path="mem_birthday" type="text" id="datepicker1" class="form-control" value = "${tempMember.mem_birthday}" />
                  
      </div>
      <div class="modal-footer">
         <input type="submit"class="btn btn-success"  value="정보변경하기"/>

        <button type="button" class="btn btn-default" data-dismiss="modal">닫기</button>
        
      </div>
    </div>
  </div></div>

            </form:form>


</c:forEach>


</table>

</body>
</html>