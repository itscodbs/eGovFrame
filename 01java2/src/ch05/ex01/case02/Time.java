package ch05.ex01.case02;

public class Time {
	int hour;
	int minute;
	int second;
	
	public String toString(){
		return String.format("%d시 %d분 %d초", hour, minute, second);
	}
}
