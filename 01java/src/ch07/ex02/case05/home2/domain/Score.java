package ch07.ex02.case05.home2.domain;

public class Score {
	private int kor;
	private int eng;
	private int math;
	
	private int sum;
	private int avg;
	
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public int getAvg() {
		return avg;
	}
	public void setAvg(int avg) {
		this.avg = avg;
	}
	
	public String toString(){
		return kor + " " + eng + " " + math + " " + sum + " " + avg;
	}

	
}
