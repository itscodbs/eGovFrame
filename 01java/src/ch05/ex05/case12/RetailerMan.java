package ch05.ex05.case12;

public class RetailerMan {
	public static void main(String[] args) {
		Farmer farmer = new Farmer();
		Retailer retailer = new Retailer();
		
		Apple apple = retailer.sell(farmer.sell(1000)); // 농부가 사과값을 설정하면 유통업자가 받아서 사과값 재설정 -> apple에 저장
		System.out.println("사과의 가격은 " + apple.getPrice() + "원 입니다.");
	}
}
