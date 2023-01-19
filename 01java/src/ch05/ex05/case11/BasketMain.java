package ch05.ex05.case11;

public class BasketMain {
	public static void main(String[] args){
		Apple apple = new Apple();
		apple.setPrice(1000);
		
		Basket basket = new Basket();
		basket.setApple(apple);
		System.out.println("사과의 가격은 " + basket.getApple().getPrice() + "원 입니다.");
	}
}
