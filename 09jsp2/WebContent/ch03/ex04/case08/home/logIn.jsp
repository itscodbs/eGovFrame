<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<meta charset="utf-8">
<form action="logProc.jsp">
	<label>아 이 디 : <input type="text" name="userId"/></label><br>
	<label>비밀번호 : <input type="password" name="userPw"/></label><br>
	<input type="submit"/>
</form>
<%
	String msg = (String)request.getAttribute("msg");
	if(msg != null && !msg.equals("")) out.print(msg);
%>