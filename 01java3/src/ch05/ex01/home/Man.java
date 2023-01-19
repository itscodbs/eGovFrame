package ch05.ex01.home;

import java.time.LocalDate;

public class Man {
	private String name;
	private int age;
	private LocalDate regDate;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public LocalDate getRegDate() {
		return regDate;
	}
	public void setRegDate(LocalDate regDate) {
		this.regDate = LocalDate.now();
	}
}
