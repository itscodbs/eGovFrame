package ch05.ex05.case12;

public class RetailerMain {
	public static void main(String[] args) {
		Farmer farmer = new Farmer();
		Retailer retailer = new Retailer();
		
		Apple apple = retailer.sell(farmer.sell(1000));
		System.out.println(apple.getPrice() + "원입니다.");
	}
}
