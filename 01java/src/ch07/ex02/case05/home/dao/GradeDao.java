package ch07.ex02.case05.home.dao;

import ch07.ex02.case05.home.domain.Score;

public interface GradeDao {
	// 학생  1명의 국, 영, 수 점수를 입력하다.
	void addScore (Score score); 
	
	// 점수표를 읽는다.
	Score[] getScores(); //
}
