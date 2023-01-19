package ch05.ex05.home.case03;

public class Machine {
	public Ball choose(){
		Ball ball = new Ball();
		ball.setNum((int)(Math.random()*45)+1);
		return ball;
	}
}
