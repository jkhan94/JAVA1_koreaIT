package day04;

import java.util.Scanner;

public class Oper2 {

	public static void main(String[] args) {

		// 실습1. 코인 노래방 문제
		// 사용자에게 금액을 입력받고 부를 수 있는 노래 곡 수와 잔돈 출력
		// 1곡 당 300원

		// 입력예시
		// 금액을 입력하세요 >> 1000
		// 출력예시
		// 3곡을 부를 수 있으며 잔돈은 100원 입니다.

		Scanner sc = new Scanner(System.in);

//		System.out.println("금액을 입력하세요.");
//		int charge=0;
//		charge = sc.nextInt();
//		System.out.println((charge/300)+"곡을 부를 수 있으며 잔돈은 " + (charge%300)+"원 입니다.");

		// 모범답안
		final int PRICE = 300; // 값 고정
		int money = 0;
		int count = 0;
		int change = 0;

		System.out.println("금액을 입력하세요.");
		money = sc.nextInt();

		// 부를 수 있는 곡 수
		count = money / PRICE;

		// 잔돈
		change = money % PRICE;

		System.out.println(count + "곡을 부를 수 있으며 잔돈은 " + change + "원입니다.");
		System.out.println();

		///////////////////////////////////////////////////////
		// 실습2.
		// 사용자에게 두 자리 양의 정수를 입력받고 일의 자리수와 입의 자리수를 출력

		// 입력예시
		// 두 자리 정수를 입력하세요 >> 37
		// 출력예시
		// 일의 자리 수는 7입니다.
		// 십의 자리 수는 3입니다.

		System.out.println("두 자리 정수를 입력하세요.");
		int num1 = 0, tens1 = 0, units = 0;
		sc.nextLine();
		num1 = sc.nextInt();
		tens1 = num1 / 10;
		units = num1 % 10;
		System.out.println("십의 자리 수는 " + tens1 + "입니다.");
		System.out.println("일의 자리 수는 " + units + "입니다.");
		System.out.println();
//
//		// 모범답안1
//		int num2 = 0, ten = 0, one = 0;
//		System.out.println("두 자리 양의 정수를 입력하세요.");
//		num2 = sc.nextInt();
//		ten = num1 / 10;
//		one = num1 % 10;
//		System.out.println("일의 자리 수는 " + one + "입니다.");
//		System.out.println("십의 자리 수는 " + ten + "입니다.");

		// 모범답안2
		String num = null;
		char ones = ' ';
		char tens = ' ';
		sc.nextLine();
		System.out.println("두 자리 양의 정수를 입력하세요.");
		num = sc.next();
		// 문자열.charAt(자리번호); -> 자리번호에 해당하는 글자를 문자형으로 가져올 수 있다.
		ones = num.charAt(1);
		tens = num.charAt(0);
		System.out.println("일의 자리 수는 " + ones + "입니다.");
		System.out.println("십의 자리 수는 " + tens + "입니다.");

		sc.close();

	}

}
