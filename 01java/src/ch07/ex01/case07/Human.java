package ch07.ex01.case07;

public class Human {
	public void eat(Food food){ // 확장성을 위해 food 타입으로 promotion (음식자체를 먹는다로)
		System.out.println(food + "을(를) 먹다.");
	}
}
