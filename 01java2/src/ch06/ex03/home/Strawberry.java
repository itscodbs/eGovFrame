package ch06.ex03.home;

public class Strawberry extends IceCream{
	private int price;
	
	public Strawberry(String name, int price){
		super(name);
		this.price = price;
	}
	
	public String toString(){
		return String.format("%s아이스크림의 가격은 %d원입니다.", this.name, this.price);
	}
}	
