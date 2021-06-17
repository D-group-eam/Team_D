<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ko-kr">
<head>
<meta charset="UTF-8">
<title>상품 주문 리스트</title>

<%@ include file="../include/include.jsp"  %>
</head>
<body>

	<c:forEach items="${orderList}" var="order" varStatus="vs">
	 	${vs.count} 
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
		${order.motStatus}
		 <br>
		
		<%-- ${order.motId},	
		${order.memId},	
		${order.mem_nickname},
		${order.mem_realname},	
		${order.mem_email},	
		${order.mem_phone},	
		${order.mot_memo},	
		${order.mot_total_money},	
		${order.mot_deposit},	
		${order.mot_cash_request},	
		${order.mot_cash},	
		${order.mot_pay_type},	
		${order.mot_status} --%> <br>
	</c:forEach>





</body>
</html>