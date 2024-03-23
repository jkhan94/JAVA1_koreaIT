package day06;

import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {

		// 1.값이 무엇인지 알고 있을 때
		// 자료형[] 배열명 = {값1, 값2, 값3};
		int[] ar = { 1, 2, 3, 4, 5 };
//		int[] ar2 = new int[] {1,2,3,4,5};

		System.out.println(ar);
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar[2]);
		System.out.println(ar[3]);
		System.out.println(ar[4]);

		ar[4] = 100;
		System.out.println(ar[4]);
		System.out.println();
		
		// 2. 값은 아직 모르지만 몇 칸이 필요한지 알고 있을 때
		// 자료형[] 배열명 = new 자료형[칸수];
		int[] ar2 = new int[5];
		for (int i = 0; i < 5; i++) {
			System.out.println(ar2[i]);
		}
		System.out.println();

		// 3. 값도 몇 칸이 필요한지도 모를 때
		int[] ar3 = null;
		// null은 주소값을 아직 모를 때 사용한다.
		// 주소값을 할당하지 않으면 null 예외 에러 발생
		// Exception in thread "main" java.lang.NullPointerException: Cannot load from
		// int array because "ar3" is null at day06.ArrayTest.main(ArrayTest.java:37)
//		System.out.println(ar3[3]);

		ar3 = new int[5];
		System.out.println(ar3[3]);
		System.out.println();

///////////////////////////////////////////////////////////////////////////////////		
		// 사용자에게 배열 길이를 입력받아서 배열 생성
		// 프로그램 실행 중 배열 크기가 변경될 수 있어서 자바의 배열은 동적배열이다.
		// 자바에서의 배열을 메모리상 동적배열이다.
		Scanner sc = new Scanner(System.in);
		System.out.println("몇 칸으로 배열을 만들까요?");
		int num = sc.nextInt();
		int[] ar4 = new int[num];
		for(int i=0; i<ar4.length;i++) {
			System.out.println(ar4[i]);
		}
		System.out.println();
		sc.close();

		// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3
		// out of bounds for length 3 at day06.ArrayTest.main(ArrayTest.java:51)
		// 없는 애를 불러도 예외
		int[] ar5 = new int[3];
		for (int i = 0; i < ar5.length; i++) {
			System.out.println(ar5[i]);
		}
		System.out.println();
		for (int i = 0; i < ar5.length; i++) {
			ar5[i] = i;
			System.out.println(ar5[i]);
		}

	}

}
