<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html >
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:choose>
<c:when test="${param.color==1}">빨강</c:when>
<c:when test="${param.color==2}">노랑</c:when>
<c:when test="${param.color==3}">파랑</c:when>
</c:choose>