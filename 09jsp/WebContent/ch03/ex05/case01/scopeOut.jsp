<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	Object obj1 = pageContext.getAttribute("one");
	Object obj2 = request.getAttribute("two");
	Object obj3 = session.getAttribute("three");
	Object obj4 = application.getAttribute("four");
%>

<%= obj1 %>
<%= obj2 %>
<%= obj3 %>
<%= obj4 %>

