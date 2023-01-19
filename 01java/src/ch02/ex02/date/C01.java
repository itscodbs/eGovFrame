/* API : LocalDate 등 */

package ch02.ex02.date; 

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class C01 { //180330
	public static void main(String[] args) {
		LocalDate localDate = LocalDate.now();
		LocalTime localTime = LocalTime.now();
		LocalDateTime localDateTime = LocalDateTime.now();
		
		System.out.println(localDate);
		System.out.println(localTime);
		System.out.println(localDateTime);
	}
}
