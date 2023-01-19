package ch07.ex03.case03;

public interface Cosmos {
	public static Animal getAnimal(String aniName){
		Animal animal = null;
		
		switch(aniName){
		case "매" : animal = new Falcon();
		case "호랑이" : animal = new Tiger();
		}
		
		return animal;
	}
}
