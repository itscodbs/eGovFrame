package ch07.ex02.case11;

import java.util.ArrayList;
import java.util.List;

public class MyList {  // 180501
	public static void main(String[] args){
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(1);
		
		System.out.println(list);
		
		for(int i : list) System.out.print(i+ " ");
		System.out.println();
		
		System.out.println(list.get(0));
		System.out.println(list);
		System.out.println(list.remove(0));
		System.out.println(list);
		System.out.println(list.get(0));
		
		for(int i=0; i<list.size(); i++)
			System.out.print(list.get(i)+ " ");
	}
}
