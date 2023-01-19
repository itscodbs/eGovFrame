package ch07.ex03.case11;

@AllAnnotation(id="like", pw="sky")
public class MyClass2 {
	@AllAnnotation(id="like",pw="sky")
	public int id;
	
	@AllAnnotation(id="like", pw="sky")
	public void process(@AllAnnotation(id="like",pw="sky")int id){}
	
}
