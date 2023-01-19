package ch05.ex04.case03;

public class Ship {
	private int passengerCnt;
	private static int totPassengerCnt;  // 하나의 여객터미널을 가지고 있다.
	
	public void sail(int passengerCnt){
		this.passengerCnt = passengerCnt;
		totPassengerCnt += passengerCnt;
	}
	
	public int getTotPassengerCnt(){
		return totPassengerCnt;
	}
}
