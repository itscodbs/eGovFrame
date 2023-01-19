package ch08.ex01.case02;

public class TryCatch {
	public static void main(String[] args){
		int[] array = new int[10];
		try{
			int result = array[10];
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Exception 발생");
		}
		System.out.println("end");
	}
}
