package ch03.ex06.home;

public class Adjust {  
	public static void main(String[] args) {
		double f = 3.141592;
		double pi = f - f%1;
		System.out.printf("파이 값의 정수는 %s입니다.", pi);
	}
}
