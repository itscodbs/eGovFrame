<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
	String userId = request.getParameter("userId");
%>
<p><%= userId%>님, 환영합니다.</p>
<a href = "loginIn.jsp">돌아가기</a>