package ch05.ex05.case19;

public class ManMain {
	public static void main(String[] args) {
		Man man = new Man();
		man.eat(new Banana());
		man.eat(new Grape());
	}
}		// Banana banana = new Banana();
	    // man.eat(banana);
        // ==> man.eat(new Banana());
