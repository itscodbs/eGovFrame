package ch05.ex05.case10;

public class Arith {
	public int add(int a, int b){
		return a+b;
	}
	
	public Paper add(Paper paper){
		paper.setSum(paper.getX() + paper.getY());
		return paper;
	}
}
