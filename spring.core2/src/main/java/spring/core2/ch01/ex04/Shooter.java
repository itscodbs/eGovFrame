package spring.core2.ch01.ex04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("gunman")
public class Shooter {
	@Autowired private Gun pistol;
	@Autowired private Gun rifle;
	
	public void fire(){
		pistol.fire();
		rifle.fire();
	}
}
