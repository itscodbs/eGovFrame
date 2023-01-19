package ch02.ex04.case02;

public class OverFlowCalc { 
	public static void main(String[] args) {
		byte b = 126;
		System.out.println(b);
		b++;
		System.out.println(b);
		b++;
		System.out.println(b);
		b++;
		System.out.println(b);
	}
}
