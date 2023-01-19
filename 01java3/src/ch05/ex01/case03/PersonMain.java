package ch05.ex01.case03;

public class PersonMain {
	public static void main(String[] args) {
		Person person = new Person();
		person.name = "최한석";
		person.age = 25;
		
		System.out.printf("이름 : %s, 나이 : %d", person.name, person.age);
	}
}
