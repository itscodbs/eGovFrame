package ch06.ex05.case11;

public class AppleSw implements SmartCar{
	@Override
	public void start(){
		System.out.println("Apple 방식으로 출발하다.");
	}
	
	@Override
	public void stop(){
		System.out.println("Apple 방식으로 멈추다.");
	}
	
	@Override
	public void klaxon(){
		System.out.println("Apple 방식으로 경적을 울리다.");
	}
}
