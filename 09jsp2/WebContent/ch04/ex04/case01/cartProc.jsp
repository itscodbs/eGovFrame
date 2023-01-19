<%@page import="java.util.List, java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core %>
<%	
	request.setCharacterEncoding("utf-8");

	String[] wishProds = request.getParameterValues("wishProd");
	List<String> cart = new ArrayList<>();
	
	for(String product : wishProds) cart.add(product);
	
	session.setAttribute("cart", cart);
%>
<c:redirect url = "cartOut.jsp"/>