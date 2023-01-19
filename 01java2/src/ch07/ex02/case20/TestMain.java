package ch07.ex02.case20;

import java.util.ArrayList;
import java.util.List;

public class TestMain {
	public static void main(String[] args) {
		Bumblebee autobot1 = new Bumblebee();
		Prime autobot2 = new Prime();
		List<AutoBot> corps = new ArrayList<>();
		corps.add(autobot1);
		corps.add(autobot2);
		
		for(AutoBot autobot : corps){
			autobot.run();
			autobot.fight();
			if(autobot instanceof Bumblebee) ((Bumblebee)autobot).guard();
			if(autobot instanceof Prime) ((Prime)autobot).command();
		}
	}
}
