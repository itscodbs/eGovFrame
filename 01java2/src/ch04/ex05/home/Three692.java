package ch04.ex05.home;

public class Three692 { //180409
	public static void main(String[] args) {
		int first = 0;
		int second = 0;

		for(int i =1; i<100; i++){
			first = i/10;
			second = i%10;
			System.out.print(" " + i);
			if(first!=0 && first%3==0) System.out.print("짝");
			if(second!=0 && second%3==0) System.out.print("짝");
			if(i%10==0) System.out.println();
		}
	}
}
