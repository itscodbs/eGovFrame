package ch10.ex02;

import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		User user1 = new User("최한석", Level.BASIC);
		User user2 = new User("한아름", Level.valueOf(2));
		User user3 = new User("양승일", Level.GOLD);
		
		List<User> users = Arrays.asList(user1, user2, user3);
		
		for(User user : users){
			try{
				user.upgradeLevel();
			}catch(IllegalStateException e){
				e.printStackTrace();
			}
		}
		for(User user:users) System.out.println(user);
	}
}
