package ch06.ex05.case11;

public class TestMain {
	public static void main(String[] args) {
		AppleSw apple = new AppleSw();
		GoogleSw google = new GoogleSw();
		
		TeslaHw car1 = new TeslaHw(apple);
		TeslaHw car2 = new TeslaHw(google);
		
		car1.start();
		car1.stop();
		car1.klaxon();
		System.out.println();
		
		car2.start();
		car2.stop();
		car2.klaxon();
	}
}
