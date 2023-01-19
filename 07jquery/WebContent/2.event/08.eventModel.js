$("#target").bind("click",function(event){
	event.stopPropagation(); // 주석처리 가능
	$(this).css("background-color", "black");
});

$("#wrapper").bind("click",function(){
	$(this).css("background-color", "blue");
});
