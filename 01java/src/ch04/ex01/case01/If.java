/* If 1형식 */
package ch04.ex01.case01;

public class If {
	public static void main(String[] args) {
		int visitCnt = 0;
		
		if(visitCnt < 1){
			System.out.println("첫방문");
			visitCnt++;
		}
		if(visitCnt < 1) System.out.println("첫방문"); // {}생략가능
	}
}
