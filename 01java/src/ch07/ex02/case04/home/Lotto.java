package ch07.ex02.case04.home;

public class Lotto {
	public static void main(String[] args) {
		int[] ball = new int[45];
		
		for(int i=0; i<ball.length; i++)
			ball[i] = i+1;
		
		int temp = 0;
		int j = 0;
		
		for(int i=0; i<9505302; i++){ // i의 범위는 마음대로 설정해도됨. 카드섞는건 자유
			j = (int)(Math.random()*45);
			temp = ball[0];
			ball[0] = ball[j];
			ball[j] = temp;
		}
		
		for(int i=0; i<6; i++)
			System.out.print(ball[i] + " ");
	}
} 