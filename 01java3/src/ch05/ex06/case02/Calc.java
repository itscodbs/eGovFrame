package ch05.ex06.case02;

public class Calc {
	private static int x;
	private int y;
	
	public static void init1(){
		x=1;
	} // static 변수만 사용 가능 . y 입력하면 에러
	
	public void init2(){
		x=1;
		y=2;
		
	}
}
