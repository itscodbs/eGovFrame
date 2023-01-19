package ch05.ex03.case04;

public class CatMain {
	public static void main(String[] args){
		Cat cat1 = new Cat();
		Cat cat2 = new Cat();
		cat1.setColor("화이트");
		cat2.setColor("블랙");
		
		cat1.eat();
		cat2.sleep();
	}
}
