package spring.core.ch02.ex01;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ConsoleAspect {
   @Pointcut("execution(public int spring.core.ch02.ex01..user..*Dao.*(..))")
   private void pointcut1(){ }
   
   @Before("pointcut1()")
   public void advice1(JoinPoint jp) {
      System.out.println("@Before : " + jp.toShortString());
   }
   
   @AfterReturning(pointcut="execution(* spring.core.ch02.ex01..service..*(..))", returning="cnt")
   public void advice2(JoinPoint jp, int cnt) {
      System.out.println("@AfterReturning : " + cnt + " : " + jp.toShortString());
   }

   @AfterThrowing(pointcut="execution(* spring.core.ch02.ex01..service..*(..))", throwing="ex")
   public void advice3(JoinPoint jp, int ex) {
      System.out.println("@AfterThrowing : " + jp.toShortString());
   }
   
   @After("execution(* spring.core.ch02.ex01..service..*(..))")
   public void advice4(JoinPoint jp) {
      System.out.println("@After : " + jp.toShortString());
   }
   
   @Around("execution(* spring.core.ch02.ex01.user.service.UserService.setUserName(..))")
   public Object advice5(ProceedingJoinPoint jp) throws Throwable {
      System.out.println("@Around 시작 : " + jp.toShortString());
      Object obj = jp.proceed();
      System.out.println("@Around 끝 : " + jp.toShortString());
      return obj;
   }
}