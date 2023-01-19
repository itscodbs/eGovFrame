package ch07.ex01.case07;

public class TestMain {
	public static void main(String[] args) {
		Human man = new Human();
		Kimchi kimchi = new Kimchi();
		Ramen ramen = new Ramen();
		
		man.eat(ramen);
		man.eat(kimchi);
	}
}
