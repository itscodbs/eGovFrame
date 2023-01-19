<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html >
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:if test="${param.color==1}">빨강</c:if>
<c:if test="${param.color==2}">노랑</c:if>
<c:if test="${param.color==3}">파랑</c:if>