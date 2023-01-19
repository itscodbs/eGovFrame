package ch05.ex08.case03;

import java.util.Date;

public class UserMain {
	public static void main(String[] args) {
		User user1 = new User("최한석", 25, new Date());
		User user2 = new User("양승일", 37, new Date());
		
		User user3 = new  User();
		user3.setUserName("한아름");
		user3.setAge(46);
		user3.setRegDate(new Date());
		
		System.out.printf("%s\n%s\n%s", user1, user2, user3);
	}
}
