/* String <-> int */
package ch02.ex03.case03;

public class StringInt { 
	public static void main(String[] args) {
		int i = 1;
		String str = "" + i;
		System.out.println(str);  // 1
		
		str = "1";
		i = Integer.parseInt(str);
		int result = i + 1;
		System.out.println(result); // 2
	}
}
