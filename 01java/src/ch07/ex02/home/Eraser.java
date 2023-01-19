package ch07.ex02.home;

public class Eraser implements Stationary{
	@Override
	public void put(){
		System.out.println("지우개를 가방에 담다.");
	}
	
	@Override
	public void pull(){
		System.out.println("지우개를 가방에서 꺼내다.");
	}
	
	public void erase(){
		System.out.println("지우개로 글을 지우다.");
	}
}
