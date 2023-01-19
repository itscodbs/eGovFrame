package ch04.ex01.home;

import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int kor = 0; 
		int eng = 0; 
		int mat = 0;
		char grade = 0;
		
		System.out.print("국어 : "); kor = sc.nextInt();
		System.out.print("영어 : "); eng = sc.nextInt();
		System.out.print("수학 : "); mat = sc.nextInt();
		
		int sum = kor+eng+mat;  System.out.println("총점 : " + sum);
		double avg = (sum/3.0); System.out.printf("평균 : %.1f\n", avg);
				
 		if(avg >= 90) grade = 'A';
 		else if(avg >= 80) grade = 'B';
		else if(avg >= 70) grade = 'C';
		else grade = 'D';
 	
 		System.out.printf("등급 : %c", grade);
 		
 		sc.close();
	}
}
