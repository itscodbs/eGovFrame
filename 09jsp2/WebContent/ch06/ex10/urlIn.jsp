<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<c:url value="urlOut.jsp" var="outPage"/>
<a href="${outPage}">출력으로</a><br>
${param.num}