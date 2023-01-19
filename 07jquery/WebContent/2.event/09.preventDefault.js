$("#link").bind("click",function(event){
	event.preventDefault(); // 주석처리 가능
	$("body").append("<h3>stop page link</h3>");
});
