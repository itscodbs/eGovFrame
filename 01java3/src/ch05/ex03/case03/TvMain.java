package ch05.ex03.case03;

public class TvMain {
	public static void main(String[] args) {
		Tv tv1 = new Tv();
		Tv tv2 = new Tv();
		System.out.println("tv1.channel : " + tv1.getChannel());
		System.out.println("tv2.channel : " + tv2.getChannel());
		System.out.printf("tv1 : %s\ntv2 : %s\n", tv1, tv2);
		System.out.println();
		
		tv2 = tv1;
		tv1.setChannel(7);
		System.out.println("tv1.channel : " + tv1.getChannel());
		System.out.println("tv2.channel : " + tv2.getChannel());
		System.out.printf("tv1 : %s\ntv2 : %s\n", tv1, tv2);
	}
}
