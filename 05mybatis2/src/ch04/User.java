package ch04;

import java.sql.Date;
import java.util.List;

public class User {
	private int userId;
	private String userName;
	private Date regDate;
	private List<Post> posts;
	
	@Override
	public String toString(){
		return String.format("%d %s %s %s", userId, userName, regDate, posts);
	}
}
