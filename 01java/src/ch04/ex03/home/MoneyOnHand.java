package ch04.ex03.home;

public class MoneyOnHand {
	public static void main(String[] args) {
		int money = 30000;
		int hand = 0;
		int tmp = 0;
		
		while(hand<money){
			tmp = ((int)(Math.random()*10)+1)*1000;
			System.out.println(tmp + "원을 꺼냈습니다." );
			hand += tmp;
		}
		System.out.printf("손에 %d원을 쥐었습니다.", hand);
	}
}
