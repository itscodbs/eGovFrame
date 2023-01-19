<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="ch09.ex01.service.PostServiceImpl"%>
<%@page import="ch09.ex01.service.PostService"%>
<%@page import="ch09.ex01.service.PageServiceImpl"%>
<%@page import="ch09.ex01.service.PageService"%>
<%@page import="ch09.ex01.domain.Page"%>
<%@page import="ch09.ex01.domain.Post"%>
<%
	Page myPage = null;
	String currentPage = request.getParameter("currentPage");
	if(currentPage != null) myPage = new Page(Integer.parseInt(currentPage));
	else myPage = new Page();
	
	PageService pageService = new PageServiceImpl(5, myPage);
	pageContext.setAttribute("pageMaker", pageService);
	PostService postService = new PostServiceImpl();
	pageContext.setAttribute("posts", postService.listPosts(myPage));
	
%>

<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>글 목록</title>
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min/js"></script>
</head>
<body>
	<div class="container">
		<!-- 글 목록 -->
		<table class="table tabl-hover">
			<thead>
				<tr>
					<th style="width:50px">번호</th>
					<th>제목</th>
					<th>작성자</th>
					<th>작성일</th>
					<th style="width:60px">조회수</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="post" items="${posts}">
					<tr>
						<td>${post.postNo}</td>
						<td>${post.title}</td>
						<td>${post.writer}</td>
						<td>${post.regDate}</td>
						<td><span class="badge">${post.viewCnt}</span></td>
					</tr>
				</c:forEach>
			</tbody>					
		</table>
		<!-- 페이징 -->
		<div class="text-center">
			<ul class="pagination">
				<c:if test="${pageMaker.prev}">
					<li><a href="list.jsp>currentPage=${pageMaker.startPage-1}">&laquo;</a></li>
				</c:if>	
				
				<c:forEach begin="${pageMaker.startPage}" end="${pageMaker.endPage}" var="idx">
					<li <c:out value="${pagetMaker.page.currentPage==idx ? 'class=active' : "}"/>>
					</li>
				</c:forEach>
				
				<c:if test="${pageMaker.next}">
					<li><a href="list.jsp?currentPage=${pageMaker.endPage+1}">&raquo;</a></li>
				</c:if>		
			</ul>
		</div>	
	</div>
</body>
</html>