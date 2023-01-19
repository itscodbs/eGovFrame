package ch07.ex02.case05.home.service;

import ch07.ex02.case05.home.dao.GradeDao;
import ch07.ex02.case05.home.domain.Score;

public class GradeServiceImpl implements GradeService{
	private GradeDao gradeDao;

	public GradeServiceImpl(GradeDao gradeDao){
		this.gradeDao = gradeDao;
	}

	@Override
	public void writeScore(Score score){
		this.gradeDao.addScore(score);
	}
	
	@Override
	public Score[] listScores(){
		Score[] scores = this.gradeDao.getScores();
		
		int sum = 0;
		int avg = 0;
		for(Score score : scores){
			sum = score.getKor() + score.getEng() + score.getMath();
			avg = sum/3;
			score.setSum(sum);
			score.setAvg(avg);
		}
		return scores;
	}
}
