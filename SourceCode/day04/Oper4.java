package day04;

import java.util.Scanner;

public class Oper4 {

	public static boolean isInteger(String str) {
		try {
			Integer.parseInt(str);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	public static void main(String[] args) {

		// 실습1.
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
//		String result=null;
//		String one = "자존심";
//		String two = "우정";
//		String three = "직업";
//		String four = "가족";
//		String five	= "사랑"	;
//		
//		System.out.println("당신은 사막을 동물 1마리와 모험을 떠나려고 합니다.");
//		System.out.println("함께할 동물을 선택하세요");
//		System.out.println("1.사자 2.원숭이 3.소 4.말 5.양");
//		
//		System.out.println("동물 번호를 입력하세요");
//		choice = sc.nextInt();
//		
////		result = choice==1? "자존심" : choice==2? "우정" : choice==3? "직업" : choice==4? "가족" : "사랑";
//		result = choice==1? one : choice==2? two : choice==3? three : choice==4? four : five;
//		
//		System.out.println("당신에게 가장 소중한 것은 " + result +" 입니다.");

		// 모범답안
		// 정수를 입력할 경우
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
////		result1 = choice1==1? "자존심" 
////				: choice1==2? "우정" 
////						: choice1==3? "직업" 
////								: choice1==4? "가족" : "사랑";
//		result1 = choice1==1? lion 
//				: choice1==2? monkey 
//						: choice1==3? cow 
//								: choice1==4? horse : sheep;
//		System.out.println("당신에게 가장 소중한 것은 " + result1 +" 입니다.");

		// 문자열을 입력할 경우
//		Scanner sc = new Scanner(System.in);
//		String choice2 = null;
//		String result2 = null;
//		String lion1 = "자존심";
//		String monkey1 = "우정";
//		String cow1 = "직업";
//		String horse1 = "가족";
//		String sheep1	= "사랑"	;
//		
//		System.out.println("당신은 사막을 동물 1마리와 모험을 떠나려고 합니다.");
//		System.out.println("1.사자 2.원숭이 3.소 4.말 5.양");
//		System.out.println("함께할 동물을 선택하세요(번호 입력)");
//		choice2 = sc.next();
//		
//		result2 = choice2.equals("사자")? lion1 
//				: choice2.equals("원숭이")? monkey1 
//						: choice2.equals("소")? cow1 
//								: choice2.equals("말")? horse1 : sheep1;
//		System.out.println("당신에게 가장 소중한 것은 " + result2 +" 입니다.");

		// 문자와 숫자 모두 입력 가능
		Scanner sc = new Scanner(System.in);
		String choice3 = null;
		String result3 = null;
		String lion2 = "자존심";
		String monkey2 = "우정";
		String cow2 = "직업";
		String horse2 = "가족";
		String sheep2 = "사랑";

		System.out.println("당신은 사막을 동물 1마리와 모험을 떠나려고 합니다.");
		System.out.println("1.사자 2.원숭이 3.소 4.말 5.양");
		System.out.println("함께할 동물을 선택하세요(번호 입력)");
		choice3 = sc.next();

		if (choice3 != null && isInteger(choice3)) {
			result3 = Integer.parseInt(choice3) == 1 ? lion2
					: Integer.parseInt(choice3) == 2 ? monkey2
							: Integer.parseInt(choice3) == 3 ? cow2 : Integer.parseInt(choice3) == 4 ? horse2 : sheep2;
		} else {
			result3 = choice3.equals("사자") ? lion2
					: choice3.equals("원숭이") ? monkey2
							: choice3.equals("소") ? cow2 : choice3.equals("말") ? horse2 : sheep2;
		}

		System.out.println("당신에게 가장 소중한 것은 " + result3 + " 입니다.");

	}

}
