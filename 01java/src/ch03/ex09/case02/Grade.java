/* 삼항연산자 */
package ch03.ex09.case02;

public class Grade {
	public static void main(String[] args) {
		int score = 100;
		char grade = score >= 90? 'A' : (score >= 80? 'B' : 'C');
		System.out.println(grade);
	}
}
