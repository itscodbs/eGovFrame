/* 산술(+,-,*,/) 연산자 */
package ch03.ex04.case01;

public class Arith {
	public static void main(String[] args) {
		byte a = 3;
		byte b = 2;
		byte c = (byte)(a+b);
		System.out.println("c : " + c);
		
		c++;
		System.out.println("c : " + c);
		
		double d = a/b;
		System.out.println("d : " + d);
		
		d = (double)a/b;
		System.out.println("d : " + d);
		d = 1.0*a/b;
		System.out.println("d : " + d);
		
		d = (double)(a/b);
		System.out.println("d : " + d);
		d = a/b*1.0;
		System.out.println("d : " + d);
	}
}
