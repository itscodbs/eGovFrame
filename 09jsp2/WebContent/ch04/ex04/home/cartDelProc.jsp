<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.Set, java.util.HashSet"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="java.util.Iterator"%>
<%
	Set<String> cart = (Set<String>)session.getAttribute("cart");

	// 장바구니에서 일부 물건을 삭제한다.
	String[] delProds = request.getParameterValues("delProd");
	
	Iterator<String> iterator = cart.iterator();
	String wishProd = "";
	while(iterator.hasNext()){
		wishProd = iterator.next();
		for(String delProd : delProds){
			if(wishProd.equals(delProd)) iterator.remove();
		}
	}
%>
<c:redirect url="cartOut.jsp"/>
	상품을 삭제했습니다. <br>
	<a href ="main.html">돌아가기</a>