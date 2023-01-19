package ch05.ex02.home3;

import java.util.Scanner;

public class Memo {
	private String msg;
	private String from;	
	
	Scanner sc = new Scanner(System.in);
	
	public String writeMsg(String msg){
		return this.msg = sc.nextLine();
	}
	public String writeFrom(String from){
		return this.from = sc.nextLine();
	}
	
	public String getMessage(String msg, String from){
		return "[메시지내용]" + msg + "from" + from;
	}
	
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}	
}
