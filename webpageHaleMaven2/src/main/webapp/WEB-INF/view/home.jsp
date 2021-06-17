<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="path" value="${pageContext.request.contextPath}"/>

<!doctype html>
<html>
<head>
<title>That day 그날의 너</title>

<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<!--  <meta name="viewport" contnent="width=device-width, initial-scale=1.0">
 --> 
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    
    
<!-- 부트스트랩-->
	<!-- <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script> -->
		
	<meta charset="UTF-8">
    <meta name="description" content="Ogani Template">
    
    <meta name="keywords" cotent="Ogani, unica, creative, html">
    <meta name="viewport" contnent="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Ogani | Template</title>

    <!-- Google Font -->
    <link href="https://fonts.googleapis.com/css2?family=Cairo:wght@200;300;400;600;900&display=swap" rel="stylesheet">

    <!-- Css Styles -->
    <%@ include file="./include/include.jsp"  %>
    
</head>

<body>
  <!-- Page Preloder 카테고리  -->

    <div id="preloder">
        <div class="loader"></div>
    </div> 
        <nav class="humberger__menu__nav mobile-menu">
        
        
                <div class="row" style=" height: 730px;">
                    <div style="width: 240px;padding:0px;height:700px;margin-left:80px;">

<!-- 로고 <div class="Logo" style="margin-top: 300;"><img src="img/banner/logo.jpg" alt="logo"></div> -->


<!--카테고리-->
                        <div class="hero__categories">
                                <div class="hero__categories__all">
                                <i class="fa fa-bars"></i>
                                <span>All departments</span>
                                </div> 
                
                                <ul class="main" style="padding:0px;text-align: center">
                                    <li><a href="${path}/" style="color:rgb(159, 9, 9);font-size:26px;font-weight: 800">HOME</a></li>
                                    <li><a href="/webpageHaleMaven2/main/NEW" style="color:rgb(85, 82, 82);font-size:20px;font-weight: 800">NEW</a></li>
                                    <li><a href="/webpageHaleMaven2/main/TOP" style="color:rgb(85, 82, 82);font-size:20px;font-weight: 800">TOP</a></li>
                                    <li><a href="/webpageHaleMaven2/main/Knit" style="color: rgb(192, 183, 171);">Knit</a></li>
                                    <li><a href="/webpageHaleMaven2/main/Tee" style="color: rgb(192, 183, 171);">Tee</a></li>
                                    <li><a href="/webpageHaleMaven2/main/Shirts" style="color: rgb(192, 183, 171);">Shirts</a></li>
                                    <li><a href="/webpageHaleMaven2/main/BOTTOM" style="color:rgb(85, 82, 82);font-size:20px;font-weight: 800">BOTTOM</a></li>
                                    <li><a href="/webpageHaleMaven2/main/Denim" style="color: rgb(192, 183, 171);">Denim</a></li>
                                    <li><a href="/webpageHaleMaven2/main/Pants" style="color: rgb(192, 183, 171);">Pants</a></li>
                                    <li><a href="/webpageHaleMaven2/main/Half" style="color: rgb(192, 183, 171);">Half</a></li>
                                    <li><a href="/webpageHaleMaven2/main/OUTER" style="color:rgb(85, 82, 82);font-size:20px;font-weight: 800">OUTER</a></li>
                                    <li><a href="/webpageHaleMaven2/main/SHOES" style="color:rgb(85, 82, 82);font-size:20px;font-weight: 800">SHOES</a></li>
                                </ul>
                        </div>
                    </div>
               <!-- 윗부분 -->
                  
                    

    <!-- 상단바 -->
                <div class="col-lg-9" >
                    <main class="main" id="top"style="margin:0px;">
                        <nav class="navbar navbar-expand-lg navbar-light py-3 d-block" data-navbar-on-scroll="data-navbar-on-scroll" style="margin:0px;">
                            <div class="container">
                                <button class="navbar-toggler collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation"><span class="navbar-toggler-icon"></span></button>
                                <div class="collapse navbar-collapse border-top border-lg-0 mt-4 mt-lg-0" id="navbarSupportedContent">
                                    <ul class="navbar-nav mx-auto pt-2 pt-lg-0 font-base">
                                        <li class="nav-item px-6"><a class="nav-link fw-medium active" aria-current="page" href="#destinations"><span class="nav-link-icon text-800 fas fa-map-marker-alt"></span><span class="nav-link-text">NOTICE </span></a></li>
                                        <li class="nav-item px-6"><a class="nav-link fw-medium active" aria-current="page" href="#destinations"><span class="nav-link-icon text-800 fas fa-map-marker-alt"></span><span class="nav-link-text">Q & A </span></a></li>
                                        <li class="nav-item px-6"><a class="nav-link fw-medium active" aria-current="page" href="/webpageHaleMaven2/order/orderList?nickname=nickname0&page=1#"><span class="nav-link-icon text-800 fas fa-map-marker-alt"></span><span class="nav-link-text">CART </span></a></li>
                                        <li class="nav-item px-6"><a class="nav-link fw-medium active" aria-current="page" href="${pageContext.request.contextPath}/member/"><span class="nav-link-icon text-800 fas fa-map-marker-alt"></span><span class="nav-link-text">MY PAGE </span></a></li>
                                        <security:authorize access="isAuthenticated()">
                                        <li class="nav-item px-6"><a class="nav-link fw-medium active" aria-current="page" href="${pageContext.request.contextPath}/admin/"><span class="nav-link-icon text-800 fas fa-map-marker-alt"></span><span class="nav-link-text">ADMIN </span></a></li>
                                        </security:authorize>
                                        <li class="nav-item px-6"><a class="nav-link fw-medium active" aria-current="page" href=""><i class="fa fa-heart"></i></a></li>
                                        
	
                                    </ul>
                                
                                   
							
                                   	
                                    
                               		 <security:authorize access="isAnonymous()">
                               		 
										<button class="nav-item px-4 btn text-900 order-1 order-lg-0 me-2" style="font-size:20px" type="submit" onClick="location.href='${pageContext.request.contextPath}/login'" > 
                                         <span class="login">
                                         	LOGIN
                                         </span>
										</button>
									</security:authorize>
                                   	
                                   	
									<security:authorize access="isAuthenticated()">
										<form:form action="${pageContext.request.contextPath}/logout" method="POST">\
										<span class="login">
										<input class="btn text-800 order-1 order-lg-0 me-2"style="font-size:20px" type="submit"class="btn btn-danger"  value="LOGOUT"/>
                                         </span>
										</form:form>
									</security:authorize>
	
									<%-- <security:authorize access="isAuthenticated()">
										<form:form action="${pageContext.request.contextPath}/logout" method="POST">
                                        	<input class="btn text-800 order-1 order-lg-0 me-2"style="font-size:20px" type="button" value = "LOGOUT"/>
                                        </form:form>
                       				</security:authorize> --%>
                        			
                        			
                        			
                                        <button class="btn btn-voyage-outline order-0" type="submit" style="font-size:20px" onClick="location.href='${pageContext.request.contextPath}/register/showRegistrationForm'">
                                        <span class="text-primary">
                                        Sign up</span>
                                        </button>
                                        
                                
                                </div>
                            </div>
                        </nav>
                       


