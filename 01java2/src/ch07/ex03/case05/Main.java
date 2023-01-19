package ch07.ex03.case05;

public class Main {
	public static void main(String[] args) {
		Com com = (a,b)-> {
			int result = a+b;
			return result;
		};
		
		int result = com.calc(1, 2);
		System.out.println(result);
	}
}
