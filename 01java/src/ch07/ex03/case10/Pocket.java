package ch07.ex03.case10;

import java.util.List;

public class Pocket {
	public double sum(List<? extends Number> list){
		double sum = 0;
		for(Number n : list) sum += n.doubleValue();
		return sum;
	}
	
	// unbounded wildcard
	public void printList(List<?> list){
		for(Object obj : list) System.out.print(obj + " ");
		System.out.println();
	}
	
	//lower bounded wildcard
	public List<? super Integer> addList(List<? super Integer> list){
		for(int i=1; i<10; i++) list.add(i);
		return list;
	}
}
