package ch06;

import java.sql.Date;

public class User {
	private int userId;
	private String userName;
	private Date regDate;
	
	@Override
	public String toString(){
		return String.format("%d %s %s", userId, userName, regDate);
	}
}
