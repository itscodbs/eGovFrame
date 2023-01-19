package seong.hongyoon.ums.domain;

import java.time.LocalDate;

public class User {
	private int userNum;
	private String userName;
	private LocalDate regDate;
	
	public User(){}
	
	public User(int userNum, String userName, LocalDate regDate){
		this.userNum = userNum;
		this.userName = userName;
		this.regDate = regDate;		
	}
	
	public int getUserNum() {
		return userNum;
	}
	public void setUserNum(int userNum) {
		this.userNum = userNum;
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
	
	@Override
	public String toString(){
		return String.format("%d %-6s %s", userNum, userName, regDate);
	}
}