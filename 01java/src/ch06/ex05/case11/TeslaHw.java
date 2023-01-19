package ch06.ex05.case11;

public class TeslaHw implements SmartCar{
	private SmartCar software;
	
	public TeslaHw(SmartCar software){
		this.software = software;
	}
	
	@Override
	public void start(){
		software.start();
	}
	
	@Override
	public void stop(){
		software.stop();
	}
	
	@Override
	public void klaxon(){
		software.klaxon();
	}
}
