package ch04.ex01.case03;

public class If {
	public static void main(String[] args) {
		int hour = 12;
		if(hour<12){
			System.out.println("Good Morning");
		}else if(hour<18){
			System.out.println("Good Afternoon");
		}else if(hour<21){
			System.out.println("Good Evening");
		}else {
			System.out.println("Good Night");
		}
		
		hour = 20;
		String bow = "";
		if(hour<12) bow = "Good Morning";
		else if(hour<18) bow = "Good Afternoon";
		else if(hour<21) bow = "Good Morning";
		else bow = "Good night";
		System.out.println(bow);
	}
}
