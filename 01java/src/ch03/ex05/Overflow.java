/* Overflow */
package ch03.ex05;

public class Overflow {
	public static void main(String[] args) {
		int a = 1000000;
		int b = 1000000;
		long c = a*b;
		System.out.println("c = " + c);
		c = a * (long)b;
		System.out.println("c = " + c);
		
		int x = 1000000 * 100000 / 1000000;
		int y = 1000000 / 100000 * 1000000;
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}
}
