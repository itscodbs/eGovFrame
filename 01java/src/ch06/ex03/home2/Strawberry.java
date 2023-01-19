package ch06.ex03.home2;

public class Strawberry extends IceCream{
	private int price;
	
	public Strawberry(String name, int price){
		super(name);
		this.price = price;
	}
	
	public String toString(){
		return String.format("%s 아이스크림, %d원", this.name, this.price);
	}
}
