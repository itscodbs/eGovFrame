<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
	Cookie[] cookies = request.getCookies();
	for(Cookie cookie : cookies){
		if(cookie.getName().equals("name")){
%>
	<%= cookie.getName() %> : <%= cookie.getValue() %> <br>
<%
	}
}
%>
<a href= "cookieGen.jsp">돌아가기</a>