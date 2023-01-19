package ch05.ex02.case01;

public class ArithMain {
	public static void main(String[] args) {
		Arith arith = new Arith();
		arith.setFirstNum(1);
		arith.setSecondNum(2);
		
		int result = arith.getFirstNum() + arith.getSecondNum();
		result = arith.getFirstNum() - arith.getSecondNum();
		result = arith.getFirstNum() * arith.getSecondNum();
		result = arith.getFirstNum() / arith.getSecondNum();
	}
}
