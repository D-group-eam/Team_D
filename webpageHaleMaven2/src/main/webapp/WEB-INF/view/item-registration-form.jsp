<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="path" value="${pageContext.request.contextPath}"/>

<!doctype html>
<html>
<head>
<title>안녕~</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- CSRF 토큰 -->
<meta id="_csrf" name="_csrf" content="${_csrf.token}"/>
<!-- default header name is X-CSRF-TOKEN -->
<meta id="_csrf_header" name="_csrf_header" content="${_csrf.headerName}"/>

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
	
	<script>
	// jQuery
	$(document).ready(function(){
	    // spring  security post 전송시 403 에러 대처 패치
	    var token = $("meta[name='_csrf']").attr("content");
	    var header = $("meta[name='_csrf_header']").attr("content");
	    $(function() {
	        $(document).ajaxSend(function(e, xhr, options) {
	            xhr.setRequestHeader(header, token);
	        });
	    });
	</script>
	
	
	<script>
	var oTbl;
	//Row 추가
	function insRow() {
	  oTbl = document.getElementById("addTable");
	  var oRow = oTbl.insertRow();
	  oRow.onmouseover=function(){oTbl.clickedRowIndex=this.rowIndex}; //clickedRowIndex - 클릭한 Row의 위치를 확인;
	  var oCell = oRow.insertCell();

	  //삽입될 Form Tag
	  var frmTag = "<input type=text name=addText[] placeholder=이름>" + " " +"<input type = text name =addPrice[] placeholder=가격>";
	  frmTag += "<input type=button value='삭제' onClick='removeRow()' style='cursor:hand'>";
	  oCell.innerHTML = frmTag;
	}
	//Row 삭제
	function removeRow() {
	  oTbl.deleteRow(oTbl.clickedRowIndex);
	}


</script>
	
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
							<li ><a href="${pageContext.request.contextPath}/admin/memberList">회원목록</a></li>
							<li class="active"><a href="${pageContext.request.contextPath}/shop/addItem">상품등록</a></li>

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
      <h1 class="bg-primary text-center" style="width:100%; padding-top:20px; padding-bottom:20px; text-align:center">상품등록</h1>
      <div class="col-xs-3 col-sm-3"></div>
     <div class="col-xs-6 col-sm-6">

<!-- -------------------------------------------------------------------------------------------- -->

<%-- <form action = "${pageContext.request.contextPath}/shop/addItemProcessing2" enctype="multipart/form-data"  method="POST" >

<input type="text" name = "mit_name" >
<button type="submit" >sdf </button>

</form> --%>
	
	 <form action="${pageContext.request.contextPath}/shop/addItemProcessing" 
						  	 enctype="multipart/form-data"  modelAttribute="item" method="POST"
						  	   > 
						  	   
						  	   	
	
	<table class="table table-striped" >
	
	<tr>
	<th>상품 제목 </th>
	<td><input type="text" name ="mit_name" placeholder="이름"/></td>
	</tr>
	
	<tr>
	<th>요약</th>
	<td><input type="text" name="mit_summary" placeholder="요약"/></td>
	</tr>
	
	<tr>
	<th>상세 설명</th>
	<td><input type="text" name="mit_content" placeholder="상세 설명"/></td>
	</tr>
	
	<tr>
	<th>가격</th>
	<td><input type="text" name="mit_price" placeholder="가격"/></td>
	</tr>
	
	<tr>
	<th>이미지</th>
 	<td><input type = "file" name="mit_file"/></td>
 </tr>
	<tr>
	<th>옵션</th>
	<td>

<table>
  <tr>
    <td >
      <table >
        <tr>
         <td>
         <input name="addButton" type="button" onClick="insRow()" value="추가">
         </td>
        </tr>
        <tr>
         <td>
          <table id="addTable">
            <tr>
              <td><input type="text" name="addText[]" placeholder="이름">
              <input type ="text" name ="addPrice[]" placeholder="가격"></td>
            </tr>
          </table>
         </td>
        </tr>
       </table>
      </td>
   </tr>
 </table>


<input type="submit"class="btn btn-success"  value="정보변경하기"/>			
<button type="submit" class="btn btn-primary" onClick="location.href='${pageContext.request.contextPath}/'">가입취소</button>
	
	<%-- <input type="hidden"
							   name="${_csrf.parameterName}"
							   value="${_csrf.token}" /> --%>

</td>
</tr>


</table>				  	   
</form>

</div>
</div>
</div>
</div>

</body>
</html>
