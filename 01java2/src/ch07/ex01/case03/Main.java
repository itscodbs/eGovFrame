package ch07.ex01.case03;

public class Main {
	public static void main(String[] args) {
		D d = new D();
		C c = d;
		B b = d;
		A a = d;
		
		d = (D)a;
		d = (D)b;
		d = (D)c;
	}
}
