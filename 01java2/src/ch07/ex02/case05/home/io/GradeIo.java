package ch07.ex02.case05.home.io;

import ch07.ex02.case05.home.domain.Score;
import ch07.ex02.case05.home.service.GradeService;

public class GradeIo {
	private GradeService gradeService;
	
	public GradeIo(GradeService gradeService){
		this.gradeService = gradeService;
	}
	
	public void play(int studentCnt){
		Console.info("학생별 점수 입력을 시작합니다.");
		
		Score score = null;
		for(int i=0; i<studentCnt; i++){
			Console.info((i+1)+"번째 학생입니다.");
			
			score = new Score();
			score.setKor(Console.inNum("국어 점수를 입력하세요."));
			score.setEng(Console.inNum("영어 점수를 입력하세요."));
			score.setMath(Console.inNum("수학 점수를 입력하세요."));
			
			gradeService.writeScore(score);
		}
		
		Console.info("점수 입력이 끝났습니다.");
		this.printScores();
	}
	
	private void printScores(){
		Score[] scores = gradeService.listScores();
		
		Console.info("");
		Console.info(" 국어 영어 수학 합계 평균 ");
		Console.info("=====================");
		int num = 0;
		for(Score score : scores){
			Console.outNum(++num);
			Console.info(score);
		}
		Console.info("=====================");
		Console.info("");
	}
}
