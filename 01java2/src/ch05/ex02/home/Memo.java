package ch05.ex02.home;

public class Memo {  //180416
	private String msg;
	private String from;

	public String getMessage(){
		return msg + " from " + from;
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
