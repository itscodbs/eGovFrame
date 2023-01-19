package ch07.ex02.case05;

public class DoubleArray {
	public static void main(String[] args){
		int[][] score = {
				{90, 90, 90},
				{20, 20, 20},
				{30, 30, 30},
				{40, 40, 40},
				{50, 50, 50}
		};
		
		int korTot=0, EngTot=0, mathTot=0;
		
		System.out.println("번호   국어  영어  수학   합계  평균");
		System.out.println("==========================");
		
		for(int i=0; i<score.length; i++){
			int sum = 0;
			System.out.print(" " + (i+1) + " ");
			for(int j=0; j<score.length; j++){
				sum += score[i][j];
				System.out.printf("%4d", score[i][j]);
			}
			System.out.printf("%4d %3d\n", sum, sum/score[i].length);
		}
		System.out.println("==========================");
	}
}
