package ch06.ex04.case05;

public class Shoes extends Product{
	private int price;
	
	public Shoes(int price){
		super(price);
		this.price = price;  // Product 타입의 this
	}

}
