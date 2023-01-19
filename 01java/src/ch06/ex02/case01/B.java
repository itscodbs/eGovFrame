package ch06.ex02.case01;

public class B {
	public void test(){
		A test = new A();
		int x = 0;
		
		x = test.b;
		x = test.c;
		x = test.d;
		
		test.m2();
		test.m3();
		test.m4();				
	}
} // private은 같은 패키지여도 안보인다.
