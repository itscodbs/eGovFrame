package ch05.ex05.case16;

public class Man {
	public void strip(){}
	public void wash(){}
	public void wear(Pajamas pajamas){}
	public void lie(){}
	
	public void sleep(Pajamas pajamas){
		this.strip();
		this.wash();
		wear(pajamas);
		lie();
	}
}
