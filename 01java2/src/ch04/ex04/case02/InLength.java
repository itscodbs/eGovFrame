package ch04.ex04.case02;

import java.util.Scanner;

public class InLength {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = "";
		int len = 0;
		do{
			System.out.print("입력? : ");
			input = sc.nextLine();
			len = input.length();
			System.out.println(len + "글자 입력.");
		}while(len==0 || len>1);
		System.out.println("끝.");
		sc.close();
	}
}
