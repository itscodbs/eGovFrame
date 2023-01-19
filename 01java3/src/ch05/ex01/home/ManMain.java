package ch05.ex01.home;

import java.time.LocalDate;
import java.util.Scanner;

public class ManMain {
	public static void main(String[] args) {
		Man man = new Man();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요.\n>>");	man.setName(sc.nextLine());
		System.out.print("나이를 입력하세요.\n>>");	man.setAge(sc.nextInt()); sc.nextLine();
		System.out.printf("\n입력하신 1명의 정보는 다음과 같습니다.\n이 름 : %s\n나 이 : %d\n등록일 : %s",
				          man.getName(), man.getAge(), man.getRegDate());
	}
}
