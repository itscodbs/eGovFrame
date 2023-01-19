package ch03.ex09.home;

import java.util.Scanner;

public class Grade { //180403
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("국어 : "); int kor = sc.nextInt();
		System.out.print("영어 : "); int eng = sc.nextInt();
		System.out.print("수학 : "); int mat = sc.nextInt();
		
		int sum = kor+eng+mat; 		System.out.printf("총점 : %d\n", sum);
		double avg = (sum/3.0);	System.out.printf("평균 : %.1f ", avg);
		
		char g = avg >= 90? 'A' : (avg >= 80 ? 'B' : (avg >= 70 ? 'C' : 'D'));
		
		System.out.print(g);		
		sc.close();
	}
}
