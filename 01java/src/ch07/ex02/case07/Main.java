package ch07.ex02.case07;

public class Main {
	public static void main(String[] args) {
		Animal[] animals = new Animal[3];
		animals[0] = new Cat("헤롱이");
		animals[1] = new Cat("왈왈이");
		animals[2] = new Cat("성큼이");
		
		for(Animal animal:animals)
			System.out.println(animal);
	}
}
