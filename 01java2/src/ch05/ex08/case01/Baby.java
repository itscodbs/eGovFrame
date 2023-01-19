package ch05.ex08.case01;

public class Baby {
	private String name;
	
	public Baby(){} // 태어난 이후로 이름이 지어진 경우
	
	public Baby(String name){
		this.name = name;
	}  // 태어나자마자 이름이 있는 경우

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
