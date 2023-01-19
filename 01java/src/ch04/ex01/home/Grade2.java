package ch04.ex01.home;

import java.util.Scanner;

public class Grade2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int kor=0, eng=0, mat=0, tot=0;
		double avg = 0;
		char grade = 0;

		System.out.print("국어 : "); kor = sc.nextInt();
		System.out.print("영어 : "); eng = sc.nextInt();
		System.out.print("수학 : "); mat = sc.nextInt();
		
		tot = kor+eng+mat;
		avg = tot/3.0;
		
		if(avg>=90) grade = 'A';
		else if(avg>=80) grade = 'B';
		else if(avg>=70) grade = 'C';
		else grade = 'D';
		
		System.out.printf("총점 : %d\n평균 : %.1f\n등급 : %c", tot, avg, grade);
		
		sc.close();
	}
}