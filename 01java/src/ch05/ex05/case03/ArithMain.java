package ch05.ex05.case03;

public class ArithMain {
	public static void main(String[] args){
		Arith arith = new Arith();
		
		double result = arith.add(10, 2);
		System.out.println("add(double, double) : " + result);
	}
}
