<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang="ko-kr">
<head>
	<meta charset="UTF-8">
	<meta name="description" content="Ogani Template">
	<meta name="keywords" content="Ogani, unica, creative, html">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta http-equiv="X-UA-Compatible" content="ie=edge">
	    
	<title>Ogani 상품 주문 리스트</title>
	
	<%@ include file="../include/include.jsp"  %>
	
	<!-- Google Font -->
    <link href="https://fonts.googleapis.com/css2?family=Cairo:wght@200;300;400;600;900&display=swap" rel="stylesheet">

    <!-- Css Styles -->
    <!-- <link rel="stylesheet" href="css/font-awesome.min.css" type="text/css"> -->
    <!-- <link rel="stylesheet" href="css/elegant-icons.css" type="text/css"> -->
    <!-- <link rel="stylesheet" href="css/nice-select.css" type="text/css"> -->
    <!-- <link rel="stylesheet" href="css/jquery-ui.min.css" type="text/css"> -->
    <!-- <link rel="stylesheet" href="css/owl.carousel.min.css" type="text/css"> -->
    <!-- <link rel="stylesheet" href="css/slicknav.min.css" type="text/css"> -->
    <!-- <link rel="stylesheet" href="css/style.css" type="text/css"> -->
    
</head>
<body>
 <!-- Page Preloder 카테고리  -->

   <!--  <div id="preloder">
        <div class="loader"></div>
    </div>  -->

       <nav class="humberger__menu__nav mobile-menu">
               <div class="row" style="height: 730px;">
                   <div style="width: 240px;padding:0px;height:700px;margin-left:80px;">

<!-- 로고 <div class="Logo" style="margin-top: 300;"><img src="img/banner/logo.jpg" alt="logo"></div> -->

		           <div class="hero__categories">
		                   <div class="hero__categories__all">
		                   <i class="fa fa-bars"></i>
		                   <span>All departments</span>
		                   </div> 
		   
		                   <ul class="main" style="padding:0px;text-align: center">
		                       <li><a href="#" style="color:rgb(85, 82, 82);font-size:20px;font-weight: 800">HOME</a></li>
		                       <li><a href="#" style="color:rgb(85, 82, 82);font-size:20px;font-weight: 800">NEW</a></li>
		                       <li ><a href="#" style="color:rgb(85, 82, 82);font-size:20px;font-weight: 800">TOP</a></li>
		                       <li><a href="#" style="color: rgb(192, 183, 171);">Knit</a></li>
		                       <li><a href="#" style="color: rgb(192, 183, 171);">Tee</a></li>
		                       <li><a href="#" style="color: rgb(192, 183, 171);">Shirts</a></li>
		                       <li><a href="#" style="color:rgb(85, 82, 82);font-size:20px;font-weight: 800">BOTTOM</a></li>
		                       <li><a href="#" style="color: rgb(192, 183, 171);">Denim</a></li>
		                       <li><a href="#" style="color: rgb(192, 183, 171);">Pants</a></li>
		                       <li><a href="#" style="color: rgb(192, 183, 171);">Half</a></li>
		                       <li><a href="#" style="color:rgb(85, 82, 82);font-size:20px;font-weight: 800">OUTER</a></li>
		                       <li><a href="#" style="color:rgb(85, 82, 82);font-size:20px;font-weight: 800">SHOES</a></li>
		                   </ul>
		           </div>
		       </div>


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
		                            <li class="nav-item px-6"><a class="nav-link fw-medium active" aria-current="page" href="#destinations"><span class="nav-link-icon text-800 fas fa-map-marker-alt"></span><span class="nav-link-text">CART </span></a></li>
		                            <li class="nav-item px-6"><a class="nav-link fw-medium active" aria-current="page" href="#destinations"><span class="nav-link-icon text-800 fas fa-map-marker-alt"></span><span class="nav-link-text">MY PAGE </span></a></li>
		                            <li class="nav-item px-6"><a class="nav-link fw-medium active" aria-current="page" href="#destinations"><i class="fa fa-heart"></i></a></li>
		                        </ul>
		                        <form>
		                            <button class="nav-item px-4 btn text-900 order-1 order-lg-0 me-2"style="font-size:20px"><span class="login">LOGIN</span></button>
		                            <!-- <button class="btn text-800 order-1 order-lg-0 me-2"style="font-size:20px" type="button">LOGOUT</button> -->
		            <!-- 로그아웃입니다. -->
		                            <button class="btn btn-voyage-outline order-0" type="submit" style="font-size:20px"><span class="text-primary">Sign up</span></button>
		                            
		                        </form>
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
	</nav>

