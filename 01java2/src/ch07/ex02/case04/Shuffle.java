package ch07.ex02.case04;

public class Shuffle {
	public static void main(String[] args){
		int[] number = new int[5];
		
		for(int i=0; i<number.length; i++){
			number[i] = i;
			System.out.print(number[i]);
		}
		System.out.println();
		
		for(int i=0; i<100; i++){
			int n = (int)(Math.random()*5);
			
			int temp = number[0];
			number[0] = number[n];
			number[n] = temp;
		}
		
		for(int i=0; i<number.length; i++)
			System.out.print(number[i]);
	}
}
