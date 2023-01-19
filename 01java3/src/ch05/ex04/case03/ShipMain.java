package ch05.ex04.case03;

public class ShipMain {
	public static void main(String[] args) {
		Ship ship1 = new Ship();
		Ship ship2 = new Ship();
		Ship ship3 = new Ship();
		
		ship1.sail(100);
		ship2.sail(200);
		ship3.sail(300);
		
		System.out.printf("여객선 터미널 이용객수는 %d명입니다.\n", ship1.getTotPassengerCnt());
		System.out.printf("여객선 터미널 이용객수는 %d명입니다.\n", ship2.getTotPassengerCnt());
	}
}
