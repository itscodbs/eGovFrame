package ch05.ex04.case02;

public class CardMain {
	public static void main(String[] args){
		System.out.println("Card.width : " + Card.getWidth());
		System.out.println("Card.height : " + Card.getHeight());
		
		Card.setWidth(10);
		Card.setHeight(20);
		
		Card card1 = new Card();
		card1.setKind("Heart");
		card1.setNumber(7);
		
		Card card2 = new Card();
		card2.setKind("Spade");
		card2.setNumber(4);
		
		System.out.printf("%s, %d, %d, %d\n", card1.getKind(), card1.getNumber(), card1.getWidth(), card1.getHeight());
		System.out.printf("%s, %d, %d, %d\n", card2.getKind(), card2.getNumber(), card2.getWidth(), card2.getHeight());
		
		Card.setWidth(30);
		Card.setHeight(40);
		System.out.printf("%s, %d, %d, %d\n", card1.getKind(), card1.getNumber(), Card.getWidth(), card2.getHeight());
		System.out.printf("%s, %d, %d, %d\n", card2.getKind(), card2.getNumber(), card2.getWidth(), card2.getHeight());
	}
}
