package ch06.ex05.case10;

public class Main {
	public static void main(String[] args) {
		Console console = new Console();
		Browser browser = new Browser();
		
		console.display();
		browser.display();
		
		UI.input();
	}
}
