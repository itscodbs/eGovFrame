package ch05.ex09.case01;

public class Init {
	private static int s;
	private int i;
	
	static{
		s = 1;
		System.out.println("static{}");
	}
	
	{
		i = 1; s = 1;
		System.out.println("{}");
	}  // 초기화는 항상 실행됨
	
	public Init(){
		i = 1; s = 1;
		System.out.println("Constructor()");
	}
	
	public Init(String s){
		System.out.println("Constructor(" + s + ")");
	}
}
