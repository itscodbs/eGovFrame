package ch05.ex05.case12;

public class Retailer {
	public Apple sell(Apple apple){
		apple.setPrice(apple.getPrice()*2);
		return apple;
	}
}
