package ch09.ex05.case01;

public class TestMain {
	public static void main(String[] args) {
		Buffer buffer = new Buffer();
		(new Thread(new Producer("A", buffer))).start();
		(new Thread(new Producer("B", buffer))).start();
		(new Thread(new Consumer("가", buffer))).start();
		(new Thread(new Consumer("나", buffer))).start();
	}
}
