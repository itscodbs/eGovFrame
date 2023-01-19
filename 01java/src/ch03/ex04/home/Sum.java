package ch03.ex04.home;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {  // 두 수를 입력받아 그 합계를 구하라.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("a : "); int a = sc.nextInt();
		System.out.print("b : "); int b = sc.nextInt();
		int sum = a+b;
		System.out.printf("a(%d)와 + b(%d)의 합은 %d입니다.", a, b, sum);
		
		sc.close();
	}
}
