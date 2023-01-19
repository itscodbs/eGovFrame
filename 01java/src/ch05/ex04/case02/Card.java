package ch05.ex04.case02;

public class Card {
	public String kind;
	public int number;
	public static int width = 10;
	public static int height = 20;
	
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public static int getWidth() {
		return width;
	}
	public static void setWidth(int width) {
		Card.width = width;
	}
	public static int getHeight() {
		return height;
	}
	public static void setHeight(int height) {
		Card.height = height;
	}
}
