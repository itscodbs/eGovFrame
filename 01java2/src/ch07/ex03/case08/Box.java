package ch07.ex03.case08;

public class Box {
	public <T> T getLastVal(T[] list){
		return list[list.length-1];
	}
}
