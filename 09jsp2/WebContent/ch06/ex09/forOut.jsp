<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<ul>
	<c:forEach var="fruit" items="${paramValues.fruits}" varStatus="state">
		<li>${state.count} : ${fruit}, ${state.index}</li>	
	</c:forEach>
</ul>
<ul>
	<c:forEach begin="1" end="5" var="cnt">
		${cnt}<br>	
	</c:forEach>
</ul>
