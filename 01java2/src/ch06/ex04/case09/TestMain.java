package ch06.ex04.case09;

public class TestMain {
	public static void main(String[] args) {
		ShinhanBank shinhan = new ShinhanBank(0.01);
		System.out.printf("이율은 %.1f%%입니다.", shinhan.getRate()*100);
	}
}
