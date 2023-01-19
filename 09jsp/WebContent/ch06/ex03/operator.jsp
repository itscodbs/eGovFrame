<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
\${5+2} : ${5+2}<br>
\${5-2} : ${5-2}<br>
\${5>2} : ${5>2}<br>
\${(5>2)?5:2} : ${(5>2)?5:2}<br>
\${(5>2)||(2<10)} : ${(5>2)||(2<10)}<br>

<%
	String str = null;
	pageContext.setAttribute("str",str);
%>
\${empty str} : ${empty str}