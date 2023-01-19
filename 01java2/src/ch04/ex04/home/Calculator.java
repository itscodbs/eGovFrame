package ch04.ex04.home;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int result = 0;
		char op = 0;
		char repeat = 0;

		do{
			System.out.print("숫자1을 입력해주세요. : ");
			a = sc.nextInt(); sc.nextLine();
			System.out.println("(+,-,*,/) : ");
			op = sc.nextLine().charAt(0);
			System.out.print("숫자2를 입력해주세요. : ");
			b = sc.nextInt(); sc.nextLine();

			switch(op){
			case '+' : result = a+b; break;
			case '-' : result = a-b; break;
			case '*' : result = a*b; break;
			case '/' : result = a/b; 

			}System.out.printf("%d%c%d=%d\n", a, op, b, result);
			System.out.print("continue? y or n\n");
			repeat = sc.nextLine().charAt(0);
		}while(repeat == 'y');
		System.out.println("[종료합니다.]");
		sc.close();;
	}
}