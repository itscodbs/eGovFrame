/* API : LocalDate */

package ch02.ex02.date;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class C03 {
	public static void main(String[] args) {
		LocalDate localDate = LocalDate.of(2018, 3, 31);
		int year = localDate.getYear();
		int dayOfYear = localDate.getDayOfYear();
		int dayOfMonth = localDate.getDayOfMonth();
		DayOfWeek dayOfWeek = localDate.getDayOfWeek();
		Month month = localDate.getMonth();
		int monthValue = localDate.getMonthValue();
		boolean leap = localDate.isLeapYear();
		
		System.out.println(year);
		System.out.println(dayOfYear);
		System.out.println(dayOfMonth);
		System.out.println(dayOfWeek);
		System.out.println(month);
		System.out.println(monthValue);
		System.out.println(leap);
	}
}
