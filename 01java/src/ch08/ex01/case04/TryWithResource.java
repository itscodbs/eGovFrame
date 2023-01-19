package ch08.ex01.case04;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TryWithResource {
	public static void main(String[] args){
		int[] list = {1,2,3};
		try(PrintWriter out = new PrintWriter(new FileWriter("c:/DEV/ch08. ex01.case04.1.txt"));
			PrintWriter out2 = new PrintWriter(new FileWriter("c:/DEV/ch08.ex01.case4.2.txt"))){
			for(int i=0; i<list.length; i++){
			out.println("list[" + i + "] : " + list[i]);
			out2.println("list[" + i + "] :" + list[i]);
		}
		}catch(ArrayIndexOutOfBoundsException e){
			System.err.println("배열 Exception");
		}catch(IOException e){ 
			System.err.println("파일 Exception"); 
		}
		System.out.println("End");
	}
}
	