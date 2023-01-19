package spring.web2.ch05.ex02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/ch05/ex02/user")
public class UserController {
	@RequestMapping
	public String form(){
		return "ch05/ex02/userIn";
	}
	
	@RequestMapping(value="/register")
	@ResponseBody
	public User regiger(User user){
		return user;
	}
}
