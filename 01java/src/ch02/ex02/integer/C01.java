/* 숫자 literal*/

package ch02.ex02.integer;

public class C01 { 
	public static void main(String[] args) {
		int x = 10; //decimal, 10진수
		System.out.println(Integer.toBinaryString(x));
		
		x = 012;    //octal, 8진수
		System.out.println(Integer.toBinaryString(x));
		
		x = 0xA;    //hexadecimal, 16진수
		System.out.println(Integer.toBinaryString(x));
		
		x = 0b1010; //binary, 2진수
		System.out.println(Integer.toBinaryString(x));
		
		x = 9_505_302;  
		System.out.println(x);
		
		double y = 10e3;
		System.out.println(y);
	}
}
