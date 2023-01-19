package ch07.home.io;

import java.util.List;

import ch07.home.domain.Score;
import ch07.home.service.GradeService;

public class GradeIo {
	private GradeService gradeService;

	public GradeIo(GradeService gradeService){
		this.gradeService = gradeService;
	}

	public void play(){
		Console.info("학생별 점수 입력을 시작합니다.");

		Score score = null;
		int num = 0;
		do{
			Console.info((++num) + "번째 학생입니다.");

			score = new Score();
			score.setKor(Console.inNum("국어 점수를 입력하세요."));
			score.setEng(Console.inNum("영어 점수를 입력하세요."));
			score.setMath(Console.inNum("수학 점수를 입력하세요."));

			gradeService.writeScore(score);
		}while(Console.inChar("계속 입력하시겠습니까?(y/n)")=='y');

		Console.info("점수 입력이 끝났습니다.");
		this.printScores();
	}

	private void printScores(){
		List<Score> scores = gradeService.getScores();

		Console.info("");
		Console.info(" 국어 영어 수학  합계 평균");
		Console.info("--------------------");
		for(Score score : scores)Console.info(score);
		Console.info("--------------------");
		Console.info("");
	}
}
