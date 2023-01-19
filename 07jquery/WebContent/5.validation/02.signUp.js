$.validator.addMethod(
		"password",
		function(value, element){
			return this.optional(element)
				|| /^(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{2,8}$/i.test(value);
		},
		"2자 이상 8자 이하, 영문자와 숫자를 입력하세요."
		);
// http://jqueryvalidation.org/jQuery.validator.addMethod/

$(function(){
	$("form").validate({
		rules : {
			userId : {
				required : true,
				minlength : 2
			},
			password : {
				required : true
			},
			confirmPassword : {
				required : true,
				equalTo : "#ipassword"
			},
			email : {
				required : true,
				email : true
			},
			agree : "required"
		},
		messages : {
			userId : {
				required : "아이디를 입력하세요.",
				minlength : "2자 이상 입력하세요."
			},
			password : {
				required : "암호를 입력하세요."
			},
			confirmPassword : {
				required : "암호를 입력하세요.",
				equalTo : "위 암호와 똑같이 입력하세요."
			},
			email : {
				required : "이메일 주소를 입력하세요.",
				email : "이메일 형식에 맞춰 입력하세요."
			},
			agree : "약관에 동의하셔야 가입할 수 있습니다."
		},
		submitHandler : function(){
			$(form).submit();
		}
	});
});