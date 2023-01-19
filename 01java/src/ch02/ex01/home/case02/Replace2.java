package ch02.ex01.home.case02;

import java.util.Scanner;

public class Replace2 { 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1. a에 저장할 값을 입력해주세요. : ");
		int a = sc.nextInt(); sc.nextLine();
		System.out.print("2. b에 저장할 값을 입력해주세요. : ");
		int b = sc.nextInt(); sc.nextLine();
		System.out.printf("\n[a : %d, b : %d의 값이 저장되었습니다.]\n\n", a, b);
		
		System.out.println("[a, b 변수의 값을 교체합니다.]");
		
		System.out.println("\n---------------------결과--------------------");
		
		System.out.printf("변경 전 >> a : %d, b : %d\n",  a, b);
		int c = a;
		a = b;
		b = c;
		System.out.printf("변경 후 >> a : %d, b : %d",  a, b);		

		System.out.println("\n\n[값이 교체되었습니다.]");
		
		sc.close();
	}  
}
