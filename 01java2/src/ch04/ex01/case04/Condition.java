package ch04.ex01.case04;

public class Condition {
	public static void main(String[] args) {
		int a = 3;
		if(0<a && a<4) System.out.println("1~3");
		
		char c = 'b';
		if('a'<c && c<'e') System.out.println("b~d");
		
		int x = 0;
		int y = 0;
		if((x=1+2)>0 || (y=1-2)>0)
			System.out.printf("x : %d, y : %d\n", x, y);
		
		String s = "he";
		if(s.equals("he") || s.equals("HE"))
			System.out.println("he");
		
		if(s != null && !s.equals(""))
			System.out.println("문자열 있음");
		
		boolean flag = false;
		if(!flag){
			System.out.println("전원을 켭니다.");
		}
	}
}
