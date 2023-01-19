$("input:eq(0)").bind("click", function(){
	$("#box").fadeTo(600, 0.5);
});

$("input:eq(1)").bind("click", function(){
	$("#box").fadeTo(600, 1);
});