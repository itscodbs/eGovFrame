package ch02.ex01.home.case01;

public class Replace { 
	public static void main(String[] args) {
		int a = 5;
		int b = 10;
        System.out.printf("a : %d, b : %d\n",  a, b);
        
        int c = a;
        a = b;    
        b = c;
        System.out.printf("a : %d, b : %d",  a, b);
	}  
}  
