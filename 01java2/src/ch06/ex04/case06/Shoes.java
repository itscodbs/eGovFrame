package ch06.ex04.case06;

public class Shoes extends Product{
	private int price;
	
	public Shoes(int price){
		super(price);
		this.price = price;
	}
	
	@Override
	public int getPrice(){
		return this.price;
	}
}
