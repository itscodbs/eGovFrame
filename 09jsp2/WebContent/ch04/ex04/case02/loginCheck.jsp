<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ taglib prefix ="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	Object obj = session.getAttribute("userId");
	if(obj == null){
%>
	<c:redirect url = "loginIn.html"/>
<%
	}
%>