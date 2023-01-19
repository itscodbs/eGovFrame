package ch05.ex05.case15;

public class BakerMain {
	public static void main(String[] args) {
		Baker baker1 = new Baker();
		Baker baker2 = new Baker();
		
		Bread bread = null;
		bread = baker1.bake(); // 빵을 만들어서
		baker2.stickPrice(bread, 1000);	// 2번째 제빵사에게 넘기면 가격 붙임 (주소값, 리터럴)
		System.out.println(bread);
	}
}
