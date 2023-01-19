<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	pageContext.setAttribute("one", "페이지");
	request.setAttribute("two", "리퀘스트");
	session.setAttribute("three", "세션");
	application.setAttribute("four", "애플리케이션");
%>
<c:redirect url="scopeOut.jsp"/>
