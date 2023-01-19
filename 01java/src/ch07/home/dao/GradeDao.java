package ch07.home.dao;

import java.util.List;

import ch07.home.domain.Score;

public interface GradeDao {
	void addScore(Score score); 	

	List<Score> getScores();
}


