package ch05.ex08.case05;

public class CitrusMain {
	public static void main(String[] args){
		Citrus citrus1 = new Citrus();
		Citrus citrus2 = new Citrus(); // citrus클래스에서 귤을 지정했으므로 빈칸이어도 귤이 출력됨
		Citrus citrus3 = new Citrus("한라봉");
		
		System.out.printf("%s, %s, %s", citrus1, citrus2, citrus3);
	}
}
