package ch07.ex03.case02;

public class Alien extends Life{
	// @Override -> compile error. 이름이 같은 별도의 메소드이므로
	public static void eat(){ 
		System.out.println("Alien 먹다.");
	}
	
	@Override
	public void shout(){
		System.out.println("Alien 소리치다.");
	}
	
	public static void main(String[] args){
		Life alien1 = new Life();
		Alien alien2 = new Alien();
		
		alien1.eat();
		Life.eat();
		alien1.shout();
		System.out.println();
		
		alien2.eat();
		Alien.eat();
		alien2.shout();
	}
}
