package ch07.ex02.case05.home2;

import ch07.ex02.case05.home.dao.GradeDao;
import ch07.ex02.case05.home.dao.GradeDaoImpl;
import ch07.ex02.case05.home.domain.Score;
import ch07.ex02.case05.home.io.Console;
import ch07.ex02.case05.home.io.GradeIo;
import ch07.ex02.case05.home.service.GradeService;
import ch07.ex02.case05.home.service.GradeServiceImpl;

public class Main {  // 180427
	public static void main(String[] args) {
		Console.info("성적 관리 시스템을 시작합니다. ");
		
		int studentCnt = 0;
		Score[] scores;
		
		studentCnt = Console.inNum("학생 수를 입력하세요.");
		scores = new Score[studentCnt];
		
		GradeDao gradeDao = new GradeDaoImpl(scores);
		GradeService gradeService = new GradeServiceImpl(gradeDao);
		GradeIo gradeIo = new GradeIo(gradeService);
		
		gradeIo.play(studentCnt);
		
		Console.info("성적 관리 시스템을 종료합니다.");
	}
}
