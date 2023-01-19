package ch07.ex02.case14;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Dog> dogs1 = new ArrayList<>();
		List<Dog> dogs2 = new ArrayList<>();
		List<List<Dog>> dogList = new ArrayList<>();
		
		for(int i=0; i<3; i++) dogs1.add(new Dog("개" + i));
		for(int i=0; i<3; i++) dogs2.add(new Dog("강아지" + i));
		System.out.println(dogs1);
		System.out.println(dogs2);
		
		dogList.add(dogs1);
		dogList.add(dogs2);
		System.out.println(dogList);
		
		for(List<Dog> dogs:dogList)
			for(Dog dog:dogs) dog.eat();		
	}
}
