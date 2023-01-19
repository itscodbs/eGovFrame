package spring.core.ch01.ex04;

import org.springframework.stereotype.Component;

@Component
public class Pistol implements Gun{
	public void fire(){
		System.out.println("권총 탕탕");
	}
}
