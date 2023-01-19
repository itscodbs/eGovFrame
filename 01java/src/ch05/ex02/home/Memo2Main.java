package ch05.ex02.home;

import java.util.Scanner;

public class Memo2Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		Memo2 paper = new Memo2();
		System.out.print("메모지에 남길 메시지를 입력하세요.\n>>"); paper.setMsg(sc.nextLine());
		System.out.print("메모를 남기신 분은 누구인가요?\n>>"); paper.setFrom(sc.nextLine());
		
		System.out.println(paper.getMessage());
	}
}
