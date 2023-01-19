package ch05.ex07.case01;

public class StackMain {
	public static void main(String[] args){
		System.out.println("main() 시작.");
		Stack stack = new Stack();
		
		try{ Thread.sleep(1000); }catch(Exception e){}
		stack.first();
		try{ Thread.sleep(1000); }catch(Exception e){}
		
		System.out.println("main() 종료.");
	}
}
