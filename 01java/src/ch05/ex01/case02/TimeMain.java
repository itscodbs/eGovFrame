package ch05.ex01.case02;

public class TimeMain {
	public static void main(String[] args) {
		Time time = new Time();
		time.hour = 12;
		time.minute = 35;
		time.second = 30;
		System.out.printf("%d시 %d분 %d초\n", time.hour, time.minute, time.second);
		
		System.out.printf("%s", time);
	}
}
