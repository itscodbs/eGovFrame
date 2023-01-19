package ch03.ex08;

public class Logical {
	public static void main(String[] args) {
		System.out.println(2>1 && 2>1);
		System.out.println(2<1 && 2>1);
		System.out.println(2<1 || 2>1);
		System.out.println();
		
		int a = 0, b = 0;
		System.out.println(++a<0 && ++b<0);
		System.out.printf("a : %d, b : %d\n", a, b);
		
		a=b=0;
		System.out.println(++a>0 || ++b<0);
		System.out.printf("a : %d, b : %d", a, b);
	}
}
