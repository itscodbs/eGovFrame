package ch05.ex01.case04;

public class Person { // 180418
	String name;
	int age;
	
	void serName(String myName){
		name = myName;
	}
	
	void setAge(int myAge){
		age = myAge;
	}
	
	String getName(){
		return name;
	}
	
	int getAge(){
		return age;
	}
}
