package ch04.ex02.home;

import java.util.Scanner;

public class Present {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String prize = "";
		String brand = "";
		int mainChoice = 0;
		int subChoice = 0;

		System.out.print("1.냉장고  2.세탁기\n>>");
		mainChoice = sc.nextInt(); sc.nextLine();
		switch(mainChoice){
		case 1: prize = "냉장고"; break;
		case 2: prize = "세탁기"; break;
		default : prize = "뽀삐 화장지";
		}

		switch(mainChoice){
		case 1: case 2:
			System.out.print("\n1.삼성  2.LG  3.대우\n>>");
			subChoice = sc.nextInt(); sc.nextLine();
			switch(subChoice){
			case 1: brand = "삼성"; break;
			case 2: brand = "LG"; break;
			case 3: brand = "대우"; break;
			default : brand = "";
			}
		}
			System.out.printf("\n%s %s를 드립니다.", brand, prize);
			sc.close();
		}
	}
