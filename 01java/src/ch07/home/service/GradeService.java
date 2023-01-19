package ch07.home.service;

import java.util.List;

import ch07.home.domain.Score;

public interface GradeService {
	void writeScore(Score score);
	
	List<Score>  getScores();
}
