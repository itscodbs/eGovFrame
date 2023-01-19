package ch05.ex05.case15;

public class Baker {
	public Bread bake(){
		return new Bread();
	}
	
	public void stickPrice(Bread bread, int price){
		bread.setPrice(price);
	}
}
