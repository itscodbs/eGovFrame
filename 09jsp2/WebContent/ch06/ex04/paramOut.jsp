<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<p>
	${param.userId=="like"? param.userId:"guest"}님, 환영합니다.
</p>
<p>
	<c:forEach var = "season" items="${paramValues.season}">
		${season}
	</c:forEach>
<p>
	${param.num1} + ${param.num2} = ${param.num1+param.num2}
</p>