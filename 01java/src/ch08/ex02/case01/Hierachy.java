package ch08.ex02.case01;

public class Hierachy {
	public void first(){
		try{
			int i = 3/0;
		}catch(ArithmeticException e){
			System.out.println("first : ArithmeticExcption");
		}catch(RuntimeException e){
			System.out.println("first : RuntimeException");
		}catch(Exception e){
			System.out.println("first : Exception");
		}
	}
	
	public void second(){
		try{
			int i = 3/0;
		}catch(Exception e){
			System.out.println("second : Exception");
		}
//		catch(RuntimeException e){
//			System.out.println("second : RuntimeException");
//		}catch(ArithmeticException e){
//			System.out.println("second : ArithmeticException");
//		}
	}
	
		public static void main(String[] args){
			Hierachy hierachy = new Hierachy();
			hierachy.first();
			hierachy.second();
		}
	}

