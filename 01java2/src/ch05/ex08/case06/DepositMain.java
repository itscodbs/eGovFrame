package ch05.ex08.case06;

public class DepositMain {
	public static void main(String[] args){
		Deposit deposit1 = new Deposit();
		Deposit deposit2 = new Deposit(200);
		Deposit deposit3 = new Deposit(200,100);
		
		System.out.printf("%s, %s, %s", deposit1, deposit2, deposit3);
	}
} // instance 생성된 직후에 new 연산자 실행 