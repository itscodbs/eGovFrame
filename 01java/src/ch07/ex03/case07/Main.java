package ch07.ex03.case07;

public class Main {
	public static void main(String[] args) {
		Bowl<Integer> bowl1 = new Bowl<Integer>();
		Bowl<String> bowl2 = new Bowl<>();
		
		bowl1.setVal(1);
		bowl2.setVal("hello");
		
		int i = bowl1.getVal();
		String s = bowl2.getVal();
		System.out.printf("%d, %s",i,s);
	}
}
