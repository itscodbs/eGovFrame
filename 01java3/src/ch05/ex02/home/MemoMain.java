package ch05.ex02.home;

import java.util.Scanner;

public class MemoMain {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Memo memo = new Memo();
		
		System.out.print("메모지에 남길 메모를 작성해주세요.\n>> "); memo.setMsg(sc.nextLine());
		System.out.print("메모를 남기신 분은 누구인가요?\n>> "); memo.setFrom(sc.nextLine());
		System.out.printf("\n[메시지 내용] %s from %s", memo.getMsg(), memo.getFrom());
	}
}
