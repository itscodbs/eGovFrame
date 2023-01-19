package ch07.ex02.case08;

public class Cat implements Animal{
	@Override
	public void eat(){
		System.out.println("먹다.");
	}
	
	public void move(){
		System.out.println("걸어가다.");
	}
}
