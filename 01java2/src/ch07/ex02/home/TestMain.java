package ch07.ex02.home;

import java.util.ArrayList;
import java.util.List;

public class TestMain {
	public static void main(String[] args){ 
		Pencil bag1 = new Pencil();
		Eraser bag2 = new Eraser();
		List<Stationary> bags = new ArrayList<>();
		bags.add(bag1);
		bags.add(bag2);
		
		for(Stationary stationary : bags){
			if(stationary instanceof Pencil) ((Pencil)stationary).write();
			if(stationary instanceof Eraser) ((Eraser)stationary).erase();
			System.out.println();
		}
	}
}
