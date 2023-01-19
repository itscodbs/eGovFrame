package ch07.ex03.case04;

@FunctionalInterface
public interface Human {
	void say();
}  // 추상메소드 param 없다.
// 5 메소드 몸체 구현
//  say() 가지고 있는 객체 = man 
// man.say