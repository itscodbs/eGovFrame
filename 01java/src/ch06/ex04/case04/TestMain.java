package ch06.ex04.case04;

public class TestMain {
	public static void main(String[] args) {
		Tablet tablet1 = new Tablet();
		Tablet tablet2 = new Tablet();
		System.out.println(tablet1.equals(tablet2)); // Tablet 클래스 equals

		Phone phone1 = new Phone("AW-001");
		Phone phone2 = new Phone("AW-001");
		System.out.println(phone1.equals(phone2)); // phone 클래스 equals
		
		String str1 = new String("hello");
		String str2 = new String("hello");
		System.out.println(str1.equals(str2));// object 클래스 equals -> error
	}
}