<!-- 검색기능 -->  
<div class="searchbox">
    <div class="header">
      <input onkeyup="filter()" type="text" id="value" placeholder="Type to Search" >
      <a class="nav-icon d-none d-lg-inline" href="#" data-bs-toggle="modal" data-bs-target="#templatemo_search">
        <i class="fa fa-fw fa-search text-dark mr-2"></i></a>
    </div>
</div>


<!-- BEST 아이템   -->
                            <div class="section-title" style="margin-top:70px" >
                                <h2 style="font-size:40px">Daily Best</h2>
                            </div>

                            <div class="featured__controls">
                            
                             <!-- <section class="categories">  -->
                                <div class="container";>
                                    <div class="row">
                                        <div class="categories__slider owl-carousel">



                                            <div class="col-lg-12">
                                                <div class="categories__item set-bg" data-setbg="<c:url value='/upload/image/best_item/B화이트와이드진.jpg'/>">
                                                    <!-- <h5><a href="#">Fresh Fruit</a></h5> -->
                                                    <div class="featured__item__text">
                                                        <h6 style="background-color: rgba(255, 255, 255, 0.7);font-weight: 700;"><b href="#">화이트 와이드 진</b></h6>
                                                        <!-- style="background-color: aliceblue; color: black; font-size: 15px; width: 80px;text-align: center;" -->
                                                        <h5 style="background-color: rgba(255, 255, 255, 0.7);font-weight: 700;">25,000원</h5>
                                                        <!-- <h5 style="background-color: rgba(255, 255, 255, 0.8); -->
                                                    </div>
                                                </div>
                                            </div>




                                            <div class="col-lg-12">
                                                <div class="categories__item set-bg" data-setbg="<c:url value='/upload/image/best_item/B마가렛오버자켓.jpg'/>">
                                                    <!-- <h5><a href="#">Dried Fruit</a></h5> -->
                                                    <div class="featured__item__text">
                                                        <h6 style="background-color: rgba(255, 255, 255, 0.7);font-weight: 700;"><b href="#">마가렛 오버 자켓</b></h6>
                                                        <h5 style="background-color: rgba(255, 255, 255, 0.7);font-weight: 700;">33,000원</h5>
                                                    </div>
                                                </div>
                                            </div>




                                            <div class="col-lg-12">
                                                <div class="categories__item set-bg" data-setbg="<c:url value='/upload/image/best_item/B스트라이프T.jpg'/>">
                                                    <!-- <h5><a href="#">Vegetables</a></h5> -->
                                                    <div class="featured__item__text">
                                                        <h6 style="background-color: rgba(255, 255, 255, 0.7);font-weight: 700;"><b href="#">Simple 스트라이프T</b></h6>
                                                        <h5 style="background-color: rgba(255, 255, 255, 0.7);font-weight: 700;">39,900원</h5>
                                                    </div>
                                                 </div>
                                            </div>



                                            <div class="col-lg-12">
                                                <div class="categories__item set-bg" data-setbg="<c:url value='/upload/image/best_item/B후크와이드청바지.jpg'/>">
                                                    <!-- <h5><a href="#">drink fruits</a></h5> -->
                                                    <div class="featured__item__text">
                                                        <h6 style="background-color: rgba(255, 255, 255, 0.7);font-weight: 700;"><b href="#">후크 와이드 청바지</b></h6>
                                                        <h5 style="background-color: rgba(255, 255, 255, 0.7);font-weight: 700;">59,000원</h5>
                                                    </div>
                                                </div>
                                            </div>



                                            <div class="col-lg-12">
                                                <div class="categories__item set-bg" data-setbg="<c:url value='/upload/image/best_item/B레귤러캣브리쉬.jpg'/>">
                                                    <!-- <h5><a href="#">drink fruits</a></h5> -->
                                                    <div class="featured__item__text">
                                                        <h6 style="background-color: rgba(255, 255, 255, 0.7);font-weight: 700;"><b href="#">레귤러 캣브리쉬 데님</b></h6>
                                                        <h5 style="background-color: rgba(255, 255, 255, 0.7);font-weight: 700;">27,900원</h5>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                    </main>
                    
                    </div>
                </div> 
        </nav>  

