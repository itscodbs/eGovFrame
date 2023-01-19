package ch07.ex02.case05.home.dao;

import ch07.ex02.case05.home.domain.Score;

public class GradeDaoImpl implements GradeDao {
	private Score[] scores;
	private int cursor;
	
	public GradeDaoImpl(Score[] scores){
		this.scores = scores;
	}
	
	@Override
	public void addScore(Score score){
		this.scores[this.cursor++] = score; 
	}
	
	@Override
	public Score[] getScores(){
		return this.scores;
	}
}
