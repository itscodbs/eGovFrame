package ch07.ex02.home;

import java.util.ArrayList;
import java.util.List;

public class TestMain {
	public static void main(String[] args){
		Pencil stationary1 = new Pencil();
		Eraser stationary2 = new Eraser();
		List<Stationary> station = new ArrayList<>();
		station.add(stationary1);
		station.add(stationary2);
		
		for(Stationary stationary : station){
			if(stationary instanceof Pencil) ((Pencil)stationary).write();
			if(stationary instanceof Eraser) ((Eraser)stationary).erase();
			System.out.println();
		}
	}
}
//가방에 지우개와 연필을 담는다
//가방에서 꺼낸 것이 지우개이면 지우고, 연필이면 쓴다.
// put - add로 표현, pull - for 표현  