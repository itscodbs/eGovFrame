package ch07.ex03.case06;

public class TestMain {
	public static void main(String[] args) {
		Shooter shooter = new Shooter();
		Smith smith = new Smith();
		
		shooter.fire(()->System.out.println("빵야빵야"));
		shooter.fire(smith.makeGun());
	}
}
