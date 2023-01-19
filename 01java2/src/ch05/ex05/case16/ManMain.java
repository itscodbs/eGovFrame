package ch05.ex05.case16;

public class ManMain {
	public static void main(String[] args) {
		Pajamas pajamas = new Pajamas();
		Man man = new Man();
		
		man.strip();
		man.wash();
		man.wear(pajamas);
		man.lie();
		
		man.sleep(pajamas);
	}
}
