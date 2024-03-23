package day07;

import java.util.Scanner;

public class MethodTest1 {

	// 사용자에게 정수 2개를 입력받아
	// 합계를 반환해주는 메소드를 선언한다.
//	 리턴타입 메소드명(자료형 매개변수명){
//	 실행할 코드
//	 return 리턴값;
//	 }
	int sum(int num1, int num2) {
		return num1 + num2;
	}

	// 실습1.
	// 사용자가 입력한 정수가 짝수인지 판별하고
	// 그 여부를 반환하는 메소드 선언
	// static 리턴타입...
//	static boolean isEven(int num) {
//		if (num % 2 == 0) {
//			System.out.print("짝수입니다. ");
//			return true;
//		} else
//			System.out.print("홀수입니다. ");
//			return false;
//	}

	// 모범답안
	static boolean isEven(int num) {
		// num % 2 == 0가 참이면 true
		// 거짓이면 false
		return num % 2 == 0;
	}

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 20;

		Scanner sc = new Scanner(System.in);
		int num3 = 0;
		int num4 = 0;

		System.out.println("정수를 입력하세요");
		num3 = sc.nextInt();
		System.out.println("정수를 입력하세요");
		num4 = sc.nextInt();

		// 클래스명.메소드명 순으로 불러야 사용가능하다.
		// sum(num1, num2); //이건 사용 불가.
		MethodTest1 m = new MethodTest1();
		System.out.println(m.sum(num1, num2));
		System.out.println(m.sum(num3, num4));
		System.out.println(m.sum(50, 100));

//		System.out.println(MethodTest1.isEven(5));
//		System.out.println(MethodTest1.isEven(10));
		boolean result = MethodTest1.isEven(30);
		System.out.println(result);
		
		// 아래처럼 써도 코드는 실행됨.
		// 그러나 권장하지 않음. (암묵적인 규칙)
//		isEven(30);

	}

}
