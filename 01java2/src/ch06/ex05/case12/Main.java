package ch06.ex05.case12;

public class Main {
	public static void main(String[] args){
		BusCard card = new BusCard(){ // BusCard의 interface 타입 갖게됨.
			public void tagOn(){      // 무명클래스이므로 몸체에서 바로 override
				System.out.println("태그 ON");
			}
			
			public void tagOff(){
				System.out.println("태그 OFF");
			}
		};
		
		card.tagOn();
		card.tagOff();
	}
}  // 메소드는 일회용이 됨. 
