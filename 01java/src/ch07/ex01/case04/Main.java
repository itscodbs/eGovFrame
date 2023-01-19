package ch07.ex01.case04;

public class Main {
	public static void main(String[] args) {
		Tree tree = new Platanus();         // 값을 담을 때는 나무타입, 관점에서 저장. => 다형성
		Platanus platanus = new Platanus(); // 값을 담을 때 platanus 타입, 관점
		                                    // 객체는 2개의 타입 저장 + OBject 타입도 가지고 있음 
		platanus = (Platanus) tree;         // 타입이 일치하게 됨 (10과 같은 casting이다)
		tree = platanus;                    // promotion 일어남
		tree = (Tree) platanus;
	}
}