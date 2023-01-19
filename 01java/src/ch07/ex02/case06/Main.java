package ch07.ex02.case06;

public class Main {
	public static void main(String[] args) {
		Cat[] cats = new Cat[3];
		cats[0] = new Cat("헤롱이");
		cats[1] = new Cat("야코미");
		cats[2] = new Cat("새롬이");
		// dog는 Cat 타입에 넣지 못함 -> 다형성 이용
		
		for(Cat cat:cats) System.out.println(cat);
	}
}
