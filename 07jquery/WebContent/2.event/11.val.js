var displayVals = function(){
	var singleValues = $("#single").val();
	var multipleValues = $("#multiple").val();
	$("p").html("<b>Single:</b>" + singleValues + "<b>Multiple:</b>" + multipleValues.join(", ") );
}

$("select").bind("change", displayVals);