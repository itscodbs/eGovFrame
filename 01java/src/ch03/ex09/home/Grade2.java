package ch03.ex09.home;

import java.util.Scanner;

public class Grade2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int kor=0, eng=0, mat=0, total=0;
		double avg = 0;
		char grade = 0;
		
		System.out.print("국어 : "); kor = sc.nextInt();
		System.out.print("영어 : "); eng = sc.nextInt();
		System.out.print("수학 : "); mat = sc.nextInt();
		
		total = kor+eng+mat;
		avg = total/3.0;
		
		grade = avg >= 90? 'A' : (avg >= 80? 'B' : (avg >= 70? 'C' : 'D'));
		
		System.out.printf("총점 : %d\n평균 : %.1f\n학점 : %c", total, avg, grade);
		
		sc.close();
	}
}
