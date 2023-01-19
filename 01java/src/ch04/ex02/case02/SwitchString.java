/* switch with String */
package ch04.ex02.case02;

public class SwitchString {
	public static void main(String[] args) {
		String grade = "gold";
		String coupon = "";
		
		switch(grade){
		case "gold" : coupon += "10,000원 ";
		case "silver" : coupon += "5,000원 ";
		case "copper" : coupon += "1,000원";
		}
		System.out.println(coupon + "을 지급.");
	}
}
