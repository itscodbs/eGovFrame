package ch07.ex01.case02;

public class Main {
	public static void main(String[] args){
		C c = new C();
		B b = c;
		A a = c;
		
		c = (C)a;
		b = (B)a;
		
		c = (C)b;
	}
}
