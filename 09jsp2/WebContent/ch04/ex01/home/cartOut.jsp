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
	if(cart.size()==0){
%>
	<p>장바구니가 비었습니다.</p>
<% 
	}else{
%>
	<form action="cartDelProc.jsp">
		<ul>
<%
		for(String product:cart){
%>	
			<li><%= product %>
				<input type="checkbox" name="delProd" value="<%=product %>">
			</li>
<%
		}
%>
		</ul>
		<button type="submit">삭제</button>
	</form>
<%	
	}
%>
<p><a href="main.html">돌아가기</a></p>
