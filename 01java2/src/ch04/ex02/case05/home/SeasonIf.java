package ch04.ex02.case05.home;

import java.util.Scanner;

public class SeasonIf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int month = 0;
		String season = "";
		
		System.out.print("월? ");
		month = sc.nextInt();
		
		if(month>=3 && month <=5) season = "봄";
		else if(month>=6 && month <=8) season = "여름";
		else if(month>=9 && month <=11) season = "가을";
        else if(month==12 || month==1 || month==2) season = "겨울";
        else season = "없는 월";
		
		System.out.printf("%d월은 %s입니다.", month, season);
		sc.close();
	}
}
