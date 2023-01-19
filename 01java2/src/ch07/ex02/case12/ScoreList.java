package ch07.ex02.case12;

import java.util.ArrayList;
import java.util.List;

public class ScoreList {
	public static void main(String[] args){
		List<Integer> score1 = new ArrayList<>();
		List<Integer> score2 = new ArrayList<>();
		List<List<Integer>> score = new ArrayList<>();
		
		for(int i=0; i<3; i++) score1.add(80+i);
		for(int i=0; i<3; i++) score2.add(90+i);
		System.out.println(score1);
		System.out.println(score2);
		
		score.add(score1);
		score.add(score2);
		System.out.println(score);
	}
}
