<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<% 
	String userId = request.getParameter("userId");
	if(userId != null && !userId.equals(""))
		session.setAttribute("userId", userId);
%>
<c:redirect url ="loginIn.jsp"/>
