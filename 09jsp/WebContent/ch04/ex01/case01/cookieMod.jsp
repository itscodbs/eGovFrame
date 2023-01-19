<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<p><a href="main.html"><button type = "button">메인으로</button></a></p>
<%
	Cookie cookie = new Cookie("age", "34");
	response.addCookie(cookie);
%>