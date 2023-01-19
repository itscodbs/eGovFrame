package ch05.ex05.case15;

public class Baker {
	public Bread bake(){  // 빵 생성하는 메소드
		return new Bread();
	}
	
	public void stickPrice(Bread bread, int price){ // 빵 가격표를 붙이는 메소드. 빵(주소값)과 가격(리터럴) 필요.
		bread.setPrice(price);
	}
 }
