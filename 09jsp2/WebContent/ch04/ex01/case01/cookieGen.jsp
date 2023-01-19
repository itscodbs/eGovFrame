<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<p><a href="main.html"><button type="button">메인으로</button></a></p>
<%
	Cookie cookie1 = new Cookie("name","john");
	Cookie cookie2 = new Cookie("age", "12");
	response.addCookie(cookie1);
	response.addCookie(cookie2);
%>