<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<h2>장바구니</h2>
<% 
	List<String> cart = (List<String>)session.getAttribute("cart");
%>
	<ul>
<%
	for(String product :cart){
%>	
	<li> <%=product %></li>
<%
	}
%>	
	</ul>
<a href="main.html">돌아가기</a>