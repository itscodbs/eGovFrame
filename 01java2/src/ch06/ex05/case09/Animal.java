package ch06.ex05.case09;

public interface Animal {
	public default void eat(){
		System.out.println("입으로 먹다.");
	}
	
	void move();
}
