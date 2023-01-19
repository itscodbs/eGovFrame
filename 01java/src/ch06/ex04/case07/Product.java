package ch06.ex04.case07;

public class Product {
	protected int price;
	
	public Product(int price){
		this.price = price*2;
	}
	
	public int getPrice(){
		return this.price;
	}
}
