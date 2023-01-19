package ch02.ex01.case03;

import java.util.Scanner;

public class Input { 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력 : ");
		String s = sc.nextLine(); //  nextLine String 타입 입력
		System.out.println(s + "을(를) 입력"); // Hello java을(를) 입력

		System.out.print("숫자 입력 : ");
		int a = sc.nextInt(); 
		sc.nextLine();  // 할당연산자x, sc.nextLine();이 없으면 버그가 발생한다. \n
		System.out.println(a + "을(를) 입력"); // 1을(를) 입력

		System.out.print("문자열 입력 : ");
		s = sc.nextLine();
		System.out.println(s + "을(를) 입력"); // programming을(를) 입력

		System.out.print("문자열 입력 : "); 
		char c = sc.nextLine().charAt(0); // thejoeunIT
		System.out.println(c + "을(를) 입력"); // t을(를) 입력
		
		sc.close();
	} 
}
