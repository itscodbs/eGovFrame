<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<form action="logProc.jsp">
	<label>아이디 : <input type="text" name="userId"/></label>
	<label>비밀번호 : <input type="password" name="userPw"/> </label>
	<input type="submit" value = "로그인"/>
</form>
<%
 	String msg = request.getParameter("msg");
 	if(msg != null && !msg.equals("")) out.print(msg);
%>