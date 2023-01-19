package ch05.ex05.case17;

public class CookerMain {
	public static void main(String[] args) {
		Cooker cooker = new Cooker();
		Noodle noodle = new Noodle();
		Cucumber cucumber = new Cucumber();
		Gochujang gochujang = new Gochujang();
		
		cooker.wash(noodle);
		cooker.wash(cucumber);
		cooker.boil(noodle);
		SpicyNoodle spicyNoodle = cooker.mix(noodle, cucumber, gochujang);
		
		spicyNoodle =  cooker.cook(noodle, cucumber, gochujang); // 동일한 명령문
	}
}
