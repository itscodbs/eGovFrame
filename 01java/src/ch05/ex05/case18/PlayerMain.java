package ch05.ex05.case18;

public class PlayerMain {
	public static void main(String[] args) {
		Ball ball = new Ball();
		Player player1 = new Player();
		Player player2 = new Player();
		Player player3 = new Player();
		
		ball = player3.kick(player2.pass(player1.pass(ball)));
		ball.fly();
	}
}
