package ch05.ex05.case09;

public class ArithMain {
	public static void main(String[] args){
		Paper paper = new Paper();
		Arith arith = new Arith();
		
		paper.setX(10);
		paper = arith.toHalf(paper);
		System.out.println(paper.getX());
	}
}
