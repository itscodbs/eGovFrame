package ch07.ex03.case03;

public interface Animal {
	public default void eat(){
		System.out.println("먹다");
	}
	
	void move();
}
