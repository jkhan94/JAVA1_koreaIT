package day05;

import java.util.Scanner;

public class WhileTest {

	public static void main(String[] args) {

		int count = 0;
//		//무한(반복)루프
//		while(count<5) {
//			System.out.println("hello");		
//		}
//		
//		while (true) {
//			System.out.println("hello");			
//		}

		// 조건식이 거짓인 경우가 존재해야 무한반복이 되지 않는다.
		while (count < 5) {
			System.out.println("hello");
			count++;
		}
		
		while (count < 5) {
			System.out.println("hello");
			break;			
		}
		System.out.println();

/////////////////////////////////////////////////////////////////////////////
		// 실습1.
		// 0부터 10까지 중에서 짝수 합계 출력
		int i = 0;
		int sum = 0;
		while (i < 11) {
			if (i % 2 == 0) {
				sum += i;
			}
			i++;
		}
		System.out.println("합계1 "+sum);

		i = 0;
		sum = 0;
		while (i < 11) {
			sum += i;
			i += 2;
		}
		System.out.println("합계2 "+sum);
		System.out.println();
//
//		// 모범답안
//		int num1 = 0;
//		int sum1 = 0;
//
//		while (num1 <= 10) {
//			if (num1 % 2 == 0) {
//				sum1 += num1;
//			}
//			num1++;
//		}
//		System.out.println("합계는 " + sum1 + " 입니다");
//
//		num1 = 0;
//		sum1 = 0;
//		while (num1 <= 10) {
//			sum1 += num1;
//			num1 += 2;
//		}
//		System.out.println("합계는 " + sum1 + " 입니다");

/////////////////////////////////////////////////////////////////////////////
		// 실습2.
		// 사용자에게 정수를 입력받고 입력받은 횟수만큼 안녕하세요 라고 출력

		// 입력예시
		// 몇 번 출력할까요? 3

		// 출력예시
		// 안녕하세요
		// 안녕하세요
		// 안녕하세요

		Scanner sc = new Scanner(System.in);
		int num=0;
		int i1=0;
		
		System.out.println("몇 번 출력할까요?");
		num=sc.nextInt();
		
		while(i1<num) {
			System.out.print("안녕하세요1 ");
			i1++;
		}
		System.out.println();

		// 모범답안
//		Scanner sc = new Scanner(System.in);
		int num2 = 0;

		System.out.println("몇 번 출력할까요?");
		num2 = sc.nextInt();

		while (num2 > 0) {
			System.out.print("안녕하세요2 ");
			num2--;
		}
		System.out.print("\n\n");

/////////////////////////////////////////////////////////////////////////////
		// 실습3.
		// 사용자에게 양의 정수를 한 번씩 총 3개 입력받기(3번이 아님! 3개)
		// 단, 음수를 입력할 경우 음의 정수를 입력하셨습니다 라고 출력하고 다시 입력받기
		// 양의 정수 3개가 다 입력되면 프로그램 종료라고 출력

//		Scanner sc = new Scanner(System.in);
		int num3 = 0;
		int count1 = 0;

		while (count1 < 3) {
			System.out.println("양의 정수를 입력하세요");
			num3 = sc.nextInt();
			if (num3 < 0) {
				System.out.println("음의 정수를 입력하셨습니다");
			} else {
				// System.out.println(num3);
				count1++;
			}

			if (count1 == 3) {
				System.out.println("프로그램 종료");
			}
		}
		System.out.println();

		// 모범답안
//		Scanner sc = new Scanner(System.in);
		int num4 = 0;
		int count2 = 0;

		while (count2 < 3) {
			System.out.println("양의 정수를 입력하세요");
			num4 = sc.nextInt();

			if (num4 < 0) {
				System.out.println("음의 정수를 입력하셨습니다");
			} else {
				count2++;
			}
		}
		
		//while문이 끝나면 입력받은 정수는 3개 = 입력 완료
		System.out.println("프로그램 종료!");
		
		sc.close();

	}

}
