package ch07.ex01.case09;

public class Shooter {
	private Gun gun;
	
	public void setGun(Gun gun){
		this.gun = gun;
	}
	
	public void fire(){
		this.gun.fire();
	}
}
