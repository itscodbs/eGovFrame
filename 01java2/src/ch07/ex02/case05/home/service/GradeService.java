package ch07.ex02.case05.home.service;

import ch07.ex02.case05.home.domain.Score;

public interface GradeService {
	void writeScore(Score score);
	
	Score[] listScores();
}
