package day04;

import java.util.Scanner;

public class IfTest {

	public static void main(String[] args) {

		// if문
		System.out.println("if문 1개");
		int choice = 1;
		if (choice == 0) {
			System.out.println("참입니다");
		}
		System.out.println();

		// 사용자에게 정수를 입력받고 양수, 음수 판별
		Scanner sc = new Scanner(System.in);
		int num = 0;
		System.out.println("정수를 입력하세요");
		num = sc.nextInt();
		
		// if문 사용
		System.out.println("if문 2개");
		if (num > 0) {
			System.out.println("양수입니다");
		}
		if (num < 0) {
			System.out.println("음수입니다");
		}
		if(num == 0) {
			System.out.println("0입니다.");
		}
		System.out.println();

		// if-else문 사용
		System.out.println("if-else문");
		if (num > 0) {
			System.out.println("양수입니다");
		} else {
			System.out.println("음수입니다");
		}
		System.out.println();
		
		// if-else if-else문 사용
		System.out.println("if- else if -else문");
		if (num > 0) {
			System.out.println("양수입니다");
		} else if(num==0) {
			System.out.println("0 입니다");
		} else {
			System.out.println("음수입니다");
		}

		// else
//		sc.nextLine();
//		int num3 = 0;
//		System.out.println("정수를 입력하세요");
//		num3 = sc.nextInt();
//
//		if (num3 == 100) {
//			System.out.println("100입니다");
//		} else if (num3 == 1000) {
//			System.out.println("1000입니다");
//		} else {
//			System.out.println("둘 다 아닙니다");
//		}

	}

}
