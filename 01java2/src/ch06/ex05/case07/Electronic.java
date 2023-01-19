package ch06.ex05.case07;

import java.time.LocalDate;

public interface Electronic {
	public static final int VOLTAGE = 200;
	static final String maker = "LG";
	final int weight = 10;
	LocalDate manufactureDate = LocalDate.now();
	
	public abstract void displayMsg();
	abstract int getTemperature();
	String getModelName();
}
