<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<p><a href="main.html"><button type="button">메인으로</button></a>
<%
	Cookie[] cookies = request.getCookies();
	for(Cookie cookie : cookies){
		if(cookie.getName().equals("name") || cookie.getName().equals("age")){
%>
	<%= cookie.getName() %> : <%= cookie.getValue() %><br>
<%
		}
	}
%>