$("input").bind("keyup", function(){
	var value = $(this).val();
	$("p").text(value);
}).keyup();