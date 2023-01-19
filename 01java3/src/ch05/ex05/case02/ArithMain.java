package ch05.ex05.case02;

public class ArithMain {
	public static void main(String[] args) {
		Arith arith = new Arith();
		
		double result = arith.add(10.0, 2.0);
		System.out.println("add(double, double) : " + result);
		
		result = arith.add(10, 2.0);
		System.out.println("add(int, double) : " + result);
		
		result = arith.add(10.0, 2);
		System.out.println("add(double, int) : " + result);
	}
}
