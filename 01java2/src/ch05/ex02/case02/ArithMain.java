package ch05.ex02.case02;

public class ArithMain {
	public static void main(String[] args) {
		Arith arith = new Arith();
		arith.setFirstNum(3);
		arith.setSecondNum(2);
		
		System.out.println("덧 셈 : " + arith.add());  // 계산기가 더하다 
		System.out.println("뺄 셈 : " + arith.minus());
		System.out.println("곱 셈 : " + arith.multiply());
		System.out.println("나눗셈 : "+ arith.divide());
	}
} // 변수에 저장하는 것 = 비효율적
