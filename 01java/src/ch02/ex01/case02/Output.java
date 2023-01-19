/*API : 출력*/

package ch02.ex01.case02;

public class Output { // 180329
	public static void main(String[] args) {
		int score = 100;
		System.out.println(100); // 100
		System.out.println(score); // 100
		System.out.println(100 + 1); // 101
		System.out.println(Math.random()); // 0.6066187143759149

		System.out.print(200);
		System.out.print(300);
		System.out.print("\n");		
		
		System.out.printf("%b, %c, %d, %.1f, %s\n", true, 'a', 10, 10.15, "hello"); // true, a, 10, 10.2, hello
		String name = "최한석";
		int age = 22;
		System.out.printf("%s은(는) %d살입니다.", name, age); // 최한석은(는) 22살입니다.
		System.out.println();
		System.out.println(name + "은(는) " + age + "살입니다.");  // 띄어쓰기/ 최한석은(는) 22살입니다.		
	}
}
