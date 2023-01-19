package ch05.ex04.case04;

public class Sequence {
	private static int baseNum;
	private int currNum;
	
	public static void setBaseNum(int myBaseNum){
		Sequence.baseNum = myBaseNum;
	}
	
	public int nextNum(){
		currNum = baseNum++;
		return currNum;
	}
}
