package ch07.ex01.case01;

public class Main { // 180430
	public static void main(String[] args) {
		C c = new C();
		B b = c;
		A a = c;
		
		c = (C)a;
		b = (B)a;
		
		c = (C)b;
	}
}
