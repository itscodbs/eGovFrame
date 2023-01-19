package ch04.ex05.case03;

public class ByTwo {
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 0; i<=10; i+=2){
			sum += i;
			System.out.printf("+%d : %d\n", i, sum);
		}
	}
}
