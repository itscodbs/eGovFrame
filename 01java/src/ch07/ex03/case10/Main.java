package ch07.ex03.case10;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Pocket pocket = new Pocket();
		List<Number> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		List<Double> list3 = new ArrayList<>();
		List<String> list4 = new ArrayList<>();
		
		pocket.sum(list1);
		pocket.sum(list2);
		pocket.sum(list3);
//		pocket.sum(list4); -> error.  super이상만 되므로

		pocket.printList(list1);
		pocket.printList(list2);
		pocket.printList(list3);
		pocket.printList(list4);
		
		pocket.addList(list1);
		pocket.addList(list2);
//		pocket.addList(list3);
//		pocket.addList(list4); -> Int는 String double과 상하관계가 아니고 형제관계이므로.
	}
}
