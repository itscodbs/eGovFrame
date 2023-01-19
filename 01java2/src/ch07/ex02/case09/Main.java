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
}
