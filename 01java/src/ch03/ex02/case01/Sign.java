/* +(-)연산자 */
package ch03.ex02.case01;

public class Sign {
	public static void main(String[] args) {
		int i = -10;
		i = +i;
		System.out.println(i);
		i = -10;
		i = -i;
		System.out.println(i);
	}
}
