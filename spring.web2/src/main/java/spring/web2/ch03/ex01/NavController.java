package spring.web2.ch03.ex01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ch03/ex01")
public class NavController {
	@RequestMapping("/forward")
	public String first(){
		return "forward:forward/target";
	}
	
	@RequestMapping("/forward/target")
	public String target(){
		return "forward:forward/target";
	}
	
	@RequestMapping("/redirect")
	public String second(){
		return "forward:forward/target";
	}
	
	@RequestMapping("/redirect/target")
	public String target2(){
		return "forward:forward/target";
	}
}	
