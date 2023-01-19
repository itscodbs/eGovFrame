package ch03;

import java.sql.Date;

public class User {
	private int userId;
	private String userName;
	private Date regDate;
	private Address address;
	
	@Override
	public String toString(){
		return String.format("%d %s %s %s", userId, userName, regDate, address);
	}
}
