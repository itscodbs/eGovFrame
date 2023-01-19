package ch05.ex03.home;

public class Student2Main {
	public static void main(String[] args){
		Student2 student1 = new Student2();
		Student2 student2 = new Student2();
		
		student1.setName("최한석"); student1.setAge(20);
		student2.setName("한아름"); student2.setAge(30);

		student1.wakeUP();
		student1.washFace();
		
		student2.study();
	}
}
