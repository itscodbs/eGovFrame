package ch05.ex01.home;

import java.time.LocalDate;
import java.util.Scanner;

public class Man2Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요. \n>>");
		String name = sc.nextLine();
		System.out.print("나이를 입력하세요. \n>>");
		int age = sc.nextInt();
		
		Man2 man = new Man2();
		man.setName(name);
		man.setAge(age);
		man.setRegDate(LocalDate.now());
		
		System.out.println("\n입력하신 1명의 정보는 다음과 같습니다.");
		System.out.printf("이 름 : %s\n나 이 : %d살\n등록일 : %s", man.getName(), man.getAge(), man.getRegDate());
	}
}
