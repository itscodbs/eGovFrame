package ch07.ex02.case02;

public class Score {
	public static void main(String[] args){
		int sum = 0;
		double avg = 0.0;
		int[] score = {100, 50, 100, 50};
		
		for(int i=0; i<score.length; i++) sum += score[i];
		avg = 1.0*sum/score.length;
		
		System.out.printf("sum : %d , avg : %.1f", sum, avg);
	}
}
