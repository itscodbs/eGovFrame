/* 몸무게가 60kg이 될 때까지 줄넘기하라. */
package ch04.ex03.case01;

public class While { //180404
	public static void main(String[] args) {
		int weight = 88;
		int jumpCnt = 0;
		while (weight>60){
			jumpCnt++;
			weight--;
		}
		System.out.printf("줄넘기 %d번으로, 몸무게 %dkg 달성.", jumpCnt, weight);
	}
}
