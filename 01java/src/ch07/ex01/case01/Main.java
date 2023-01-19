package ch07.ex01.case01;

public class Main {
	public static void main(String[] args) {
		C c = new C();
		B b = c;
		A a = c;
		
		c = (C)a;
		c = (C)b;
	}
}
// Main = A B C Object 타입 존재.  
// 부모타입으로 자동형변환 = promotion(Casting 연산자 안쓰고. casting은 양방향 형변환가능)