<!-- 메인 아이템들-->
 <section class="featured spad">
        <div class="container">
            <div class="row">
                <div class="col-lg-12">
                </div>
            </div>
     <!-- 1 -->
            <div class="row featured__filter">
                <div class="col-lg-3 col-md-4 col-sm-6 mix oranges fresh-meat">
                    <div class="featured__item">
                        <div class="featured__item__pic set-bg" data-setbg="<c:url value='/upload/image/main_item/1.jpg'/>">
                                <ul class="featured__item__pic__hover">
                                    <li><a href="#"><i class="fa fa-heart"></i></a></li>
                                    <!-- <li><a href="#"><i class="fa fa-retweet"></i></a></li> -->
                                    <li><a href="#"><i class="fa fa-shopping-cart"></i></a></li>
                                </ul>
                        </div>  
                        <div class="featured__item__text">
                            <h6><a href="#">피그먼트 반팔셔츠</a></h6>
                            <h7>26,000원</h7>
                        </div>
                    </div>
                </div>
    <!-- 2 -->
                <div class="col-lg-3 col-md-4 col-sm-6 mix vegetables fastfood">
                        <div class="featured__item">
                            <div class="featured__item__pic set-bg" data-setbg="<c:url value='/upload/image/main_item/2.jpg'/>">
                                    <ul class="featured__item__pic__hover">
                                        <li><a href="#"><i class="fa fa-heart"></i></a></li>
                                        <!-- <li><a href="#"><i class="fa fa-retweet"></i></a></li> -->
                                        <li><a href="#"><i class="fa fa-shopping-cart"></i></a></li>
                                    </ul>
                            </div>  
                                    <div class="featured__item__text">
                                        <h6><a href="#">라프 린넨 티</a></h6>
                                        <h7>13,000원</h7>
                                    </div>
                        </div>
                </div>
    <!-- 3 -->
                <div class="col-lg-3 col-md-4 col-sm-6 mix vegetables fresh-meat">
                    <div class="featured__item">
                        <div class="featured__item__pic set-bg" data-setbg="<c:url value='/upload/image/main_item/3.jpg'/>">
                                <ul class="featured__item__pic__hover">
                                    <li><a href="#"><i class="fa fa-heart"></i></a></li>
                                    <!-- <li><a href="#"><i class="fa fa-retweet"></i></a></li> -->
                                    <li><a href="#"><i class="fa fa-shopping-cart"></i></a></li>
                                </ul>
                        </div>  
                        <div class="featured__item__text">
                            <h6><a href="#">레인지 반팔T</a></h6>
                            <h7>13,000원</h7>
                        </div>
                    </div>
                </div>
    <!-- 4 -->
                <div class="col-lg-3 col-md-4 col-sm-6 mix fastfood oranges">
                    <div class="featured__item">
                        <div class="featured__item__pic set-bg" data-setbg="<c:url value='/upload/image/main_item/4.jpg'/>">
                                <ul class="featured__item__pic__hover">
                                    <li><a href="#"><i class="fa fa-heart"></i></a></li>
                                    <!-- <li><a href="#"><i class="fa fa-retweet"></i></a></li> -->
                                    <li><a href="#"><i class="fa fa-shopping-cart"></i></a></li>
                                </ul>
                        </div>  
                        <div class="featured__item__text">
                            <h6><a href="#">쿨 니트 반팔T</a></h6>
                            <h7>10,000원</h7>
                        </div>
                    </div>
                </div>
            </div>

    <!-- 5 -->
             <div class="row featured__filter">
                <div class="col-lg-3 col-md-4 col-sm-6 mix oranges fresh-meat">
                    <div class="featured__item">
                        <div class="featured__item__pic set-bg" data-setbg="<c:url value='/upload/image/main_item/5.jpg'/>">
                                <ul class="featured__item__pic__hover">
                                    <li><a href="#"><i class="fa fa-heart"></i></a></li>
                                    <!-- <li><a href="#"><i class="fa fa-retweet"></i></a></li> -->
                                    <li><a href="#"><i class="fa fa-shopping-cart"></i></a></li>
                                </ul>
                        </div>  
                        <div class="featured__item__text">
                            <h6><a href="#">리버시블 맨투맨</a></h6>
                            <h7>18,000원</h7>
                        </div>
                    </div>
                </div>
    <!-- 6 -->
                <div class="col-lg-3 col-md-4 col-sm-6 mix vegetables fastfood">
                        <div class="featured__item">
                            <div class="featured__item__pic set-bg" data-setbg="<c:url value='/upload/image/main_item/6.jpg'/>">
                                    <ul class="featured__item__pic__hover">
                                        <li><a href="#"><i class="fa fa-heart"></i></a></li>
                                        <!-- <li><a href="#"><i class="fa fa-retweet"></i></a></li> -->
                                        <li><a href="#"><i class="fa fa-shopping-cart"></i></a></li>
                                    </ul>
                            </div>  
                                    <div class="featured__item__text">
                                        <h6><a href="#">마가렛 와이드 팬츠</a></h6>
                                        <h7>25,000원</h7>
                                    </div>
                        </div>
                </div>
    <!-- 7 -->
                <div class="col-lg-3 col-md-4 col-sm-6 mix vegetables fresh-meat">
                    <div class="featured__item">
                        <div class="featured__item__pic set-bg" data-setbg="<c:url value='/upload/image/main_item/7.jpg'/>">
                                <ul class="featured__item__pic__hover">
                                    <li><a href="#"><i class="fa fa-heart"></i></a></li>
                                    <!-- <li><a href="#"><i class="fa fa-retweet"></i></a></li> -->
                                    <li><a href="#"><i class="fa fa-shopping-cart"></i></a></li>
                                </ul>
                        </div>  
                        <div class="featured__item__text">
                            <h6><a href="#">N사이드 지퍼 팬츠</a></h6>
                            <h7>26,000원</h7>
                        </div>
                    </div>
                </div>
    <!-- 8 -->
                <div class="col-lg-3 col-md-4 col-sm-6 mix fastfood oranges">
                    <div class="featured__item">
                        <div class="featured__item__pic set-bg" data-setbg="<c:url value='/upload/image/main_item/8.jpg'/>">
                                <ul class="featured__item__pic__hover">
                                    <li><a href="#"><i class="fa fa-heart"></i></a></li>
                                    <!-- <li><a href="#"><i class="fa fa-retweet"></i></a></li> -->
                                    <li><a href="#"><i class="fa fa-shopping-cart"></i></a></li>
                                </ul>
                        </div>  
                        <div class="featured__item__text">
                            <h6><a href="#">N풀오버</a></h6>
                            <h7>26,000원</h7>
                        </div>
                    </div>
                </div>
            </div>
    <!-- 9 -->
    <div class="row featured__filter">
        <div class="col-lg-3 col-md-4 col-sm-6 mix oranges fresh-meat">
            <div class="featured__item">
                <div class="featured__item__pic set-bg" data-setbg="<c:url value='/upload/image/main_item/9.jpg'/>">
                        <ul class="featured__item__pic__hover">
                            <li><a href="#"><i class="fa fa-heart"></i></a></li>
                            <!-- <li><a href="#"><i class="fa fa-retweet"></i></a></li> -->
                            <li><a href="#"><i class="fa fa-shopping-cart"></i></a></li>
                        </ul>
                </div>  
                <div class="featured__item__text">
                    <h6><a href="#">7003청자켓</a></h6>
                    <h7>26,000원</h7>
                </div>
            </div>
        </div>
    <!-- 10 -->
        <div class="col-lg-3 col-md-4 col-sm-6 mix vegetables fastfood">
                <div class="featured__item">
                    <div class="featured__item__pic set-bg" data-setbg="<c:url value='/upload/image/main_item/10.jpg'/>">
                            <ul class="featured__item__pic__hover">
                                <li><a href="#"><i class="fa fa-heart"></i></a></li>
                                <!-- <li><a href="#"><i class="fa fa-retweet"></i></a></li> -->
                                <li><a href="#"><i class="fa fa-shopping-cart"></i></a></li>
                            </ul>
                    </div>  
                            <div class="featured__item__text">
                                <h6><a href="#">모노 스트라이프 셔츠</a></h6>
                                <h7>23,000원</h7>
                            </div>
                </div>
        </div>
    <!-- 11 -->
        <div class="col-lg-3 col-md-4 col-sm-6 mix vegetables fresh-meat">
            <div class="featured__item">
                <div class="featured__item__pic set-bg" data-setbg="<c:url value='/upload/image/main_item/11.jpg'/>">
                        <ul class="featured__item__pic__hover">
                            <li><a href="#"><i class="fa fa-heart"></i></a></li>
                            <!-- <li><a href="#"><i class="fa fa-retweet"></i></a></li> -->
                            <li><a href="#"><i class="fa fa-shopping-cart"></i></a></li>
                        </ul>
                </div>  
                <div class="featured__item__text">
                    <h6><a href="#">3도 스트라이프 셔츠</a></h6>
                    <h7>23,000원</h7>
                </div>
            </div>
        </div>
    <!-- 12 -->
        <div class="col-lg-3 col-md-4 col-sm-6 mix fastfood oranges">
            <div class="featured__item">
                <div class="featured__item__pic set-bg" data-setbg="<c:url value='/upload/image/main_item/12.jpg'/>">
                        <ul class="featured__item__pic__hover">
                            <li><a href="#"><i class="fa fa-heart"></i></a></li>
                            <!-- <li><a href="#"><i class="fa fa-retweet"></i></a></li> -->
                            <li><a href="#"><i class="fa fa-shopping-cart"></i></a></li>
                        </ul>
                </div>  
                <div class="featured__item__text">
                    <h6><a href="#">데일리 무지워싱 반팔T</a></h6>
                    <h7>10,000원</h5>
                </div>
            </div>
        </div>
    </div>

    <!-- 13 -->
        <div class="row featured__filter">
            <div class="col-lg-3 col-md-4 col-sm-6 mix oranges fresh-meat">
                <div class="featured__item">
                    <div class="featured__item__pic set-bg" data-setbg="<c:url value='/upload/image/main_item/13.jpg'/>">
                            <ul class="featured__item__pic__hover">
                                <li><a href="#"><i class="fa fa-heart"></i></a></li>
                                <!-- <li><a href="#"><i class="fa fa-retweet"></i></a></li> -->
                                <li><a href="#"><i class="fa fa-shopping-cart"></i></a></li>
                            </ul>
                    </div>  
                    <div class="featured__item__text">
                        <h6><a href="#">Flach back티</a></h6>
                        <h5>13,000원</h5>
                    </div>
                </div>
            </div>
