package ch07.ex01.case05;

public class Main {
	public static void main(String[] args){
		Car car = new FireEngine(); // 값을 담을 때는 Car타입, 관점에서 저장
		car.drive();                //car.water();는 호출안됨 -> Car 타입으로 생성했으므로
		
		FireEngine fireEngine = ((FireEngine)car);
		fireEngine.water();
		fireEngine.drive();
		
		((Car)fireEngine).drive();  // 불 다 끄고 돌아갈 때 Car타입으로 다시 변환.
	}
}