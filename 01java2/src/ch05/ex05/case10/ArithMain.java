package ch05.ex05.case10;

public class ArithMain {
	public static void main(String[] args){
		Arith arith = new Arith();
		int sum = arith.add(1,2);
		System.out.println(sum);
		
		Paper paper = new Paper();
		paper.setX(1);
		paper.setY(2);
		paper = arith.add(paper);
		System.out.println(paper.getSum());
	}
}
