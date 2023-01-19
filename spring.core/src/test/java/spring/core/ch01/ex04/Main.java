package spring.core.ch01.ex04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("app.xml", Main.class);
		Shooter shooter = ctx.getBean("gunman", Shooter.class);
		shooter.fire();
	}
}
/*
권총 탕탕
소총 탕탕
 */
 