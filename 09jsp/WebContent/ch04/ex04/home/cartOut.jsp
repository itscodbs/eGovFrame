<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="java.util.Set, java.util.HashSet"%>
<!DOCTYPE html>
<h2>장바구니</h2>
<%
	Set<String> cart = (Set<String>)session.getAttribute("cart");
	if(cart.size()==0){
%>
	<p>장바구니가 비었습니다.</p>
<%
	}else{
%>
	<form action = "cartDelProc.jsp">
		<ul>
<%
		for(String product : cart){
%>
		<li><%=product %>
			<input type = "checkbox" name="delProd" value="<%= product%>">
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