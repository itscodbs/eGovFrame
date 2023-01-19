package seong.hongyoon.ums.domain;

import java.time.LocalDate;

public class User {
	private int userNo;
	private String userName;
	private LocalDate regDate;
	
	public User(){}
	
	public User(int userNo, String userName, LocalDate regDate){
		this.userNo = userNo;
		this.userName = userName;
		this.regDate = regDate;
	}
	
	public int getUserNo() {
		return userNo;
	}
	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public LocalDate getRegDate() {
		return regDate;
	}
	public void setRegDate(LocalDate regDate) {
		this.regDate = regDate;
	}
	
	public String toString(){
		return String.format("%d %-6s %s", userNo, userName, regDate);
	}
}
