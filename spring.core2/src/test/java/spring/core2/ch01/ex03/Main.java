package spring.core2.ch01.ex03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args){
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		Shooter shooter1 = ctx.getBean("shooter1", Shooter.class);
		Shooter shooter2 = ctx.getBean("shooter2", Shooter.class);
		shooter1.fire();
		shooter2.fire();
	}
}
