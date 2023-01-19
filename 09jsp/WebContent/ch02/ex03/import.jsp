<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="java.util.Date"%>
<%@page import="java.time.LocalDate"%>
<!DOCTYPE html>
<%
	LocalDate date = LocalDate.now();
	Date date2 = new Date();
%>
<%= date %><br>
<%= date2 %>