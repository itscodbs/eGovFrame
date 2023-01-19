package ch06.ex05.case06;

public class Fridge implements Appliance, Electronic{
	@Override public void on(){}
	@Override public void off(){}
	
	@Override public void displayMsg(){}
	@Override public int getTemperature(){return 0;}
	@Override public String getModelName(){return "";}
}
