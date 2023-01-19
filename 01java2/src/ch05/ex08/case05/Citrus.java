package ch05.ex08.case05;

public class Citrus {
	private String name;

	public Citrus(){
		this("귤");
	} // this(); -> 클래스내의 다른 생성자 parameter가 호출됨. (String name) this.name으로 값 저장

	public Citrus(String name){
		this.name = name;
	}

	public String toString(){
		return name;
	}
}