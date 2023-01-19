package spring.web.ch04.ex01.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("ch04.ex01.todayController")
@RequestMapping("/ch04/ex01/today")
public class TodayServiceImpl implements TodayService{
	@Autowired private TodayService todayService;
	
	@RequestMapping
	@ModelAttribute("today")
	public Date now(){
		return todayService.now();
		}
}
