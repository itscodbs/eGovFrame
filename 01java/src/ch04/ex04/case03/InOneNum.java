package ch04.ex04.case03;

import java.util.Scanner;

public class InOneNum { // 180404
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = "";
		boolean isOne = false;
		String errMsg = "0보다 큰, 한자리 숫자만 입력하세요.";
		
		do{
			System.out.print("입력 : ");
			input = sc.nextLine();
			if(input.length()==1 && input.charAt(0)>'0' && input.charAt(0)<='9')
				isOne = true;
		}while(!isOne);
		
		System.out.println("끝");
		
		sc.close();		
	}
}
