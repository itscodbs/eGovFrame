package ch05.ex07.case02;

public class Stack {
	public void first(){
		int a = 0;
		System.out.println("first() 시작.");
		this.second();
		System.out.println("first() 종료.");
	}
		
		public void second(){
			int a = 0;
			System.out.println("second() 시작.");
			System.out.println("second() 종료.");
		}
}