<!-- 14 -->
            <div class="col-lg-3 col-md-4 col-sm-6 mix vegetables fastfood">
                    <div class="featured__item">
                        <div class="featured__item__pic set-bg" data-setbg="<c:url value='/upload/image/main_item/14.jpg'/>">
                                <ul class="featured__item__pic__hover">
                                    <li><a href="#"><i class="fa fa-heart"></i></a></li>
                                    <!-- <li><a href="#"><i class="fa fa-retweet"></i></a></li> -->
                                    <li><a href="#"><i class="fa fa-shopping-cart"></i></a></li>
                                </ul>
                        </div>  
                                <div class="featured__item__text">
                                    <h6><a href="#">아이오와 반바지</a></h6>
                                    <h5>14,000원</h5>
                                </div>
                    </div>
            </div>
<!-- 15 -->
            <div class="col-lg-3 col-md-4 col-sm-6 mix vegetables fresh-meat">
                <div class="featured__item">
                    <div class="featured__item__pic set-bg" data-setbg="<c:url value='/upload/image/main_item/15.jpg'/>">
                            <ul class="featured__item__pic__hover">
                                <li><a href="#"><i class="fa fa-heart"></i></a></li>
                                <!-- <li><a href="#"><i class="fa fa-retweet"></i></a></li> -->
                                <li><a href="#"><i class="fa fa-shopping-cart"></i></a></li>
                            </ul>
                    </div>  
                    <div class="featured__item__text">
                        <h6><a href="#">이프멀티셔츠</a></h6>
                        <h5>30,000원</h5>
                    </div>
                </div>
            </div>
