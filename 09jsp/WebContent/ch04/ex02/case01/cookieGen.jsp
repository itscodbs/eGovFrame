<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
	Cookie cookie = new Cookie("name", "john");
	response.addCookie(cookie);
%>
<a href = "cookieOut.jsp">쿠키 보기1</a> &nbsp;
<a href = "cookieOut.jsp">쿠키 보기2</a> &nbsp;
<a href = "../case02/cookieOut.jsp">쿠키 보기3</a> &nbsp;