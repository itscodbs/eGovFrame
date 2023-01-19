package ch04.ex02.case05.home;

import java.util.Scanner;

public class SeasonIf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int month = 1; 
		String season = "";

		System.out.print("월을 입력하세요. : "); 
		month = sc.nextInt();

		if(month>=3 && month<=5) season = "봄";
		else if(month>=6 && month<=8) season = "여름";
		else if(month>=9 && month<=11) season = "가을";
		else if(month>=1 && month<=12) season = "겨울";
		else if(month>12 || month==0) season = "해당 데이터가 없는 달";

		System.out.printf("%d월은 %s입니다.", month, season);

		sc.close();
	}
}
