<%@page import="java.util.Iterator"%>
<%@page import="java.util.StringTokenizer"%>
<%@page import="java.util.List, java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	// 쿠키에 저장된 장바구니 물건을 파악한다.
	List<String> cart = new ArrayList<>();
	Cookie[] cookies = request.getCookies();
	StringTokenizer st= null;
	for(Cookie cookie : cookies){
		if(cookie.getName().equals("cart")){
			String tmp = cookie.getValue();
			st = new StringTokenizer(tmp, ", ");
			while(st.hasMoreTokens()) cart.add(st.nextToken());
		}
	}
	
	// 장바구니에서 일부 물건을 삭제한다.
	Iterator<String> iterator = cart.iterator();
	String[] delProds = request.getParameterValues("delProd");
	String wishProd = "";
	while(iterator.hasNext()){
		wishProd = iterator.next();
		for(String delProd:delProds){
			if(wishProd.equals(delProd)) iterator.remove();
		}
	}
	
	// 장바구니에 남은 물건만을 쿠키에 저장한다.
	String products = "";
	for(String product:cart) products += product + ", ";
	Cookie cookie = new Cookie("cart", products);
	cookie.setMaxAge(60*60^24*365);
	response.addCookie(cookie);
%>
	<c:redirect url="cartOut.jsp"/>
	
	장바구니가 비었습니다. <br>
	<a href ="main.html">돌아가기</a>