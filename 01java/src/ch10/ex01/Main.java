package ch10.ex01;

public class Main {
	public static void main(String[] args) {
		Day day = Day.FRIDAY;
		
		String dayName = "";
		switch(day){
		case MONDAY : dayName = "월요일"; break;
		case TUESDAY : dayName = "화요일"; break;
		case WEDNESDAY : dayName = "수요일"; break;
		case THURSDAY : dayName = "목요일"; break;
		case FRIDAY : dayName = "금요일"; break;
		case SATURDAY : dayName = "토요일"; break;
		default : dayName = "일요일";  
		}
		
		System.out.println(dayName);
	}
}
