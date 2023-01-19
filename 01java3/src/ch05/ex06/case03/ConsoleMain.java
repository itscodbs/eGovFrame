package ch05.ex06.case03;

public class ConsoleMain {
	public static void main(String[] args){
		Console.info("static 메소드를 시험합니다.");
		
		Console.inMsg("숫자를 입력하세요.");
		int num = Console.inNum();
		
		Console.inMsg("문구를 입력하세요.");
		String str = Console.inStr();
		
		System.out.printf("%d와 %s를 입력하셨습니다.", num, str);
	}	
}