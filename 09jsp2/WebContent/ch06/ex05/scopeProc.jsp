<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	pageContext.setAttribute("scope", "페이지");
	request.setAttribute("scope","리퀘스트");
	session.setAttribute("scope","세션");
	application.setAttribute("scope", "애플리케이션");
%>
<jsp:forward page="scopeOut.jsp"/>