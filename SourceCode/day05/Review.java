package day05;

import java.util.Scanner;

public class Review {

	public static void main(String[] args) {

		// 실습1. (아스키코드, 형변환, 조건문)
		// 사용자에게 알파벳 한 글자를 입력받고
		// 해당 알파벳이 대문자인지 소문자인지 판별해서 출력

		// 입력예시
		// 알파벳을 입력하세요 >> A

		// 출력예시
		// 대문자입니다.

		Scanner sc = new Scanner(System.in);		
		String input = null;
		int num1=0;
		
		System.out.println("Enter an alphabet.");
		input = sc.next();
	
		//String을 정수와 비교 불가.
		//문자열을 문자로 바꿔줘야 한다.
		num1=input.charAt(0);
		
		if(num1>=65 && num1 <=90) {
			System.out.println("Capital Letter");
		}
		else if(num1>=97 && num1 <=122) {
			System.out.println("Small Letter");
		} else {
			System.out.println("Incorrect entry.");
		}
		sc.close();

		/////////////////////////////////////////////////
		// 모범답안
//		Scanner sc = new Scanner(System.in);
//		String msg = null;
//
//		// 사용자에게 알파벳 한글자를 입력받는다
//		System.out.println("알파벳을 입력하세요");
//		msg = sc.next();
//		int num = 0;
//
////		//입력받은 알파벳 한 글자를 int 타입으로 변환한다.
////		//이러면 에러가 난다.
////		num = Integer.parseInt(msg);
////		System.out.println(num);
//
//		// 입력받은 알파벳 한글자를 char 타입으로 형변환 한다
//		// 형변환 한 값을 int 타입 저장공간 num 에 넣는다
////		System.out.println(msg.charAt(0)); //A가 출력됨
//		num = msg.charAt(0);
//
		// 아스키 코드
		// 대문자 A ~ Z : 65 ~ 90
		// 소문자 a ~ z : 97 ~ 122
		// 해당 되는 조건을 if문을 통해 판별하고 결과를 출력한다
//
//		if (num >= 65 && num <= 90) {
//			System.out.println("대문자 입니다");
//		} else if (num >= 97 && num <= 122) {
//			System.out.println("소문자 입니다");
//		} else {
//			System.out.println("잘못된 입력입니다");
//		}

	}

}
