package ch05.ex01.case01;

public class TimeMain {  
	public static void main(String[] args){
		int hour = 12;
		int minute =35;
		int second = 30;
		System.out.printf("");
		
		Time time1 = new Time();
		time1.hour = 12;
		time1.minute = 35;
		time1.second = 30;
		System.out.printf("%d시 %분 %초\n", time1.hour, time1.minute, time1.second);
		
		Time time2 = new Time();
		time2.hour = 10;
		time2.minute = 35;
		time2.second = 30;
		System.out.printf("%d시 %d분 %d초\n", time1.hour, time1.minute, time1.second);
			
		System.out.printf("%s", time2);
	}
}
