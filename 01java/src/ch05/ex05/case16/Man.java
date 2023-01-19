package ch05.ex05.case16;

public class Man { // 2
	public void strip(){}
	public void	wash(){}
	public void wear(Pajamas pajamas){}
	public void lie(){}
	
	public void sleep(Pajamas pajamas){
		this.strip();
		this.wash();
		wear(pajamas);  // this. 생략됨. 클래스 내부 함수의 첫번째 인자에는 무조건 this가 생략되어 있다.
		lie();
	}

}