<!-- 16 -->
            <div class="col-lg-3 col-md-4 col-sm-6 mix fastfood oranges">
                <div class="featured__item">
                    <div class="featured__item__pic set-bg" data-setbg="<c:url value='/upload/image/main_item/16.jpg'/>">
                            <ul class="featured__item__pic__hover">
                                <li><a href="#"><i class="fa fa-heart"></i></a></li>
                                <!-- <li><a href="#"><i class="fa fa-retweet"></i></a></li> -->
                                <li><a href="#"><i class="fa fa-shopping-cart"></i></a></li>
                            </ul>
                    </div>  
                    <div class="featured__item__text">
                        <h6><a href="#">웨더 5부 팬츠</a></h6>
                        <h5>26,000원</h5>
                    </div>
                </div>
            </div>
        </div>

<!-- 17 -->
    <div class="row featured__filter">
        <div class="col-lg-3 col-md-4 col-sm-6 mix oranges fresh-meat">
            <div class="featured__item">
                <div class="featured__item__pic set-bg" data-setbg="<c:url value='/upload/image/main_item/17.jpg'/>">
                        <ul class="featured__item__pic__hover">
                            <li><a href="#"><i class="fa fa-heart"></i></a></li>
                            <!-- <li><a href="#"><i class="fa fa-retweet"></i></a></li> -->
                            <li><a href="#"><i class="fa fa-shopping-cart"></i></a></li>
                        </ul>
                </div>  
                <div class="featured__item__text">
                    <h6><a href="#">st린넨티</a></h6>
                    <h5>13,000원</h5>
                </div>
            </div>
        </div>
