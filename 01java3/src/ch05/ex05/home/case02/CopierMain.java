package ch05.ex05.home.case02;

import java.time.LocalDate;

public class CopierMain {
	public static void main(String[] args) {
		Document doc = new Document();
		doc.setTitle("태백산맥");
		doc.setContent("빨치산도 대한민국의 역사이다.");
		doc.setRegDate(LocalDate.of(1983, 9, 12));
		doc.setPageNum(3);
		
		Copier copier = new Copier();
		Document doc1 = copier.copy(doc);
		Document doc2 = copier.copy(doc);
		
		System.out.println(doc1);
		System.out.println(doc2);
}
}
