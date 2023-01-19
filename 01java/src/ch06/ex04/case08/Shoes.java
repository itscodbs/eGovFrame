package ch06.ex04.case08;

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
		return String.format("%,d원 절반 할인해서 %,d원에 판매.", super.getPrice(), this.price);
	} // super.price는 Product에 private으로 선언되어서 불가능
}