<!-- 18 -->
        <div class="col-lg-3 col-md-4 col-sm-6 mix vegetables fastfood">
                <div class="featured__item">
                    <div class="featured__item__pic set-bg" data-setbg="<c:url value='/upload/image/main_item/18.jpg'/>">
                            <ul class="featured__item__pic__hover">
                                <li><a href="#"><i class="fa fa-heart"></i></a></li>
                                <!-- <li><a href="#"><i class="fa fa-retweet"></i></a></li> -->
                                <li><a href="#"><i class="fa fa-shopping-cart"></i></a></li>
                            </ul>
                    </div>  
                            <div class="featured__item__text">
                                <h6><a href="#">레귤러 연청 진</a></h6>
                                <h5>24,000원</h5>
                            </div>
                </div>
        </div>
<!-- 19 -->
        <div class="col-lg-3 col-md-4 col-sm-6 mix vegetables fresh-meat">
            <div class="featured__item">
                <div class="featured__item__pic set-bg" data-setbg="<c:url value='/upload/image/main_item/19.jpg'/>">
                        <ul class="featured__item__pic__hover">
                            <li><a href="#"><i class="fa fa-heart"></i></a></li>
                            <!-- <li><a href="#"><i class="fa fa-retweet"></i></a></li> -->
                            <li><a href="#"><i class="fa fa-shopping-cart"></i></a></li>
                        </ul>
                </div>  
                <div class="featured__item__text">
                    <h6><a href="#">와이드 숏 팬츠</a></h6>
                    <h5>20,000원</h5>
                </div>
            </div>
        </div>
