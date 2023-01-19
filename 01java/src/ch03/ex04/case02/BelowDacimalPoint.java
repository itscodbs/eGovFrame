/* 실수 소수점 이하 자리수 조정하기 */
package ch03.ex04.case02;

public class BelowDacimalPoint {
	public static void main(String[] args) {
		double pi = 3.141592;
		
		double shortPi = (int)(pi * 10) / 10d;
		System.out.println(shortPi);
		
		shortPi = (int) (pi * 1000) / 1000d;
		System.out.println(shortPi);
		
		shortPi = Math.round(pi * 1000) / 1000d;
		System.out.println(shortPi);
	}
}
