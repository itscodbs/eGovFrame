/* API : String */
package ch02.ex02.string;

public class C02 { 
	public static void main(String[] args) {
		String src = "우리 개는 ";
		String s1, s2, s3;
		char c;
		
		int len = src.length();
		System.out.println("length : " + len);

		s1 = src.concat("짖는다.");
		s2 = src.replace("개", "고양이");
		s3 = src.substring(0,4);
		c = src.charAt(3);
		System.out.printf("%s\n%s\n%s\n%c", s1, s2, s3, c);
	}
}
