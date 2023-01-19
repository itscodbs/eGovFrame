package ch02.ex02.date;

import java.time.LocalDate;

public class C04 { 
	public static void main(String[] args) {
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);
		
		localDate = localDate.plusDays(1);
		System.out.println(localDate);
		
		localDate = localDate.minusDays(1);
		System.out.println(localDate);
	}
}
