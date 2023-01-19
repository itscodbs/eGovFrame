package ch02.ex02.home;

import java.time.LocalDate;
import java.util.Scanner;

public class Reservation { 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("공연 관람 일자를 입력하세요.");
		
		System.out.print("년 : "); int year = sc.nextInt();
		System.out.print("월 : "); int month = sc.nextInt();
		System.out.print("일 : "); int day = sc.nextInt();
			
		System.out.printf("%s년 %s월 %s일자 공연을 예매했습니다.\n", year, month, day);
		
		LocalDate localDate = LocalDate.of(year, month, day);
		localDate = localDate.minusDays(3);
		System.out.printf("%s까지 무료 환불이 가능합니다.", localDate);
	}
}
