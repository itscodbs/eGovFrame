<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<c:set var="fruit">사과</c:set>
<c:set var="fruit" scope="page">포도</c:set>
<c:set var="fruit" scope="request">딸기</c:set>
<c:set var="fruit" scope="session" value="머루"/>
<c:set var="fruit" scope="application" value="다래"/>
<jsp:forward page="setOut.jsp"/>
