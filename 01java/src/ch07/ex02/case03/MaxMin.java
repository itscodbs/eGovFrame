package ch07.ex02.case03;

public class MaxMin {
	public static void main(String[] args){
		int [] score = {79, 88, 91, 33, 199, 55, 95};
		
		int max = score[0];
		int min = score[0];
		
		for(int i=1; i<score.length; i++){
			if(score[i] > max) max = score[i];
			if(score[i] < min) min = score[i];
		}
		
		System.out.printf("max : %d, min : %d", max, min);
	}
}
