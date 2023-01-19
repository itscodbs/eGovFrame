<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%
	String num1Str = request.getParameter("num1");
	String num2Str = request.getParameter("num2");
	
	int num1=0, num2=0;
	if(num1Str != null && !num1Str.equals(""))
		num1 = Integer.parseInt(num1Str);
	if(num2Str != null && !num2Str.equals(""))
		num2 = Integer.parseInt(num2Str);
%>
<%= num1 %> + <%= num2 %> = <%= num1+num2 %> <br>
<a href="paraIn.html">돌아가기</a>	
	