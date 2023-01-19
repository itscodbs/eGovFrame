<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.time.LocalDate" %>
<%
	session.setAttribute("today", LocalDate.now());
%>
<jsp:forward page="sessionOut.jsp"/>
	