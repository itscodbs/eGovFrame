package ch05.ex05.case13;

public class CatMain {
	public static void main(String[] args) {
		Cat mommy = new Cat();
		mommy.setName("늠름이");
		
		Cat baby = mommy.breed();
		baby.setName("이쁜이");
		
		System.out.printf("mommy : %s\nbaby : %s", mommy.getName(), baby.getName());
	}
}
