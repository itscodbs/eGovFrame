package ch07.ex02.home;

public class Pencil implements Stationary{
	@Override
	public void put(){
		System.out.println("연필을 가방에 담다.");
	}
	
	@Override
	public void pull(){
		System.out.println("연필을 가방에서 꺼내다.");
	}
	
	public void write(){
		System.out.println("연필로 글을 쓰다.");
	}
}

