package day05;

public class DoubleLoop {

	public static void main(String[] args) {

		// 단순 이중루프
		for (int i = 0; i < 5; i++) {
			System.out.print("hello: ");
			for (int j = 0; j < 5; j++) {
				System.out.print("안녕하세요 ");
			}
			System.out.println();
		}
		System.out.println();
		
		// 구구단 2단 출력
//		for (int i = 1; i < 10; i++) {
//			System.out.println("2 X " + i + " = " + 2 * i);
//		}

		// 구구단 2-9단 출력
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " X " + j + " = " + i * j);
			}
			System.out.println();
		}

	}

}
