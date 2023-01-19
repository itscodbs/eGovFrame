package ch05.ex05.case04;

public class ArithMain {
	public static void main(String[] args) {
		Arith arith = new Arith();
		
		double result = arith.add(10, 2);
		System.out.println("add(int, int) : " + result);
	}
}