<!-- ////////////////////////////////////////////////////////////////////////// -->

 <!-- Shoping Cart Section Begin -->
    <section class="shoping-cart spad">
        <div class="container">
            <div class="row">
                <div class="col-lg-12">
                    <div class="shoping__cart__table">
                        <table>
                            <thead>
                                <tr>
                                    <th class="shoping__product">Products</th>
                                    <th>Price</th>
                                    <th>Quantity</th>
                                    <th>Total</th>
                                    <th></th>
                                </tr>
                            </thead>
                            <tbody>
                            
                           		<!--상품 주문 리스트  -->
        <%--                 			${vs.count} 
	 	${order.motId},	
		${order.memId},	
		${order.memNickname},
		${order.memRealname},	
		${order.memEmail},	
		${order.memPhone},	
		${order.motMemo},	
		${order.motTotalMoney},	
		${order.motDeposit},	
		${order.motCashRequest},	
		${order.motCash},	
		${order.motPayType},	
		${order.motStatus},
		${order.motOrderDate}
		 --%>
                           		<c:forEach items="${orderList}" var="order" varStatus="vs">
                                <tr>
                                    <td class="shoping__cart__item">
                                    	<!-- 상품 샘플 이미지 -->
                                        <img src="<c:url value="/img/orderList_sample.jpg" />" alt="">
                                        <h5>Vegetable’s Package</h5>
                                    </td>
                                    <td class="shoping__cart__price">
                                   		  <fmt:formatNumber value="${order.mitPrice}" /> 원 	
                                    </td>
                                    <td class="shoping__cart__quantity">
                                        <div class="quantity">
                                            <div class="pro-qty">
                                                <input type="number" value="${order.modtCount}">
                                            </div>
                                        </div>
                                    </td>
                                    <td class="shoping__cart__total">
                                        <fmt:formatNumber value="${order.motTotalMoney}" /> 원 
                                    </td>
                                    <td class="shoping__cart__item__close">
                                        <span class="icon_close"></span>
                                    </td>
                                </tr>
                                </c:forEach>
                                <!--// 상품 주문 리스트  -->
                                
                                <%-- <tr>
                                    <td class="shoping__cart__item">
                                        <img src="<c:url value="/img/orderList_sample.jpg" />" alt="">
                                        <h5>Fresh Garden Vegetable</h5>
                                    </td>
                                    <td class="shoping__cart__price">
                                        $39.00
                                    </td>
                                    <td class="shoping__cart__quantity">
                                        <div class="quantity">
                                            <div class="pro-qty">
                                                <input type="text" value="1">
                                            </div>
                                        </div>
                                    </td>
                                    <td class="shoping__cart__total">
                                        $39.99
                                    </td>
                                    <td class="shoping__cart__item__close">
                                        <span class="icon_close"></span>
                                    </td>
                                </tr>
                                <tr>
                                    <td class="shoping__cart__item">
                                        <img src="<c:url value="/img/orderList_sample.jpg" />" alt="">
                                        <h5>Organic Bananas</h5>
                                    </td>
                                    <td class="shoping__cart__price">
                                        $69.00
                                    </td>
                                    <td class="shoping__cart__quantity">
                                        <div class="quantity">
                                            <div class="pro-qty">
                                                <input type="text" value="1">
                                            </div>
                                        </div>
                                    </td>
                                    <td class="shoping__cart__total">
                                        $69.99
                                    </td>
                                    <td class="shoping__cart__item__close">
                                        <span class="icon_close"></span>
                                    </td>
                                </tr> --%>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-lg-12">
                    <div class="shoping__cart__btns">
                        <a href="#" class="primary-btn cart-btn">CONTINUE SHOPPING</a>
                        <a href="#" class="primary-btn cart-btn cart-btn-right"><span class="icon_loading"></span>
                            Upadate Cart</a>
                    </div>
                </div>
                <div class="col-lg-6">
                    <div class="shoping__continue">
                        <div class="shoping__discount">
                            <h5>Discount Codes</h5>
                            <form action="#">
                                <input type="text" placeholder="Enter your coupon code">
                                <button type="submit" class="site-btn">APPLY COUPON</button>
                            </form>
                        </div>
                    </div>
                </div>
                
                <!-- 페이징 -->
                <div class="col-lg-12 row mt-4 mb-4 bg-warning">
                   <ul class="pagination justify-content-center">
					  <li class="page-item"><a class="page-link" href="#">이전</a></li>
					  <li class="page-item"><a class="page-link" href="#">1</a></li>
					  <li class="page-item active"><a class="page-link" href="#">2</a></li>
					  <li class="page-item"><a class="page-link" href="#">3</a></li>
					  <li class="page-item"><a class="page-link" href="#">이후</a></li>
					</ul>
                </div>
                
                <div class="col-lg-6">
                    <div class="shoping__checkout">
                        <h5>Order Total</h5>
                        <ul>
                            <li>합계(페이지 별) <span>
                          		<fmt:formatNumber value="${pageOrderTotalMoney}" /> 원
                           	</span></li>
                            <li>총 합계<span>
                            	<fmt:formatNumber value="${orderTotalMoney}" /> 원 
                           	</span></li>
                        </ul>
                        <a href="#" class="primary-btn">PROCEED TO CHECKOUT</a>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!-- Shoping Cart Section End -->





</body>
</html>