/* 성적별 등급 정하기 */
package ch04.ex01.case05;

public class Grade {
	public static void main(String[] args){
		int score = 90;
		char grade = 0;
		
		if(score >= 90) grade = 'A';
		else if(score >= 80) grade = 'B';
		else grade = 'C';
		
		System.out.println(grade + "등급");
	}
}
