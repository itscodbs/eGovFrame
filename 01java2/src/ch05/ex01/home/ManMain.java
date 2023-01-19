package ch05.ex01.home;

import java.time.LocalDate;
import java.util.Scanner;

public class ManMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Man man = new Man();
		
		System.out.print("이름을 입력하세요.\n>>"); man.setName(sc.nextLine()); // String name = 
		System.out.print("나이를 입력하세요.\n>>"); man.setAge(sc.nextInt()); sc.nextLine(); // int age =
//		
//		man.setName(name);
//		man.setAge(age);
		man.setRegDate(LocalDate.now());
		
		System.out.println("\n입력하신 1명의 정보는 다음과 같습니다.");
		System.out.printf("이 름 : %s\n나 이 : %d살\n등록일 : %s", man.getName(), man.getAge(), man.getRegDate());		
	}
}
