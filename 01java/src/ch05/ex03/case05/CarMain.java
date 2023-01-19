package ch05.ex03.case05;

public class CarMain {
	public static void main(String[] args){
		Car car1 = new Car();
		Car car2 = new Car();
		
		car1.setPrice(2000);
		car1.setMakerName("테슬라");
		car2.setPrice(5000);
		car2.setMakerName("현대");
		
		car1.starkUp();
		car2.starkUp();
	}
}
