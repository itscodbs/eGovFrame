package ch08.ex05.case01;

import java.util.Scanner;

public class Assert {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("날짜 입력 : ");
		int date = sc.nextInt();
		
		assert(date>=1 && date<=31) : "잘못된 날짜" + date + "를 입력.";
		System.out.println("날짜" + date + "를 입력.");
	}
}
