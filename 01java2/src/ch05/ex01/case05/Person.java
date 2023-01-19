package ch05.ex01.case05;

public class Person {
	 String name;
	 int age;
	 
	 void setName(String myName){
		 if(myName.charAt(0)=='최')
			name = myName;
		 else name = "무명";
	 }
	 
	 void setAge(int myAge){
		 if(myAge>=20 && myAge<=29)
			 age = myAge;
		 else age = 0;
	 }
	 
	 String getName(int level){
		 String myName = "";
		 if(level>5) myName = name;
		 else myName = "비밀";
		 return myName;
	 } 
	 
	 int getAge(int level){
		 int myAge = 0;
		 if(level>5) myAge = age;
		 else myAge = 1000;
		 return myAge;
	 }
}
