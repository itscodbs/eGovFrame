package ch05.ex05.case12;

public class Farmer {  // 서비스 객체라서 멤버변수 x = 사과를 팔다
	public Apple sell(int price){
		Apple apple = new Apple();
		apple.setPrice(price);
		return apple;
	}
}
