package ch05.ex05.case08;

public class ArithMain {
	public static void main(String[] args){
		Paper paper = new Paper();
		Arith arith = new Arith();
		
		paper.setX(10);
		arith.toHalf(paper);
		System.out.println(paper.getX());
	}
}
