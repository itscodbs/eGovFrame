<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix ="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%! 
	private int plusNum;
%>
<% 
	int num = Integer.parseInt(request.getParameter("num"));
	int newNum = num + ++plusNum;
	pageContext.setAttribute("urlStr", "numOut.jsp?newNum=" + newNum);
%>
<c:redirect url = "${urlStr}"/>