package ch05.ex05.home.case03;

import java.util.Scanner;

public class MachineMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Machine machine = new Machine();
		
		char isRepeat = 0;
		do{
			System.out.print(machine.choose()+"번 공이 나왔습니다. 계속 공을 뽑을까요? [y/n]\n>> ");
			isRepeat = sc.nextLine().charAt(0);
		}while(isRepeat=='y');
		System.out.println("\n[Lotto프로그램을 종료합니다.]");
	}
}
