package ch06.ex02.case01.sub;

import ch06.ex02.case01.A;

public class B {
	public void test(){
		A test = new A();
		int x = 0;

		x = test.d;
		
		test.m4();
	}
}  // public만 보임. default와 protected는 같은 패키지에서만 가능하므로.
