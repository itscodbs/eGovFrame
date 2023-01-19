<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<script src="//code.jquery.com/jquery-1.12.0.min.js"></script>
<script>
// 버튼별 handler를 등록한다.
var regButtons = function(){
	$("#good").bind("click", function(){
		$("#msg").text("Good, click");
		$.ajax({
		method : "GET",
		url : "x/good",
		success : function(rowCnt){
			$("#msg").text(rowCnt + "건 처리.");
		}
	});
});

$("#bad").bind("click", function(){
	$("#msg").text("Bad, click");
	$.ajax({
		method : "GET",
		url : "x/bad",
		success : function(rowCnt){
			$("#msg").text(rowCnt + "건 처리.");
		},
		error : function(a, b, errMsg){
			$("#msg").text("실패" + errMsg);
		}
	});
});


$("#badWithX").bind("click", function(){
	$("#msg").text("BadWithX, click");
	$.ajax({
		method : "GET",
		url : "x/badWithX",
		success : function(rowCnt){
			$("#msg").text(rowCnt + "건 처리.");
		},
		error : function(a, b, errMsg){
			$("#msg").text("실패" + errMsg);
		}
	});
});

$(document).ready(
		function(){
			regButton();
		});
</script>

<p></p>
<button type="button" id="good">Good</button>
<button type="button" id="bad">Bad No X</button>
<button type="button" id="badWithX">Bad With X</button>

<p id="msg"></p>

