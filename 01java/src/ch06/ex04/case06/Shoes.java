package ch06.ex04.case06;

public class Shoes extends Product {
	private int price;
	
	public Shoes (int price){
		super(price);
		this.price = price;
	}
	
	@Override
	public int getPrice(){
		return this.price;  // Product(예제5)가 아닌 Shoes타입의 this로 재정의
	}
}
