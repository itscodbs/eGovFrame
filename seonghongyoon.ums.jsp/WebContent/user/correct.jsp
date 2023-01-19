<%@ page language = "java" contentType = "text/html; charset = UTF-8" pageEncoding = "UTF-8"%>
<%@ page import = "seonghongyoon.ums.domain.User" %>
<%@ page import = "seonghongyoon.ums.service.UserService" %>
<%@ page import = "seonghongyoon.ums.service.UserServiceImpl" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<%
	String userNo  = request.getParameter("userNo");
	String userName = request.getParameter("userName");
	if((userNo != null && !userNo.equals(""))
			&& (userName != null && !userName.equals(""))) {
		User user = new User(Integer.parseInt(userNo), userName, null);
		UserService userService = new UserServiceImpl();
		userService.correctUser(user);
%>
		<c:redirect url = "../main.jsp?msgId=21"/>
<%
	} else {
%>
		<c:redirect url = "../main.jsp?msgId=20"/>
<%
	}
%>