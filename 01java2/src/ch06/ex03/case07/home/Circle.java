package ch06.ex03.case07.home;

public class Circle {
	private Point point;
	private int radius;
	
	public Circle(int x, int y, int radius){
		this.point = new Point(x,y);
		this.radius = radius;
	}
	
	public String toString(){
		return String.format("중심점 : (%d, %d) 반지름 : %d", point.getX(), point.getY(), radius);
	}
}
