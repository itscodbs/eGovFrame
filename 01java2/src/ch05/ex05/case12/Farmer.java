package ch05.ex05.case12;

public class Farmer {
	public Apple sell(int price){
		Apple apple = new Apple();
		apple.setPrice(price);  // 가격 설정하는 메소드
		return apple; // 메소드를 apple 객체에 저장해서 리턴 
	}
}
