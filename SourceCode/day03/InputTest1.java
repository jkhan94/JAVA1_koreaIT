package day03;

import java.util.Scanner;

public class InputTest1 {

	public static void main(String[] args) {

		// ctrl + shift + o 자동 import(불러오기)

		Scanner sc = new Scanner(System.in);

		// 공백, 줄바꿈 없는 next
		System.out.println("문자열을 입력하세요");
		String msg = sc.next();
		System.out.println(msg);

		// 공백 있는 next
		String name = null;
		String name2 = null;
		String name3 = null;

		System.out.println("문자열 2개를 입력하세요");
		name = sc.next();
		name2 = sc.next();
		System.out.println(name);
		System.out.println(name2);
		// sc에 name, name2, 엔터가 들어있음.
		// name, name2 출력 후엔 엔터만 남음.
		// 따라서 name3는 값 입력 전에 엔터를 만나서 값이 입력됐다고 인식딤.
		// 고로 nextLine()으로 버퍼를 비워줘야 한다.
		sc.nextLine();

		// 공백 줄바꿈 무관 nextLine
		System.out.println("문자열을 입력하세요");
		name3 = sc.nextLine();
		System.out.println(name3 + "님 안녕하세요");
		System.out.println();

//		// 실습 1.
//		// 사용자에게 이름과 성을 입력받고 이름 + "님 환영합니다" 라고 출력
//		// 입력예시: 홍 길동
//		// 결과예시 : 길동님 환영합니다.

		System.out.println("실습1");
//		String name4 = null;
//		String name5 = null;
//
//		System.out.println("문자열 2개를 입력하세요");
//		name4 = sc.next();
//		name5 = sc.next();
//
//		System.out.println(name5 + "님 환영합니다");

		// 모범답안
		String firstName = null;
		String lastName = null;

		System.out.println("이름을 입력하세요");
		firstName = sc.next();
		lastName = sc.next();

		System.out.println(firstName + "님 환영합니다");
		System.out.println();

//		//실습2.
//		//사용자에게 수업과정과 수업 차수를 입력받아 출력해주기
//		//입력예시: 자바 3일
//		//결과예시: 오늘은 자바 3일차 입니다 출력
		System.out.println("실습2");
		
		String course = null;
		String day = null;
		System.out.println("수업과정과 수업 차수를 입력하세요.");
		course = sc.next();
		day = sc.next();
		System.out.println("오늘은 " + course +" " + day + "차 입니다.");
		System.out.println();
		sc.nextLine(); // 버퍼 비우기
		
		// 모범답안
		String msg1 = null;
		System.out.println("수업과정과 수업 차수를 입력하세요.");
		msg1 = sc.nextLine();
		System.out.println("오늘은 " + msg1 + "차 입니다.");
		
		sc.close();

	}

}
