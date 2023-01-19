package ch07.ex02.case04.home;

public class Lotto {
	public static void main(String[] args){
		int[] ball = new int[45];
		
		for(int i=0; i<ball.length; i++) ball[i] = i+1;
		
		int n = 0;		
		int temp = 0;
		
		for(int i=0; i<ball.length; i++){
			n = (int)(Math.random()*45);

			temp = ball[0];
			ball[0] = ball[n];
			ball[n] = temp;
		}
		
		for(int i=0; i<6; i++){
			System.out.print(ball[i] + " ");
		}
	}
}
