package ch05.ex05.case01;

public class ArithMain {
	public static void main(String[] args){
		Arith arith = new Arith();
		
		int result = arith.add(10, 2);
		System.out.println("+ : " + result);
		
		result = arith.minus(10, 2);
		System.out.println("- : " + result);
		
		result = arith.multiply(10, 2);
		System.out.println("* : " + result);
		
		result = arith.divide(10, 2);
		System.out.println("/ : " + result);
	}
}
