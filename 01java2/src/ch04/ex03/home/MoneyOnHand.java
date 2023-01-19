/* 3만원짜리 물건을 사려한다. 지갑에서 지폐를 한장씩 꺼내서 손에 쥐어라. 5만원권 지폐는 없다고 가정한다.*/
package ch04.ex03.home;

public class MoneyOnHand {
	public static void main(String[] args){
		
		int price = 30000;
		int hand = 0;
		int money = 0;

		while(price>hand){
			money = (int)((Math.random()*10)+1)*1000;
			System.out.printf("%d원을 꺼냈습니다.\n", money);
			hand += money;
		}		
		System.out.printf("손에 %d원을 쥐었습니다.", hand);
	}
}
