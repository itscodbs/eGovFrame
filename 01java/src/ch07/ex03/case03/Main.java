package ch07.ex03.case03;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Animal> zoo = new ArrayList<>();
		zoo.add(new Falcon());
		zoo.add(new Tiger());
		
		for(Animal animal : zoo){
			animal.eat();
			animal.move();
		}
		System.out.println();
		
		zoo.clear();
		zoo.add(Cosmos.getAnimal("매"));
		zoo.add(Cosmos.getAnimal("호랑이"));
		
		for(Animal animal : zoo){
			animal.eat();
			animal.move();
		}
	}
}
