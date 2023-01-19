/* If 2형식 */
package ch04.ex01.case02;

public class If {
	public static void main(String[] args) {
		int visitCnt = 0;
		
		if(visitCnt < 1) {
			System.out.println("첫방문");
			visitCnt++;
		}else{
			System.out.println("재방문");
		}
		System.out.println();
		
		if(visitCnt < 1) System.out.println("첫방문");
		else System.out.println("재방문");
	}
}
