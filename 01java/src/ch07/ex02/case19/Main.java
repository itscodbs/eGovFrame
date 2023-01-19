package ch07.ex02.case19;

public class Main {
	public static void main(String[] args) {
		C c = new C();
		
		String msg = "";
		if(c instanceof C) msg += "C";
		if(c instanceof B) msg += "B";
		if(c instanceof A) msg += "A";
		System.out.println(msg);
		
		msg = "";
		B b = new B();
		if(b instanceof C) msg += "C";
		if(b instanceof B) msg += "B";
		if(b instanceof A) msg += "A";
		System.out.println(msg);
		
		//if (b instanceof F) msg += "A"; // compile error
	}
}
