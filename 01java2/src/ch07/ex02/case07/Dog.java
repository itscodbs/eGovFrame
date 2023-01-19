package ch07.ex02.case07;

public class Dog implements Animal{
	private String name;
	
	public Dog(String name){
		this.name = name;
	}
	
	public String toString(){
		return name;
	}
}
