package ch04.ex01.cas01;

public class If { //반복강의 (180406)
	public static void main(String[] args) {
		int visitCnt = 0;
		
		if(visitCnt < 1){
			System.out.println("첫방문");
			visitCnt++;
		}
		if(visitCnt < 1) System.out.println("첫방문");
	}
}
