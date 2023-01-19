package ch07.ex01.case08;

public class Clerk {
	public Flower sell(String flowerName){ // 다형성을 위해 Flower 타입으로 선언. String 타입으로 선언
		Flower flower = null;
		switch(flowerName){
		case "백합" : flower = new Lily(); break;
		case "장미" : flower = new Rose();
		}
		return flower;
	}
}
