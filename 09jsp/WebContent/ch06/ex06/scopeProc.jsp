<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import = "ch06.ex06.User"%>
<%@ page import = "java.util.Date"%>
<%	
	pageContext.setAttribute("user", new User(1,"최한석", new Date()));
	request.setAttribute("user", new User(2,"한아름", new Date()));
	session.setAttribute("user", new User(3,"양승일", new Date()));
	application.setAttribute("user", new User(4,"김필진", new Date()));
%>
<jsp:forward page = "scopeOut.jsp"/>