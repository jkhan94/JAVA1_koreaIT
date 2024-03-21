package day04;

import java.util.Scanner;

public class Oper3 {

	public static void main(String[] args) {

		// 삼항연산자
		String msg = 10 > 5 ? "참입니다" : "거짓입니다";
		System.out.println(msg);
		System.out.println();

		// 사용자에게 정수를 입력받고 양수인지 음수인지를 출력하기
		Scanner sc = new Scanner(System.in);
		String result = null;
		int num = 0;

		System.out.println("정수를 입력하세요");
		num = sc.nextInt();

		// 양수, 음수 여부 판별. 삼항연산자 1개 사용
		result = num > 0 ? "양수" : "음수";
		System.out.println(result + " 입니다");

		// 양수, 음수, 0 여부 판별. 삼항연산자 2개 사용
		result = num ==0? "0" : num > 0 ? "양수" : "음수";
		System.out.println(result + " 입니다");
		System.out.println();
		

		// 실습1.
		// 사용자에게 나이를 입력받고 취득 가능한 면허를 출력
		// 19세 이상 운전면허 취득가능만 출럭(오토바이 x)
		// 17세 이상 오토바이 취득가능
		// 17세 미만 도보 가능

//		Scanner sc = new Scanner(System.in);
//		int age = 0;
//		String result=null;
//
//		System.out.println("나이를 입력하세요");
//		age = sc.nextInt();
//		result = age>=19? "운전면허 취득" : age>=17? "오토바이 취득":"도보";
//		System.out.println(result + " 가능");

		// 모범답안
		sc.nextLine();
		int age = 0;
		String result1 = null;
		String car = "운전면허 취득";
		String motorbike = "오토바이 취득";
		String walking = "도보 가능";

		System.out.println("나이 입력하세요");
		age = sc.nextInt();

//		result1= age>18 ? "운전면허 취득 가능" : age>16 ? "오토바이 면허 취득가능" : "도보 가능";
		result1 = age > 18 ? car : age > 16 ? motorbike : walking;
		System.out.println(result1 + " 가능합니다");

		//삼항연산자의 결과는 값이기 때문에 출력 또한 가능하다
		System.out.println(age > 18 ? "운전면허" : "오토바이");

	}

}
