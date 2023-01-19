var box = $("#box");

$("input[class='big']").bind("click", function(){
	box.animate({
		width : 400,
		height : 400,
		opacity : 1  // 투명도
	}, 600);
});

$("input[class='small']").bind("click", function(){
	box.animate({
		width : 50,
		height : 50,
		opacity : 0.2
	}, 600);
});

$("input[class='left']").bind("click", function(){
	box.animate({
		left : 0
	}, 100);
});

$("input[class='right']").bind("click", function(){
	box.animate({
		left : "90%"
	}, 1000);
});
