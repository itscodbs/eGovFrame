package ch07.ex01.case06;

public class TestMain {
	public static void main(String[] args) {
		Human human = new Student();
		human.sleep();
		
		Student student = (Student)human;
		student.study();
		student.sleep();
		human.sleep();
	}
}
