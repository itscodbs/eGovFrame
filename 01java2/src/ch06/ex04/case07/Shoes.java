package ch06.ex04.case07;

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
	
	public String toString(){
		return String.format("%,d원을 절반 할인해서 %,d원에 판매합니다.", super.price, this.price);
	}
}
