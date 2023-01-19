package ch06.ex02.case01.sub;

import ch06.ex02.case01.A;

public class C extends A{
	public void test(){
		int x = 0;
		
		x = c;
		x = d;
		
		m3();
		m4();
	}
} // C는 A를 상속받았으므로 다른 패키지에서 protected 접근자여도 보인다. protected는 자식클래스에서만 접근이 가능하다.
