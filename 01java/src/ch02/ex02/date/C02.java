/* API : LocalDate 등 */

package ch02.ex02.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class C02 { 
	public static void main(String[] args) {
		LocalDate localDate = LocalDate.of(2018,3,31);
		LocalTime localTime = LocalTime.of(11, 6, 13);
		LocalDateTime localDateTime = LocalDateTime.of(LocalDate.of(2018, 3, 31), LocalTime.of(11,6,13));
		
		System.out.println(localDate);
		System.out.println(localTime);
		System.out.println(localDateTime);
	}
}
