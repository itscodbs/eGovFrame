package ch05.ex04.case04;

public class Sequence {
	private static int baseNum;
	private int currNum;
	
	public static void setBaseNum(int myBaseNum){
		Sequence.baseNum = myBaseNum;
	}  // static이라서 클래스.변수명
	
	public int nextNum(){
		currNum = baseNum++;
		return currNum;
	}
}
