package day04;

import java.util.Scanner;

public class Oper1 {

	public static void main(String[] args) {

		// 실습1.
		// 사용자에게 정수 1개 입력받고 정답과 일치하는지
		// true, false 사용해 출력
		int answer = 11;
		int num1 = 0;
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 1개를 입력하세요");
		num1 = sc.nextInt();
		flag = num1 == answer;
		System.out.println("결과는 " + flag);
		System.out.println("결과는 " + (num1 == answer));

		// 모범답안
		int answer2 = 11;
		int num2 = 0;
		boolean result = false;
		sc.nextLine();
		System.out.println("정수 1개를 입력하세요");
		num2 = sc.nextInt();
		result = answer2 == num2;

		System.out.println("결과는 " + (answer2 == num2));
		System.out.println("결과는 " + result);
		sc.close();

		// 복합 대입 연산자
		int num = 10;

		num += 20;
		// num = num+20;
		System.out.println(num);

		num -= 20;
		// num = num-20;
		System.out.println(num);

		num *= 20;
		// num = num*20;
		System.out.println(num);

		num /= 20;
		// num = num/20;
		System.out.println(num);

		num %= 20;
		// num = num%20;
		System.out.println(num);

		// String은 += 로 누적하여 연결 가능
		String msg = "A";
		msg += "B";
		System.out.println(msg);

	}

}
