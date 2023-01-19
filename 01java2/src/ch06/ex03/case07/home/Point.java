package ch06.ex03.case07.home;

public class Point { // 06 리팩토링
	protected int x;
	protected int y;
	
	public Point (int x, int  y){
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
}
