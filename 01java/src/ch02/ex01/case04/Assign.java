package ch02.ex01.case04;

public class Assign { 
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		System.out.printf("%d, %d\n", a, b); // 1, 2
		
		a = b;
		System.out.printf("%d, %d\n", a, b); // 2, 2
		
		a = b+1;
		System.out.printf("%d, %d\n", a, b); // 3, 2
		
		double d = Math.random();
		System.out.printf("%.2f", d); // 0.87		
	} 
} 
