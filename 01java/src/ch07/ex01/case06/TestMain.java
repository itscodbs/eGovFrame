package ch07.ex01.case06;

public class TestMain {
	public static void main(String[] args) {
		Human human = new Student();        // human 타입으로 promotion 
		human.sleep();
		
		Student student = (Student) human;  // student 타입으로 바꾸면 공부 가능
		student.study();
		student.sleep();
		human.sleep();
	}
}
