package ch07.ex02.case18;

import java.util.ArrayList;
import java.util.List;

public class TestMain {
	public static void main(String[] args) {
		Dove dove = new Dove();
		Duck duck = new Duck();
		Lion lion = new Lion();
		Leopard leopard = new Leopard();
		
		List<Mammel> pen = new ArrayList<>();
		pen.add(lion);
		pen.add(leopard);
		
		List<Bird> cage = new ArrayList<>();
		cage.add(dove);
		cage.add(duck);
		
		for(Mammel mammel : pen) mammel.walk();
		System.out.println();

		for(Bird bird : cage) bird.fly();
	}
}
