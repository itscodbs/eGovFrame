package ch04.ex04.case04;

import java.util.Scanner;

public class GuessNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int target = (int)(Math.random()*1000)+1;
		int guess = 0;
		int tries = 0;
		
		do{
			System.out.print("값을 입력하세요 : ");
			guess = sc.nextInt();
			tries++;
			if(guess>target)
				System.out.println("더 큰 수를 입력했습니다.");
			else if(guess<target)
				System.out.println("더 작은 수를 입력했습니다.");
		}while(guess != target);
		
		System.out.printf("%d번 만에 %d를 찾았습니다.", tries, target);
		
		sc.close();
	}
}
