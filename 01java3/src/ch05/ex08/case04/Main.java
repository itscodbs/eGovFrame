package ch05.ex08.case04;

public class Main {
	public static void main(String[] args){
		Apple apple = new Apple();
		Banana banana = new Banana("델몬트"); // 바나나는 기본생성자가 없어서 호출이 안됨. (); => compile error
	}
}
