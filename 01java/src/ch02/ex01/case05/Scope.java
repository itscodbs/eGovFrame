package ch02.ex01.case05;

public class Scope { 
	public static void main(String[] args){
		int i = 0; // int i = 0; -> compile error
		int j = 0;
		{   
			// int i = 0; -> compile error
			int x = 0;
			int y = 0;			
		}		
		int x = 0;
	}  // int i = 0 ; -> error x
} 
