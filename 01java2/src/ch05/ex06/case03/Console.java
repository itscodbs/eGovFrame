package ch05.ex06.case03;

import java.util.Scanner;

public class Console {
	private static Scanner sc = new Scanner(System.in);
	
	public static String inStr(){
		return sc.nextLine().trim();
	} // 버그의 가능성을 줄이기위해 trim() 메소드 사용
	
	public static int inNum(){
		int num = sc.nextInt(); sc.nextLine();
		return num;
	}
	
	public static void info(String msg){
		System.out.println(msg);
	}
	
	public static void inMsg(String msg){
		System.out.print(msg + "\n☞  ");
	}
}
