package ch05.ex08.case02;

public class CarMain {
	public static void main(String[] args){
		Car car = new Car();
		car.setColor("파란");
		car.setDoor(4);
		System.out.println(car);
		
		car = new Car("빨간", 2);
		System.out.println(car);
	}
}
