package ch06.ex05.case08;

public class Main {
	public static void main(String[] args) {
		int inVal = 1;

		String msg = "";
		switch(inVal){
		case 1: msg = "추가했습니다."; break;
		case 2: msg = "삭제했습니다.";
		}
		
		switch(inVal){
		case Code.USER_ADD: msg = "추가했습니다."; break;
		case Code.USER_DEL: msg = "삭제했습니다.";
		}
	}
}
