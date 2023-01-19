<%@ page language = "java" contentType = "text/html; charset = UTF-8" pageEncoding = "UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page import = "seonghongyoon.ums.service.UserService" %>
<%@ page import = "seonghongyoon.ums.service.UserServiceImpl" %>
<%@ page import = "seonghongyoon.ums.domain.User" %>
<%@ page import = "java.util.List" %>

<%
	UserService userService = new UserServiceImpl();
	List<User> users = userService.listUsers();
	pageContext.setAttribute("users", users);
%>
<table class = "table">
	<thead>
		<tr>
			<th>번　호</th>
			<th>이　름</th>
			<th>등록일</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="user" items ="${users}">
			<tr>
				<td><input type="radio" name="userNo" value="${ user.userNo }" onClick="printUserName(this)"/>
					&nbsp;${user.userNo}
				</td>
				<td>${user.userName}</td>
				<td>${user.regDate}</td>
			</tr>
		</c:forEach>
	</tbody>
</table>