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
	}
	
	public Init(){
		i = 1; s= 1;
		System.out.println("Constructor()");
	}
	
	public Init(String s){
		System.out.println("Constructor(" + s + ")");
	}
}
//instance 초기화블럭이 생성자 블럭보다 먼저 실행됨. 
//초기화블럭(new할 때마다 실행)과 생성자블럭(new 만든것만 실행)의 (공통점) : new 할 때마다 실행(객체생성 후 실행), 
//(차이점) : 실행횟수, parameter 유무 , 그래서 parameter가 없으면 overloading도 안됨. 생성자 블럭은 new에서 로직을 고를 수 있음.
//instance 초기화블럭에서 i 변수는 . static 변수는 static {} 안에서만 사용이 가능하다.
//static{} 바이트코드 생성 후 로딩될 때 한번만 실행됨.배타적