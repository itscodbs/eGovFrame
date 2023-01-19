package ch04.ex02.case06.home;

import java.util.Scanner;

public class Kawibawibo { //180404
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1.가위, 2.바위, 3.보\n>>");
		int userKbb = sc.nextInt();
		int alphKbb = (int)(Math.random()*3)+1;

		String choice = "";
		switch(userKbb){
		case 1: choice = "가위"; break;
		case 2: choice = "바위"; break;
		case 3: choice = "보";
		}
		System.out.println("당 신 : " + choice);

		switch(alphKbb){
		case 1: choice = "가위"; break;
		case 2: choice = "바위"; break;
		case 3: choice = "보";
		}
		System.out.println("알파고 : " + choice);

		String result = "";
		switch(userKbb-alphKbb){
		case -2: case 1: result = "당신이 이겼습니다."; break;
		case -1: case 2: result = "당신이 졌습니다."; break;
		case 0: result = "비겼습니다.";
		}
		System.out.println(result);
		sc.close();
	}
}
