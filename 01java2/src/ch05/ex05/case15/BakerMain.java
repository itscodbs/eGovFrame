package ch05.ex05.case15;

public class BakerMain {
	public static void main(String[] args) {
	 Baker baker1 = new Baker();
	 Baker baker2 = new Baker();

	 Bread bread = null;
	 bread = baker1.bake();
	 baker2.stickPrice(bread, 1000);
	 System.out.println(bread);
	}
}
