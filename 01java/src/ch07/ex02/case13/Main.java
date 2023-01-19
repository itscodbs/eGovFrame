package ch07.ex02.case13;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Cat> house = new ArrayList<>();
		house.add(new Cat("새콤이"));
		house.add(new Cat("새롬이"));
		house.add(new Cat("헤롱이"));
		
		for(Cat cat:house) cat.eat();
	}
}
