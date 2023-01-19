package spring.core2.ch01.ex04;

import org.springframework.stereotype.Component;

@Component
public class Rifle implements Gun{
	public void fire(){
		System.out.println("소총 탕탕");
	}
}
