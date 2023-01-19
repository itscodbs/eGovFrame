<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%
	String userId = request.getParameter("userId");
	if(userId != null && !userId.equals(""))
		session.setAttribute("userId", userId);
%>
<a href= "newsOut.jsp">기사보기</a>