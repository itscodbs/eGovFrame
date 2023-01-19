package ch05.ex08.case03;

import java.util.Date;

public class User {  // 180413
	private String userName;
	private int age;
	private Date regDate;
	
	public User(){} // 생성자
	
	public User(String userName, int age, Date regDate){
		this.userName = userName;
		this.age = age;
		this.regDate = regDate;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	
	public String toString(Date regDate){
		return String.format("%s %d %s", userName, age,regDate);
	}
}
