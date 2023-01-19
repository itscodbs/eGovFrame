<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	String userId = request.getParameter("userId");
	String userPw = request.getParameter("userPw");
	
	if(userId.equals("like") && userPw.equals("like")){
%>
		로그인 성공했습니다.<br>
		<a href="logIn.jsp">돌아가기</a>
<%
	}else{
	request.setAttribute("msg", "로그인 정보가 틀렸습니다.");		
%>
<jsp:forward page="logIn.jsp"/>
<%	
	}
%>
	 