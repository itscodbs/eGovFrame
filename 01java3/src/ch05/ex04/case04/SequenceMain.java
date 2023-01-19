package ch05.ex04.case04;

public class SequenceMain {
	public static void main(String[] args){
		Sequence seq1 = new Sequence();
		Sequence seq2 = new Sequence();
	
		Sequence.setBaseNum(3);
		System.out.printf("seq1 : %d\n", seq1.nextNum());
		System.out.printf("seq2 : %d\n", seq2.nextNum());
		System.out.printf("seq2 : %d\n\n", seq2.nextNum());
	
		Sequence.setBaseNum(31);
		System.out.printf("seq1 : %d\n", seq1.nextNum());
		System.out.printf("seq2 : %d\n", seq2.nextNum());
		System.out.printf("seq1 : %d\n", seq1.nextNum());
	}
}
