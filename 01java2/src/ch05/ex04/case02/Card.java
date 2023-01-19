package ch05.ex04.case02;

public class Card {
	private String kind;
	private int number;
	private static int width;
	private static int height;
	
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
