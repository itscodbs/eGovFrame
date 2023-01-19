package ch05.ex05.case14;

public class BakerMain {
	public static void main(String[] args) {
		Baker baker = new Baker();
		Bread bread = baker.bake(); // 빵 클래스 타입을 new메소드를 리턴하는 baker클래스의 bake()메소드로 호출해서 생성
	}
}
