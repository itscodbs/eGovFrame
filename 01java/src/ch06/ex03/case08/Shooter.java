package ch06.ex03.case08;

public class Shooter {
	private Gun gun;
	
	public Shooter(Gun gun){
		this.gun = gun;
	}
	
	public void fire(){
		this.gun.fire();
	}
}
