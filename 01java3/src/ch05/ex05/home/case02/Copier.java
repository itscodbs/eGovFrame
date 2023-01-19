package ch05.ex05.home.case02;

public class Copier {
	public Document copy(Document document){  // Document 클래스로 리턴타입 불러와서 copy 메소드  
		Document destDoc = new Document();    // Document 객체 생성헤서 값 설정 사용.
		destDoc.setTitle(document.getTitle());  // document 파라미터로 값 전달
		destDoc.setContent(document.getContent());
		destDoc.setRegDate(document.getRegDate());
		destDoc.setPageNum(document.getPageNum());
		
		return destDoc;	
	}
}
