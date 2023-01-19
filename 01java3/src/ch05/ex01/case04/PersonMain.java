package ch05.ex01.case04;

public class PersonMain {
	public static void main(String[] args) {
		Person person = new Person();
		person.serName("최한석");
		person.setAge(25);
		
		System.out.printf("이름 : %s, 나이 : %d", person.getName(), person.getAge());
	}
}
