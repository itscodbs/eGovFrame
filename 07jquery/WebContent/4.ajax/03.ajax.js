$(function(){
	// Using the core $.ajax() method
	$.ajax({
		// the URL for the request
		url : "../data/ajax.json",
		
		// the data to send
		data : {
			id : 123
		},
		
		// Whether this is a POST or GET request
		type : "get",
		
		// the type of data we expect back
		dataType : "json",
		
		// code to run if the request succeeds;
		// the response is passed to the function
		success : function(data, status, xhr){
			$("<h3>").text(data.title).appendTo("body");
			$("<div>").html(data.content).appendTo("body");
			console.log("Success, status : " + status);
			console.dir(xhr);
		},
		
		// code to run if the request fails; the rawrequest and
		// status codes are passed to the function
		error : function(xhr, status, msg){
			console.log("Error"  + msg);
			console.log("Status"  + msg);
			console.dir(xhr);
		},
		
		// code to run regardless of success of failure
		complete : function(xhr, status){
			console.log("Complete, status"  + status);
			console.dir(xhr);
		}			
	});
});