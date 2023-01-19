<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<form action="numProc.jsp">
	<input type="text" name="num"/>
	<input type="submit"/>
</form>
<%
 	String msg = request.getParameter("msg");
 	if(msg != null && !msg.equals("")) out.print(msg);
%>