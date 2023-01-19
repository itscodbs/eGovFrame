<%@page import="java.util.List, java.util.ArrayList"%>
<%@page import="java.util.StringTokenizer"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<h2>장바구니</h2>
<%
	List<String> cart = new ArrayList<>();
	
	Cookie[] cookies = request.getCookies();
	StringTokenizer st = null;
	for(Cookie cookie:cookies){
		if(cookie.getName().equals("cart")){
			String tmp = cookie.getValue();
			st = new StringTokenizer(tmp,",");
			while(st.hasMoreTokens()) cart.add(st.nextToken());
		}
	}
%>
	<ul>
<% 
	for(String product : cart){
%>
	<li> <%= product %> </li>
<%
	}
%>	
	</ul>
<a href="main.html">돌아가기</a>

