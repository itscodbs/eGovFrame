package ch07.ex02.case08;

public class Main {
	public static void main(String[] args) {
		Animal[] animals = new Animal[3];
		animals[0] = new Cat();
		animals[1] = new Cat();
		animals[2] = new Eagle();
		
		for(Animal animal:animals){
			animal.eat();
			System.out.println();
		}
	}
}// move() 를 이용하려면 Cat이나 Eagle로 캐스팅해야함
