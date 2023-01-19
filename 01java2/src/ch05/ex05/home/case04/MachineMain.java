package ch05.ex05.home.case04;

import java.util.Scanner;

public class MachineMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Machine machine = new Machine();
		
		Ball ball = null;
		char isRepeat = 0;
		do{
			ball = machine.choose();
			System.out.println(ball.getNum() + "번 공");
			System.out.print("계속 공을 뽑을까요?(y/n)\n>> ");
			isRepeat = sc.nextLine().charAt(0);
		}while(isRepeat=='y');
		System.out.println("종료합니다.");
	}
}
