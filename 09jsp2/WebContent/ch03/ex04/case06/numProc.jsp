<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%!
	private int plusNum;
%>	
<%
	int num = Integer.parseInt(request.getParameter("num"));
		request.setAttribute("newNum", num + ++plusNum);
%>
	<jsp:forward page="numOut.jsp"/>
