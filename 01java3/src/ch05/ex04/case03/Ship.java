package ch05.ex04.case03;

public class Ship {
	private int passengerCnt;
	private static int totPassengerCnt;
	
	public void sail(int passengerCnt){
		this.passengerCnt = passengerCnt;
		totPassengerCnt += passengerCnt;
	}
	
	public int getTotPassengerCnt(){
		return totPassengerCnt;
	}
}
