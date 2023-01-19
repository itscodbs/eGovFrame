package ch05.ex05.case17;

public class Cooker {
	public void wash(Noodle noodle){}
	public void wash(Cucumber cucumber){}
	public void boil(Noodle noodle){}
	public SpicyNoodle mix(Noodle noodle, Cucumber cucumber, Gochujang gochujang){
		return new SpicyNoodle();
	}
	
	public SpicyNoodle cool(Noodle noodle, Cucumber cucumber, Gochujang gochujang){
		this.wash(noodle);
		this.wash(cucumber);
		this.boil(noodle);
		return this.mix(noodle, cucumber, gochujang);
	}  // 위의 메소드들을 한번에 묶음
}
