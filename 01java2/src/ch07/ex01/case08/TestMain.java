package ch07.ex01.case08;

public class TestMain {
	public static void main(String[] args) {
		Clerk clerk = new Clerk();
		Flower flower = null;
		
		flower = clerk.sell("백합");
		System.out.println(flower);
		flower = clerk.sell("장미");
		System.out.println(flower);
	}
}
