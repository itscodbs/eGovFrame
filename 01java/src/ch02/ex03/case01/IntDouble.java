/* int <-> double */

package ch02.ex03.case01;

public class IntDouble { 
	public static void main(String[] args) {
		int i = 1;
		double d = 0.0;
		
		d = i;
		System.out.println(d); // 1.0
		d = (double)i;
		System.out.println(d); // 1.0 
		
		// i = d; -> compile error
		i = (int)d; 
		System.out.println(i); // 1
		System.out.println(d); // 1.0
	}
}
