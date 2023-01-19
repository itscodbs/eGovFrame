<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<% //scriptlet
	int num1 = 1; // 숫자1
	int num2 = 2; // 숫자2
%>
<h2>더하기</h2> <!-- out.write("<h2>더하기</h2>\r\n");로 번역 -->
<%-- expression --%>
<%= num1 %> + <%= num2 %> = <%= num1 + num2 %>  <!-- out.print(num1 + num2);로 번역 -->
<br>
<%
	num1++;
	num2++;
%>

<%= num1 %> + <%= num2 %> = <%= num1 + num2 %>

<%--
_jspService() 메소드의 몸체를 구성.
get, post등의 request에 의해서 호출.
 --%>

