<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%
	Object obj= request.getAttribute("userName");
	String userName = (String)obj;	
%>
<%= userName %><br>
B
