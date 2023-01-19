package ch06.ex04.case07;

public class Shoes extends Product{
	private int price;
	
	public Shoes(int price){
	super(price);
	this.price = price*2;
	}  //super 클래스 호출해서 디자인
	
	@Override
	public int getPrice(){
		return this.price;
	} // Product의 price 사용하지 않도록 재정의
	
	public String toString(){
		return String.format("%,d원 절반 할인해서 %,d원에 판매.", super.price, this.price);
	}
}
