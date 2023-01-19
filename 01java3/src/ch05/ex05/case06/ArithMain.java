package ch05.ex05.case06;

public class ArithMain {
	public static void main(String[] args){
		Arith arith = new Arith();
		int result = arith.toDouble(10) + arith.toHalf(10);
		System.out.println(result);
	}
}
