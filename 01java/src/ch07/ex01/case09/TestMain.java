package ch07.ex01.case09;

public class TestMain { //180425
	public static void main(String[] args) {
		Pistol pistol = new Pistol();
		Rifle rifle = new Rifle();
		Shooter shooter = new Shooter();
		
		shooter.setGun(pistol);
		shooter.fire();
		shooter.setGun(rifle);
		shooter.fire();
	}
}
