package ch05.ex02.case03;

public class Calculator {
	public int add(int firstNum, int secondNum){
		return firstNum + secondNum;
	}
	
	public int minus(int firstNum, int secondNum){
		return firstNum - secondNum;
	}
	
	public int multiply(int firstNum, int secondNum){
		return firstNum * secondNum;
	}
	
	public int divide(int firstNum, int secondNum){
		return firstNum / secondNum;
	}
}// 객체가 하는 행동의 메소드만 써도 가능. 메소드도 없이 생성해도 가능. 잠깐 사용할 데이터는 변수가 아니라 parameter에 입력해서 쓰고 버리면 된다.
// OOP 객체 지향 프로그래밍 주어.서술어(목적어); add(){메소드 정의} add(); -> 메소드를 호출한다. parameter 데이터 자리 