<!-- 20 -->
        <div class="col-lg-3 col-md-4 col-sm-6 mix fastfood oranges">
            <div class="featured__item">
                <div class="featured__item__pic set-bg" data-setbg="<c:url value='/upload/image/main_item/20.jpg'/>">
                        <ul class="featured__item__pic__hover">
                            <li><a href="#"><i class="fa fa-heart"></i></a></li>
                            <!-- <li><a href="#"><i class="fa fa-retweet"></i></a></li> -->
                            <li><a href="#"><i class="fa fa-shopping-cart"></i></a></li>
                        </ul>
                </div>  
                <div class="featured__item__text">
                    <h6><a href="#">알란고튼팬츠</a></h6>
                    <h5>26,00`0원</h5>
                </div>
            </div>
        </div>
    </div>

    </section>

    

<!-- Footer Section Begin 바닥글 -->

    <footer class="footer spad">
        <div class="container">
            <div class="row">
                <div class="col-lg-3 col-md-6 col-sm-5 offset-lg-2">
                    <div class="footer__about">
                        <div class="footer__about__logo">
                            <a href="./index.html"><img src="img/banner/logo.jpg" alt=""></a>
                        </div>
                        <ul>
                            <li>Address: 60-49 Road 11378 New York</li>
                            <li>Phone: +65 11.188.888</li>
                            <li>Email: hello@colorlib.com</li>
                        </ul>
                    </div>
                </div>
                <div class="col-lg-3 col-md-4 col-sm-5 offset-lg-1">
                    <div class="footer__widget">
                        <h8 style="text-align: center;">Useful Links</h8>
                       
                        <ul>
                            <li><a href="#">HOME</a></li>
                            <li><a href="#">NEW</a></li>
                            <li><a href="#">TOP</a></li>
                            <li><a href="#">Knit</a></li>
                            <li><a href="#">Tee</a></li>
                            <li><a href="#">Shirts</a></li>
                        </ul>
                    
                        <ul>
                            <li><a href="#">BOTTOM</a></li>
                            <li><a href="#">Denim</a></li>
                            <li><a href="#">Pants</a></li>
                            <li><a href="#">Half</a></li>
                            <li><a href="#">OUTER</a></li>
                            <li><a href="#">SHOES</a></li>
                        </ul>
                    </div>
                </div>
                <div class="col-lg-4 col-md-12">
                    <div class="footer__widget">
                       
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-lg-12">
                    <div class="footer__copyright">
                        <div class="footer__copyright__text"><p><!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
  Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | This template is made with <i class="fa fa-heart" aria-hidden="true"></i> <a>그날의 너</a>
  <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. --></p></div>
                        <div class="footer__copyright__payment"><img src="${path}/img/payment-item.png" alt=""></div>
                    </div>
                </div>
            </div>
        </div>
    </footer>
    <!-- Footer Section End -->


    <!-- Js Plugins -->
    <script src="${path}/js/jquery.nice-select.min.js"></script>
    <script src="${path}/js/jquery-ui.min.js"></script>
    <script src="${path}/js/jquery.slicknav.js"></script>
    <script src="${path}/js/mixitup.min.js"></script>
    <script src="${path}/js/owl.carousel.min.js"></script>
    <script src="${path}/js/main.js"></script>
    <script type="text/javascript">
    
        function filter(){
  
          var value, name, item, i;
  
          value = document.getElementById("value").value.toUpperCase();
          item = document.getElementsByClassName("item");
  
          for(i=0;i<item.length;i++){
            name = item[i].getElementsByClassName("name");
            if(name[0].innerHTML.toUpperCase().indexOf(value) > -1){
              item[i].style.display = "flex";
            }else{
              item[i].style.display = "none";
            }
          }
        }
  </script>
	

</body>

</html>