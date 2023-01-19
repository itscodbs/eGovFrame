package ch06.ex03.case03;

public class Cat extends Animal{
	private int age;
	
	public Cat(String name, int age){
		super();
		this.age = age;	
	}
	
	public int getAge(){
		return this.age;
	}
}
