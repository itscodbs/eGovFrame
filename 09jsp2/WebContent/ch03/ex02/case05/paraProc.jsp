<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
	request.setCharacterEncoding("utf-8");
	String userName = request.getParameter("userName");
	String gender = request.getParameter("gender");
	String[] seasons = request.getParameterValues("season");
	String job = request.getParameter("job");
%>
답변 확인
<table>
	<tr>
		<th>이름</th>
		<td><%= userName %></td>
	</tr>
	<tr>
		<th>성별</th>
		<td><%
			if(gender.equals("male")) gender="남";
			else gender="여";		
		%><%= gender %>
		</td>
	</tr>
	<tr>
		<th>좋은 계절</th>
		<td><%
				for(String season : seasons) out.print(season+"");
			%>
		</td>
	</tr>
	<tr>
		<th>직업</th>
		<td><%= job %></td>
	</tr>	
</table>
	