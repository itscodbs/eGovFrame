<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	String numStr = request.getParameter("num");
	int num = 0;
	try{
		num = Integer.parseInt(numStr);
%>
	<%= num %> <a href="numIn.jsp">돌아가기</a>
<%
	}catch(NumberFormatException e){
%>
		<jsp:forward page="numIn.jsp"/>
<%	
	}
%>