<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<h3>사용자 정보</h3>
${requestScope.user.name}, ${requestScope.user.age} <br><br>
${sessionScope.user.name}, ${sessionScope.user.agee}