package ch03.ex07.case02;

public class StringCompare {
	public static void main(String[] args) {
		System.out.println('a' == 'a');
		System.out.println("a" == "a");
		System.out.println("a" == "b");
		
		String s = "a";
		System.out.println(s=="a");
		
		s = new String("a");
		System.out.println(s=="a");
		System.out.println(s.equals("a"));
	}
}
