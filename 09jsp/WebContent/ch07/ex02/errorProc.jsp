<%@page import="org.apache.logging.log4j.Logger"%>
<%@page import="org.apache.logging.log4j.LogManager"%>
<%@page isErrorPage="true" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<!DOCTYPE html>
<h3>시스템 에러가 발생했습니다.</h3>
<h5>고객센터 1577-1577로 문의하세요.</h5>
<%
	Logger logger = null;
	if(application.getAttribute("logger") != null)
		logger = (Logger)application.getAttribute("logger");
	else{
		logger = LogManager.getLogger();
		application.setAttribute("logger", logger);
	}
	logger.error(exception);
%>