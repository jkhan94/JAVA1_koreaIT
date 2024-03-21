package day03;

import java.util.Scanner;

public class InputTest2 {

	public static void main(String[] args) {

		// 실습1
		// 힌트: 형변환
		// 사용자에게 정수 2개를 입력받고 두 수의 합계를 출력

		// 입력예시
		// 첫번째 정수를 입력하세요 >> 3
		// 두번째 정수를 입력하세요 >> 5

		// 결과예시
		// 두 수의 합계는 8입니다

		Scanner sc = new Scanner(System.in);

		System.out.println("문자열로 받은 정수를 바로 형변환해서 출력");
		int num1 = 0, num2 = 0;
		
		System.out.println("첫번째 정수를 입력하세요");
		num1 = Integer.parseInt(sc.next());

		System.out.println("두번째 정수를 입력하세요");
		num2 = Integer.parseInt(sc.next());

		System.out.println("두 수의 합계는 " + (num1 + num2) + "입니다");
		System.out.println();

		
		// 모범답안
		System.out.println("문자열로 받은 정수를 형변환해서 sum2에 저장 후 출력");
		String num3 = null, num4 = null;
		int sum2 = 0;

		System.out.println("첫번째 정수를 입력하세요");
		num3 = sc.next();

		System.out.println("두번째 정수를 입력하세요");
		num4 = sc.next();

		sum2 = Integer.parseInt(num3) + Integer.parseInt(num4);
		System.out.println("두 수의 합계는 " + sum2 + "입니다");
		System.out.println();

		
		// nextInt()
		System.out.println("문자열로 받은 정수를 nextInt로 받아서 출력");
		int num5 = 0, num6 = 0;
		System.out.println("첫번째 정수를 입력하세요");
		num5 = sc.nextInt();

		System.out.println("두번째 정수를 입력하세요");
		num6 = sc.nextInt();

		System.out.println("두 수의 합계는 " + (num5 + num6) + "입니다");

		sc.close();

	}

}
