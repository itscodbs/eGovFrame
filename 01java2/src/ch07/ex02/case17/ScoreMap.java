package ch07.ex02.case17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ScoreMap {
	public static void main(String[] args) {
		Map<String,List<Integer>> map = new HashMap<>();
		
		String[] names = {"최한석", "한아름", "양승일", "김가람"};
		List<Integer> score = null;
		
		int index = 0;
		for(int i=9; i>5; i--){
			score = new ArrayList<Integer>();
			for(int j=0; j<3; j++) score.add(i*10+j);
			map.put(names[index++],	score);
		}
		Set<String> keys = map.keySet();
		for(String key : keys)
			System.out.println(key + " : " + map.get(key));
	}
}
