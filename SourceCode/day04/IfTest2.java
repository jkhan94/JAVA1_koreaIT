package day04;

import java.util.Scanner;

public class IfTest2 {

	public static void main(String[] args) {

		// 실습1.
		// 사용자에게 점수를 입력받습니다
		// 해당 점수에 맞는 등급을 출력하기 (최대점수=100, 최하점수=0점)
		// 90점 이상: A등급
		// 80점 이상 90점 미만: B등급
		// 70점 이상 80점 미만: C등급
		// 70점 미만: F등급

		// 입력예시 : 점수를 입력하세요 >> 60
		// 결과예시 : F등급 입니다

		Scanner sc = new Scanner(System.in);
		int score = 0;
		char grade = ' ';

		System.out.println("점수를 입력하세요");
		score = sc.nextInt();

		// 예외처리
		if (score > 100) {
			System.out.println("유효범위가 아닙니다. 점수는 0점 이상, 100점 이하입니다.");
			System.exit(0);
		}
		if (score < 0) {
			System.out.println("유효범위가 아닙니다. 점수는 0점 이상, 100점 이하입니다.");
			System.exit(0);
		}

		// 등급 출력
		if (score >= 90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		} else {
			grade = 'F';
		}

		System.out.println(grade + "등급 입니다");
		System.out.println();

		// 모범답안
//		Scanner sc = new Scanner(System.in);
//		int score1=0;
//		String grade1= "F등급";
////		String grade1 = null;
//		
//		System.out.println("점수를 입력하세요");
//		score1 = sc.nextInt();
//		if(score1>=90) {
//			grade1 = "A등급";
//		}
//		else if(score1>=80) {
//			grade1 = "B등급";
//		}
//		else if(score1>=70) {
//			grade1 = "C등급";
//		}
////		else {
////			grade1 = "F등급";
////		}
//		
//		System.out.println(grade1 + " 입니다");

///////////////////////////////////////////////////////////////////////////		
		// 실습2.
		// 독감 예방접종 요일을 출력
		// 사용자에게 주민번호 맨 뒷자리를 입력받고 (정수 1개)
		// 뒷자리가 1. 6이면 월요일 / 2,7이면 화요일 / 3,8이면 수요일
		// 4,9이면 목요일 / 5,0이면 금요일

		// 입력예시
		// 주민번호 맨 뒷자리를 입력하세요 >> 2
		// 결과예시
		// 접종일은 화요일입니다.

		// 초안
//		Scanner sc = new Scanner(System.in);
//		int num = 0;
//		String day = null;
//		System.out.println("주민번호 맨 뒷자리를 입력하세요");
//		num = sc.nextInt();
//
//		if (num == 1 || num == 6) {
//			day = "월요일";
//		} else if (num == 2 || num == 7) {
//			day = "화요일";
//		} else if (num == 3 || num == 8) {
//			day = "수요일";
//		} else if (num == 4 || num == 9) {
//			day = "목요일";
//		} else {
//			day = "금요일";
//		}
//		
//		System.out.println("접종일은 "+ day + "입니다");		

		// 출력 + 예외처리
//		Scanner sc = new Scanner(System.in);
		String input = null;
		String day1 = null;
		int num1 = 0;
		if(sc.hasNextLine()){sc.nextLine();}
		
		System.out.println("주민번호 맨 뒷자리를 입력하세요");
		input=sc.nextLine();

		// 예외처리
		if (Character.isDigit(input.charAt(0)) == false) {
			System.out.println("잘못 입력하셨습니다. 주민번호 맨 뒷자리를 입력하세요");
			System.exit(0);
		}

		// 등급 출력
		num1 = Integer.parseInt(input);

		if (num1 == 1 || num1 == 6) {
			day1 = "월요일";
		} else if (num1 == 2 || num1 == 7) {
			day1 = "화요일";
		} else if (num1 == 3 || num1 == 8) {
			day1 = "수요일";
		} else if (num1 == 4 || num1 == 9) {
			day1 = "목요일";
		} else {
			day1 = "금요일";
		}

		System.out.println("1 접종일은 " + day1 + "입니다");
		System.out.println();

		// 모범답안
//		Scanner sc = new Scanner(System.in);
		int num2 = 0;
		int extra = 0;
		String result = null;

		System.out.println("주민번호 맨 뒷자리를 입력하세요");
		num2 = sc.nextInt();
//
//		// 논리연산자 사용
////		if (num2 == 1 || num2 == 6) {
////			result = "월요일";
////		} else if (num2 == 2 || num2 == 7) {
////			result = "화요일";
////		} else if (num2 == 3 || num2 == 8) {
////			result = "수요일";
////		} else if (num2 == 4 || num2 == 9) {
////			result = "목요일";
////		} else {
////			result = "금요일";
////		}
//
		// 5로 나누었을 때 나머지 활용
		extra = num2 % 5;
		if (extra == 1) {
			result = "월요일";
		} else if (extra == 2) {
			result = "화요일";
		} else if (extra == 3) {
			result = "수요일";
		} else if (extra == 4) {
			result = "목요일";
		} else {
			result = "금요일";
		}

		System.out.println("2 접종일 " + result + " 입니다");
		System.out.println();

//////////////////////////////////////////////////////////////////////////////////		
		// 심화 실습
		// 사용자가 생년월일을 입력하면
		// 일자에 따라서 독감 예방접종일을 출력

		// 입력예시
		// 생년월일을 입력하세요 >> 911211
		// 출력예시
		// 접종일 월요일 입니다.

//		Scanner sc = new Scanner(System.in);
		String input1 = null;
		String day3 = null;
		int num3 = 0, rem = 0;
		if(sc.hasNextLine()){sc.nextLine();}
		
		System.out.println("생년월일을 입력하세요");
		input1 = sc.nextLine();

		// 문자열 길이 구하기
//		int len = input1.length();
//		System.out.println(len);

		// 예외처리
		// 6개를 입력받아야 하는데 만약 5개만 입력됐을 경우 탈출
		// 문자열 길이가 6이 아닐 경우 강종
		if (input1.length() != 6) {
			System.out.println("잘못 입력하셨습니다. 생년월일 6자리를 입력하세요");
			System.exit(0);
		}
		// 입력된 문자열의 마지막 값이 숫자가 아닐 경우 강종
		if (Character.isDigit(input1.charAt(5)) == false) {
			System.out.println("잘못 입력하셨습니다. 생년월일 6자리를 입력하세요");
			System.exit(0);
		}

		// 등급 출력
		num3 = input1.charAt(5);
		rem = num3 % 5;
		switch (rem) {
		case 1:
			day3 = "월요일";
			break;
		case 2:
			day3 = "화요일";
			break;
		case 3:
			day3 = "수요일";
			break;
		case 4:
			day3 = "목요일";
			break;
		default:
			day3 = "금요일";
			break;
		}

		System.out.println("3 접종일은 " + day3 + "입니다");
		System.out.println();

		// 모범답안
//		Scanner sc = new Scanner(System.in);
		String birth = null;
		char date = ' ';
		String result2 = null;
		
		System.out.println("생년월일을 입력하세요");
		birth = sc.next();

		date = birth.charAt(5);
		switch (date) {
		case '1': case '6':
			result2 = "월요일";
			break;
		case '2': case '7': 
			result2 = "화요일";
			break;
		case '3': case '8':
			result2 = "수요일";
			break;
		case '4': case '9':
			result2 = "목요일";
			break;
		default:
			result2 = "금요일";
			break;
		}

		System.out.println("4 접종일은 " + result2 + " 입니다");
		
		sc.close();

	}

}
