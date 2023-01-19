<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.Set"%>
<%@page import="java.util.Map"%>
<p><a href="fileIn.jsp">첫화면으로</a></p>
<%
	Map<String,String> map = (Map<String,String>)request.getAttribute("files");
	Set<String> keySet = map.keySet();
	for(String key : keySet){
%>
	<a href="../upload/<%= key %>"><%= map.get(key) %></a><br>
<%
	}
%>