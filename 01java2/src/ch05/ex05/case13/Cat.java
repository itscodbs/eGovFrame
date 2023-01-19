package ch05.ex05.case13;

public class Cat {
	private String name;
	
	public Cat breed(){
		return new Cat();  // 낳다라는 메소드이므로 new로 생성해줌.
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
