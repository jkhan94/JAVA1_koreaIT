package day03;

import java.util.Scanner;

public class Oper1 {

	public static void main(String[] args) {

		// 단항 연산자
		int num = 10;
		// 후위형
		// num++ 는 num = num+1
		System.out.println("처음 숫자 " + num);
		System.out.println("단항 연산자 후휘형 a++");
		System.out.println(num++);
		System.out.println(num);
		// 전위형
		num = 10;
		System.out.println("단항 연산자 전위형 ++a");
		System.out.println(++num);
		System.out.println(num);

		num = 10;
		System.out.println("num + 1로 출력해도 num=10 유지");
		System.out.println(num + 1);
		System.out.println(num);

		// 후위형
		num = 10;
		System.out.println("단항 연산자 후휘형 a--");
		System.out.println(num--);
		System.out.println(num);
		// 전위형
		num = 10;
		System.out.println("단항 연산자 전위형 --a");
		System.out.println(--num);
		System.out.println(num);

		System.out.println("단항 연산자 NOT");
		boolean bool = true;
		System.out.println("처음 값 " + bool);
		System.out.println(!bool);
//		System.out.println(!num);
		System.out.println();

///////////////////////////////////////////////////////////		
		// 산술연산자
		System.out.println("산술 연산자");
		int num1 = 10, num2 = 3;
		System.out.println("처음 숫자 " + num1 + ", " + num2);
		System.out.println("+ " + (num1 + num2));
		System.out.println("- " + (num1 - num2));
		System.out.println("* " + (num1 * num2));
		System.out.println("/ " + (num1 / num2));
		System.out.println("% " + (num1 % num2));
		System.out.println();

		// 실습1
		// 사용자에게 3개 정수 입력받고 평균과 합계를 출력

		// 입력예시
		// 첫번째 정수를 입력하세요 >> 1
		// 두번째 정수를 입력하세요 >> 3
		// 세번째 정수를 입력하세요 >> 10

		// 결과예시
		// 합계는 14입니다
		// 평균은 4.66666... 입니다

		System.out.println("실습1");
		Scanner sc = new Scanner(System.in);
		int num3 = 0, num4 = 0, num5 = 0;

		System.out.println("첫번째 정수를 입력하세요");
		num3 = sc.nextInt();
		System.out.println("두번째 정수를 입력하세요");
		num4 = sc.nextInt();
		System.out.println("세번째 정수를 입력하세요");
		num5 = sc.nextInt();

//		System.out.println("합계는 "+ (num3+num4+num5) + "입니다");
//		System.out.println("평균은 " + ((double)(num3+num4+num5)/3) + "입니다");

		int sum = 0;
		double avg = 0.0;

		sum = num3 + num4 + num5;
//		avg = (double)sum/3;
		// 그냥 3을 쓰면 정수/정수가 되어서 결과도 정수가 출력. 따라서 4.0이 나옴.
		// 소수점 아래까지 제대로 출력하려면 나누는 수를 실수로 바꿔줘야 함.
		avg = sum / 3.0;

		System.out.println("합계는 " + sum + "입니다");
		System.out.println("평균은 " + avg + "입니다");

		// 문자열은 연결이 된다.
//		System.out.println("A"+"B");
//		System.out.println("A"-"B");

	}

}
