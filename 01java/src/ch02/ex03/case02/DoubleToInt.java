package ch02.ex03.case02;

public class DoubleToInt {
	public static void main(String[] args) {
		double d = 1.52;
		int i = (int)d;
		System.out.println(i);
		
		double f = Math.floor(d);
		double r = Math.round(d);
		System.out.printf("%.2f, %.2f\n", f, r);
		
		int f2 = (int)f;
		int r2 = (int)r;
		System.out.printf("%d, %d", f2, r2);
	}
}
