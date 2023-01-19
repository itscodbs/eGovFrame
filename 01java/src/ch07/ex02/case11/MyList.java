package ch07.ex02.case11;

import java.util.ArrayList;
import java.util.List;

public class MyList { //180426
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(1);
		
		System.out.println(list); // [1, 2, 3, 1]
		
		for(int i : list) System.out.print(i + " "); // 1 2 3 1
		System.out.println();
		
		System.out.println(list.get(0)); // 1
		System.out.println(list); // [1, 2, 3, 1]
		System.out.println(list.remove(0)); // 1
		System.out.println(list); // [2, 3, 1]
		System.out.println(list.get(0)); // 2
		
		for(int i=0; i<list.size(); i++)
			System.out.print(list.get(i) + " "); // 2 3 1 
	}
}
