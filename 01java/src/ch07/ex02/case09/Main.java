package ch07.ex02.case09;

public class Main {
	public static void main(String[] args) {
		Basket<Apple> basket1 = new Basket<Apple>();
		basket1.set(new Apple());
		System.out.println(basket1.get());
		
		Basket<Banana> basket2 = new Basket<Banana>();
		basket2.set(new Banana());
		System.out.println(basket2.get());
	}
} // 클래스와 기본 타입간 자동 형변환. 1.리터럴 2. 객체에 값 저장. 객체화 Boxing/ unBoxing. 오르쪽 값 변환