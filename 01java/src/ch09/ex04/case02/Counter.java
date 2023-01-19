package ch09.ex04.case02;

public class Counter {
	private int val;
	
	public synchronized void inc(){
		val++;
	}
	
	public synchronized void dec(){
		val--;
	}
	
	public  synchronized void print(){
		System.out.print(val + " ");
	}
}
