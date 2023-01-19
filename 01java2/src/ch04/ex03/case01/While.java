package ch04.ex03.case01;

public class While {
	public static void main(String[] args) {
		int weight = 88;
		int jumpCnt = 0;
		while(weight>45){
			jumpCnt++;
			weight--;
		}
		System.out.printf("줄넘기 %d번으로, 몸무게 %dkg 달성.", jumpCnt, weight);
	}
}
