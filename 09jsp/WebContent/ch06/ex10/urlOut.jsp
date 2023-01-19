<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<c:url value="urlIn.jsp" var="inpage">
	<c:param name="num" value="1"/>
</c:url>
<c:redirect url = "${inPage}"/>