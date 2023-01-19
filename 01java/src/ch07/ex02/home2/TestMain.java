package ch07.ex02.home2;

import java.util.ArrayList;
import java.util.List;

public class TestMain {
	public static void main(String[] args) {
		List<Stationary> bag = new ArrayList<>();
		bag.add(new Eraser());
		bag.add(new Pencil());
		
		for(Stationary stationary : bag){
			if(stationary instanceof Eraser) ((Eraser) stationary).erase();
			if(stationary instanceof Pencil) ((Pencil) stationary).write();
		}
	}
}
