package ch04.ex02.case01;

public class SwitchInteger {
	public static void main(String[] args) {
		int grade = 3;
		String coupon = "";
		
		switch(grade){
		case 3: coupon += "10,000원 ";
		case 2: coupon += "5,000원";
		case 1: coupon += "1,000원";
		}
		System.out.println(coupon + "을 지급.");
	}
}
