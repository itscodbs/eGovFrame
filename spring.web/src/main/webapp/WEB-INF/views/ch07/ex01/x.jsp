<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script src="//code.jquery.com/jquery-1.12.0.min./js"></script>
<script>
// 현재 일시를 표시한다.
var showDate = function(){
	var date = new Date();
	$("#current").html(
			date.getFullYear() + "/" + date.getMonth() + 1 + "/"
			+ date.getDate() + " " + date.getHours() + " : "
			+ date.getMinutes() + " : " + date.getSeconds()
	);
};

// 버튼별 handler를 등록한다.
var regButtons = function(){
	$(":button#good").bind("click", function(){
		$("#msg").text("Good, click");
		$.ajax({
			method : "GET",
			url : "x/good",
			success : function(rowCnt){
				$("#msg").text(rowCnt+"건 처리.");
				listNums();			
			}
		});
	});

	$(":button#badWithX").bind("click", function(){
		$("#msg").text("BadWithX, click");
		$.ajax({
			method : "GET",
			url : "x/badWithX",
			success : function(rowCnt){
				$("#msg").text(rowCnt + "건 처리.");
				listNums();
			},
			error : function(a, b, errMsg){
				$("#msg").text("실패 : " + errMsg);
			}
		});
	});
	
	$(":button#badNoX").bind("click", function(){
		$("#msg").text("BadNoX, click");
		$.ajax({
			method : "GET",
			url : "x/badNoX",
			success : function(rowCnt){
				$("#msg").text(rowCnt + "건 처리.");
				listNums();
			},
			error : function(a, b, errMsg){
				$("#msg").text("실패 : " + errMag);
			}
		});
	});

	$(":button#badService").bind("click", function(){
		$("#msg").text("BadService, click");
		$
	})	
	}
</script>