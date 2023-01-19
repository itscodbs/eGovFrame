<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
	String numStr = request.getParameter("num");
	if(numStr==null || numStr.equals("")){
%>
	숫자를 입력한 뒤, 제출하세요.
	<a href="paraIn.html">돌아가기</a>
<%	
	}else{
		int num = Integer.parseInt(numStr);
%>
	2배로, <%= num*2 %> 드립니다.
	<a href="paraIn.html">돌아가기</a>
<%
	}
%> 