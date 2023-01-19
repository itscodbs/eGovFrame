package ch04.ex01.case07;

import java.util.Scanner;

public class Present {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1.냉장고 2.세탁기\n>>");
		int mainChoice = sc.nextInt(); sc.nextLine();
		int subChoice = 0;
		String prize = "";
		String brand = "";
		
		if(mainChoice ==1){
			prize = " 냉장고";
		}else if(mainChoice ==2){
			prize  = " 세탁기";
		}else{
			prize = "뽀삐 화장지";
		}
		
		if(mainChoice<3){
			System.out.printf("1.삼성 2.LG 3.대우\n>>");
			subChoice = sc.nextInt(); sc.nextLine();
			if(subChoice == 1){
				brand = "삼성";
			}else if(subChoice ==2){
				brand = "LG";
			}else if(subChoice == 3){
				brand = "대우";
			}
		}
		
		prize = brand + prize;
		System.out.println(prize + "를 드립니다.");
		
		sc.close();
	}
}
