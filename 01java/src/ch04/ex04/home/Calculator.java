package ch04.ex04.home;

import java.util.Scanner;

public class Calculator { 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n1=0, n2=0, result=0;
		char op=0, cont=0;

		do{
			System.out.print("숫자1 : ");       n1 = sc.nextInt(); sc.nextLine();
			System.out.print("(+,-,*,/) : ");  op = sc.nextLine().charAt(0);
			System.out.print("숫자2 : ");       n2 = sc.nextInt(); sc.nextLine();
			                                  // switch(op){
			if(op=='+')      result = n1+n2;  // case '+' : result = n1+n2;
			else if(op=='-') result = n1-n2;  // case '-' : result = n1-n2;
			else if(op=='*') result = n1*n2;  // case '*' : result = n1*n2;
			else if(op=='/') result = n1/n2;  // case '/' : result = n1/n2;			

			System.out.printf("%d %c %d = %d\n", n1, op, n2, result);
			System.out.println("continue? y or n"); cont = sc.nextLine().charAt(0);
		}while(cont=='y');

		System.out.println("끝");

		sc.close();
	}
}
