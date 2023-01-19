package ch05.ex05.home.case02;

import java.time.LocalDate;

public class CopierMain {
	public static void main(String[] args) {
		Document doc = new Document();
		doc.setTitle("이것이 자바다.");
		doc.setContent("객체 지향 프로그래밍을 OOP라고 한다.\nOOP는 Object Oriented Programming의 약자이다.");
		doc.setCreationDate(LocalDate.of(2018, 04, 17));
		doc.setPageNum(200);
		
		Copier copier = new Copier();
		Document copyDoc1 = copier.copy(doc);
		Document copyDoc2 = copier.copy(doc);
		
		
		System.out.println(copyDoc1);
		System.out.println(copyDoc2);
	}
}
