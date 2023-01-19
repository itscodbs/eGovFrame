package ch04.ex02.case06.home;

import java.util.Scanner;

public class Kawibawibo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int myChoice=0, alphago=0;
		String choice = "", result = "";
		
		System.out.print("1.가위 2.바위 3.보\n>>");
		myChoice = sc.nextInt(); sc.nextLine();
		alphago = (int)(Math.random()*3)+1;
			
		switch(myChoice){
		case 1: choice = "가위"; break;
		case 2: choice = "바위"; break;
		case 3: choice = "보";
		}
		System.out.println("당 신 : " + choice);
		
		switch(alphago){
		case 1: choice = "가위"; break;
		case 2: choice = "바위"; break;
		case 3: choice = "보";
		}
		System.out.println("알파고 : " + choice);
		
		switch(myChoice-alphago){
		case -2: case 1: result = "당신이 이겼습니다"; break;
		case -1: case 2: result = "당신이 졌습니다."; break;
		case 0: result = "비겼습니다.";
		}
		System.out.println(result);
		sc.close();
	}
}
