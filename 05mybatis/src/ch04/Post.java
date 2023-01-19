package ch04;

public class Post {
	private String title;
	private String content;
	
	public String toString(){
		return String.format("%s : %s", title, content);
	}
}
