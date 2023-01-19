<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<a href="imgIn.jsp">첫화면으로</a>
<table>
	<tr>
		<th>제목</th>
		<td>${title}</td>
	</tr>
	<tr>
		<c:choose>
			<c:when test="${empty fileName}">
				<td>이미지 없음</td>
			</c:when>
			<c:otherwise>
				<td colspan="2">
					<img src="../upload/${fileName}"/>
				</td>
			</c:otherwise>
		</c:choose>	
	</tr>
</table>