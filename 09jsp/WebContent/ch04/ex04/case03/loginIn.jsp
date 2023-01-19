<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<meta charset=UTF-8">
<% 
	Object userId = session.getAttribute("userId");
	if(userId == null){
%>
	<form action="loginProc.jsp">
	아이디 : <input type="text" name="userId"/><br>
	비밀번호  : <input type="text" name="userPw"/><br>
	<input type="submit"/>
	</form>
<%
	}else{
%>
	<a href="logoutProc.jsp">로그아웃</a>
<%
	}
%>