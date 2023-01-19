package ch06.ex03.case05;

public class Circle extends Point{
	private int radius;
	
	public Circle(int x, int y, int radius){
		super(x,y);
		this.radius = radius;
	}
	
	public String toString(){
		return String.format("중심점 : (%d, %d) 반지름 : %d", this.getX(), this.getY(), this.radius); 
	}
}
