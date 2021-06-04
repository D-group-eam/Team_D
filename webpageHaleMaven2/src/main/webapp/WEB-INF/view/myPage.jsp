<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@taglib  prefix="spring" uri="http://www.springframework.org/tags" %>     
<%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>


<!doctype html>
<html>
<head>
<title>마이페이지</title>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<link rel="stylesheet"
		 href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
	
	<script	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

<!-- 탑 메뉴 -->

<div class="container">
      <div class="row">
      <div class="col-md-5  toppad  pull-right col-md-offset-3 ">
       <br>
      </div>
        <div class="col-xs-12 col-sm-12 col-md-6 col-lg-6 col-xs-offset-0 col-sm-offset-0 col-md-offset-3 col-lg-offset-3 toppad" >
   
   
          <div class="panel panel-info">
            <div class="panel-heading">
              <h3 class="panel-title">${theMember.mem_username}님의 프로필 정보</h3>
            </div>
            <div class="panel-body">
              <div class="row">
                <div class="col-md-3 col-lg-3 " align="center"> 
                <img src="" class="img-circle img-responsive"/> 
                </div>
 
                <div class=" col-md-9 col-lg-9 "> 
                  <table class="table table-user-information">
                    <tbody>
                      <tr>
                        <td>닉네임:</td>
                        <td>${theMember.mem_nickname}</td>
                      </tr>                 
                      <tr>
                        <td>성별:</td>
                        <td>${theMember.mem_sex}</td>
                      </tr>
                      <tr>
                        <td>연락처:</td>
                        <td>${theMember.mem_phone}</td>
                      </tr>
                      <tr>
                        <td>생일:</td>
                        <td>${theMember.mem_birthday}</td>
                           
                      </tr>
                      <tr>
                        <td>이메일 주소:</td>
                        <td><a href="mailto:info@support.com">${theMember.mem_email}</a></td>
                      </tr>
                      
                     
                    </tbody>
                  </table>
                  
                  
                </div>
              </div>
            </div>
                 <div class="panel-footer">
                        <a data-original-title="Broadcast Message" data-toggle="tooltip" type="button" class="btn btn-sm btn-primary"><i class="glyphicon glyphicon-envelope"></i></a>
                        <span class="pull-right">
                            <a href="${pageContext.request.contextPath}/member/editMember" data-original-title="Edit this user" data-toggle="tooltip" type="button" class="btn btn-sm btn-warning">
                            <i class="glyphicon glyphicon-edit"></i>
                            </a>
                            
                            <a data-original-title="Remove this user" data-toggle="tooltip"  type="button" class="btn btn-sm btn-danger" onClick="self.close();">
                            <i class="glyphicon glyphicon-remove">
                            </i>
                            </a>
                            
                        </span>
                    </div>
            
          </div>
        </div>
      </div>
    </div>

<br>
<a href="${pageContext.request.contextPath}/">홈으로</a>

</body>
</html>
