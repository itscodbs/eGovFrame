package ch05.ex05.home.case02;

import java.time.LocalDate;

public class CopierMain {
	public static void main(String[] args){
		Document doc = new Document();
		doc.setTitle("태백산맥");
		doc.setContent("빨치산도 대한민국의 역사이다.");
		doc.setCreationDate(LocalDate.of(1983, 9, 12));
		doc.setPageNum(3);

		Copier copier = new Copier();
		Document copyDoc1 = copier.copy(doc);
		Document copyDoc2 = copier.copy(doc);
		
		System.out.println(copyDoc1);
		System.out.println();
		System.out.println(copyDoc2);
	}
}