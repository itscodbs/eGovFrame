package ch05.ex05.case09;

public class Arith {
	public Paper toHalf(Paper paper){
		paper.setX(paper.getX()/2); // paper에 값을 다시 저장
		return paper;
	}
}
