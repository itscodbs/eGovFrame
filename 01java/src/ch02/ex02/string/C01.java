/* 문자열 literal */

package ch02.ex02.string;

public class C01 {
	public static void main(String[] args) {
		int a = 1, b = 2, c = 3;
		int sum = a + b + c;
		System.out.printf("sum : %d\n", sum);
		
		String concat = "" + a + b + c;
		System.out.println("concat : " + concat);
		
		concat = a + b + "" + c;
		System.out.println("concat : " + concat);
		
		String dialog = "Junhoe said," + "\"hello\".";
		System.out.println(dialog);
	}
}
