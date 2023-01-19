package ch07.ex02.case05.home.dao;

import ch07.ex02.case05.home.domain.Score;

public interface GradeDao {
	void addScore(Score score);
	
	Score[] getScores();
}
