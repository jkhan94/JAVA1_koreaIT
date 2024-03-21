package day04;

import java.util.Scanner;

public class SwitchTest1 {
	public static void main(String[] args) {

		// switch문
		// int, char, String 만 사용가능
		int num = 1;

		switch (num) {
		case 0:
			System.out.println("0입니다");
			break;
		case 2:
			System.out.println("2입니다");
			break;
		case 3:
			System.out.println("3입니다");
			break;
		default:
			System.out.println("아무것도 아닙니다");
			break;
		}

		// Oper4의 실습1.
		// switch case 사용
		// 당신은 사막을 동물 1마리와 모험을 떠나려고 합니다 출력
		// 함께할 동물을 선택하세요 출력
		// 1.사자 2.원숭이 3.소 4.말 5.양 출력
		// 사용자에게 해당되는 동물의 번호(정수)를 입력받는다

		// 번호에 따라서 결과를 출력
		// 사자=자존심, 원숭이=우정, 소=직업, 말=가족, 양=사랑

		// 입력예시
		// 동물 번호를 입력하세요 >> 3
		// 출력예시
		// 당신에게 가장 소중한 것은 직업 입니다.

//		Scanner sc = new Scanner(System.in);
//		int choice = 0;
//		String result = null;
//
//		System.out.println("당신은 사막을 동물 1마리와 모험을 떠나려고 합니다.");
//		System.out.println("1.사자 2.원숭이 3.소 4.말 5.양");
//		System.out.println("함께할 동물을 선택하세요(번호 입력)");
//		choice = sc.nextInt();
//
//		switch (choice) {
//		case 1:
//			result = "자존심";
//			break;
//		case 2:
//			result = "우정";
//			break;
//		case 3:
//			result = "직업";
//			break;
//		case 4:
//			result = "가족";
//			break;
//		//case 5 대신 default도 가능
//		case 5:
//			result = "사랑";
//			break;
//		}
//
//		System.out.println("당신에게 가장 소중한 것은 " + result + " 입니다");

		// 모범답안
//		Scanner sc = new Scanner(System.in);
//		int choice1 = 0;
//		String result1 = null;
//		String lion = "자존심";
//		String monkey = "우정";
//		String cow = "직업";
//		String horse = "가족";
//		String sheep	= "사랑"	;
//		
//		System.out.println("당신은 사막을 동물 1마리와 모험을 떠나려고 합니다.");
//		System.out.println("1.사자 2.원숭이 3.소 4.말 5.양");
//		System.out.println("함께할 동물을 선택하세요(번호 입력)");
//		choice1 = sc.nextInt();
//		
//		switch (choice1) {
//		case 1:
//			result1 = lion;
//			break;
//		case 2:
//			result1 = monkey;
//			break;
//		case 3:
//			result1 = cow;
//			break;
//		case 4:
//			result1 = horse;
//			break;
//		//case 5 대신 default도 가능
//		case 5:
//			result1 = sheep;
//			break;
//		}
//		System.out.println("당신에게 가장 소중한 것은 " + result1 +" 입니다.");

		// 실습 1-1
		// 사용자에게 월을 입력받고 계절 출력
		// 12, 1,2월 = 겨울 / 3,4,5,월 = 봄 / 6,7,8월 = 여름 / 9,10,11월 = 가을
		int choice2 = 0;
		String season = null;
		Scanner sc = new Scanner(System.in);

		System.out.println("월을 입력하세요");
		choice2 = sc.nextInt();

		switch (choice2) {
		case 12: case 1: case 2:
			season = "겨울";
			break;
		case 3: case 4: case 5:
			season = "봄";
			break;
		case 6: case 7: case 8:
			season = "여름";
			break;
		default:
			season = "가을";
			break;
		}
		System.out.println(season + "입니다");
		sc.close();

	}

}
