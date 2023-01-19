package ch05.ex02.case02;

public class Arith {
	private int firstNum;
	private int secondNum;
	
	public int add(){
		return firstNum + secondNum; 
	}
	
	public int minus(){
		return firstNum - secondNum;
	}
	
	public int multiply(){
		return firstNum * secondNum;
	}
	
	public int divide(){
		return firstNum / secondNum;
	}

	public int getFirstNum() {
		return firstNum;
	}

	public void setFirstNum(int firstNum) {
		this.firstNum = firstNum;
	}

	public int getSecondNum() {
		return secondNum;
	}

	public void setSecondNum(int secondNum) {
		this.secondNum = secondNum;
	}
}
