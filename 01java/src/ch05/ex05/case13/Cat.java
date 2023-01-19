package ch05.ex05.case13;

public class Cat {  //180412
	private String name;
	
	public Cat breed(){
		return new Cat();  // 새롭게 생성된다는 메소드
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
