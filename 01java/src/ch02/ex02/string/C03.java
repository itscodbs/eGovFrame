/* API : StringBuffer */

package ch02.ex02.string;

public class C03 { 
	public static void main(String[] args) {
		StringBuffer src = new StringBuffer("우리 개는 ");
		
		int len = src.length();
		System.out.println("length : " + len);  // src 길이 출력
		
		src.append("짖는다."); // "우리 개는 짖는다."로 변경
		src.replace(3, 4, "고양이"); // String 클래스와 다름. 개 -> 고양이로 변경
		System.out.printf("%s", src);
		
		String str = src.toString();
	}
}
