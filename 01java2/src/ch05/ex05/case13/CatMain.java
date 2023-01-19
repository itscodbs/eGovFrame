package ch05.ex05.case13;

public class CatMain {
	public static void main(String[] args) {
		Cat mommy = new Cat();
		mommy.setName("늠름이");
		
		Cat baby = mommy.breed(); // mommy객체에서 새로 생성하는 것이므로 new를 리턴하는 breed메소드 호출
		baby.setName("이쁜이");
		
		System.out.printf("mommy : %s\n baby : %s", mommy.getName(), baby.getName());
	}
}