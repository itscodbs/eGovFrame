package ch05.ex08.case01;

public class BabyMain {
	public static void main(String[] args){
		Baby baby = new Baby();
		
		System.out.println(baby.getName());
		
		baby.setName("초롱이");
		System.out.println(baby.getName());
		
		baby = new Baby("튼튼이");
		System.out.println(baby.getName());
	}
}
