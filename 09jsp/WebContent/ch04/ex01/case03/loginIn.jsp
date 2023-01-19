<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	String userId="";
	Cookie[] cookies = request.getCookies();
	if(cookies != null){
		for(Cookie cookie : cookies){
			if(cookie.getName().equals("userId"))
				userId = cookie.getValue();
		}
	}
%>
<!DOCTYPE html>
<form action = "loginProc.jsp" method="post">
	<p>
		<label>아이디 : <input type="text" name="userId" value="<%=userId%>"/></label><br>
		<label>암 &nbsp;호 : <input type="password" name="userPw"/></label><br>
		<label><input type="checkbox" name="isStoreId" value="true"/>아이디 저장</label>
	</p>
	<button type="submit">로그인</button>
</form>