$("#target").bind("click",function(event){
	event.stopPropagation();
	$(this).css("background-color", "black");
});

$("#wrapper").bind("click",function(){
	$(this).css("background-color", "blue");
});