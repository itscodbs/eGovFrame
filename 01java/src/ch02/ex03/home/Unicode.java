package ch02.ex03.home;

import java.util.Scanner;

public class Unicode {  //180330 
	public static void main(String[] args) {  // 문자를 10진수로 변경하시오.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자를 입력하세요. : ");
		char c = sc.nextLine().charAt(0);
		
		int i = (int)c;
		System.out.printf("입력하신 %c의 unicode(10진수)는 %d입니다.", c, i);
	}
}
