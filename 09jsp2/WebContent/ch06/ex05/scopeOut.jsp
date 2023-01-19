<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<ol>
	<li>${scope}</li>
	<li>${pageScope.scope}</li>
	<li>${requestScope.scope}</li>
	<li>${sessionScope.scope}</li>
	<li>${applicationScope.scope}</li>
</ol>