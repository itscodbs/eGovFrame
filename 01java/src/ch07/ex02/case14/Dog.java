package ch07.ex02.case14;

public class Dog {
	private String name;
	
	public Dog(String name){
		this.name = name;
	}
	
	public void eat(){
		System.out.println(name + " 밥을 먹다.");
	}
	
	@Override
	public String toString(){
		return name;
	}
}
