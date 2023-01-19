package ch07.ex03.case08;

public class Main {
	public static void main(String[] args) {
		Box box = new Box();
		Integer[] list1 = {1,2,3};
		String[] list2 = {"a", "b", "c"};
		
		int i = box.getLastVal(list1);
		String s = box.getLastVal(list2);
		System.out.printf("%d, %s", i,s);
	}
}