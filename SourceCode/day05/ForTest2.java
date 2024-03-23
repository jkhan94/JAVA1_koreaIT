package day05;

import java.util.Scanner;

public class ForTest2 {

	public static void main(String[] args) {

		//실습1.
		//1부터 50까지 출력
		for(int i=1; i<51; i++) {
			System.out.print(i+" ");
		}
//		//모범답안
//		for(int i=0; i<=50; i++) {
//			System.out.println(i);
//		}
//		
		System.out.println(); //줄바꿈
//				
///////////////////////////////////////////////////////////////////		
		//실습2.
		//50부터 1까지 출력
//		for(int i=50; i>0;i--) {
//			System.out.println(i);
//		}
//		//모범답안
		for(int i=50; i>=1; i--) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
///////////////////////////////////////////////////////////////////		
		//실습3.
		//i의 값을 소괄호 안에서(초기식, 조건식, 증감식에서) 감소시키지 않고 5부터 1까지 출력
		for(int i=0;i<5;i++) {
			System.out.print(5-i + " ");
		}
//		//모범답안
//		//아래 것도 가능한데
//		for(int i=5; i>=1; i--) {
//			System.out.println(i);
//		}
//		//아래도 가능하다.
//		for(int i=0;i<5;i++) {
//			System.out.println(5-i);
//		}
		System.out.printf("\n\n");

/////////////////////////////////////////////////////////////////		
		// 실습4.
		// 사용자에게 횟수를 입력받고
		// 해당 횟수만큼 반복하세요 hello 출력

		// 입력예시 >> 몇 번 반복할까요? 2
		// 출력예시
		// hello
		// hello

		Scanner sc = new Scanner(System.in);
		int num=0;
		
		System.out.println("몇 번 반복할까요?");
		num = sc.nextInt();
		
		for(int i=0; i<num;i++) {
			System.out.print("hello ");
		}

		// 모범답안
		// ctrl + shift + o
//		Scanner sc = new Scanner(System.in);
//		int num1=0;
//		System.out.println("몇 번 반복할까요?");
//		num1 = sc.nextInt();
//		
//		for(int i=0; i<num1;i++) {
//			System.out.println("hello");
//		}
////		
////		//이것도 가능
////		for(int i=1; i<=num1; i++) {
////			System.out.println("hello");
////		}

		System.out.printf("\n\n");

/////////////////////////////////////////////////////////////////		
		// 실습5.
		// 사용자로부터 정수를 입력받고
		// 1부터 입력한 정수까지의 홀수 합계 구하기

		// 입력예시
		// 1부터 몇까지 홀수의 합계를 구할까요? >> 5

		// 출력예시
		// 9입니다

//		Scanner sc = new Scanner(System.in);
//		int num=0;
//		int sum=0;
//		
//		System.out.println("1부터 몇까지 홀수의 합계를 구할까요?");
//		num=sc.nextInt();
//		for(int i=1; i<=num; i+=2) {
//			sum+=i;
//		}
//		System.out.println(sum + "입니다");

		// 모범답안
//		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		int sum1=0, sum2=0;
		System.out.println("1부터 몇까지 홀수의 합계를 구할까요?");
		num1 = sc.nextInt();
		
		//num이 5라면 총 5번 반복
		for(int i=1; i<=num1; i++) {
			//홀수인 경우에만 누적
			if(i%2 != 0) {
				sum1 +=i;
			}
		}
		System.out.println("1 합계는 "+ sum1 + " 입니다");
		
		//num이 5라면 총 3번 반복
		for(int i=1; i<=num1; i+=2) {
			sum2 +=i;
		}
		System.out.println("2 합계는 "+ sum2 + " 입니다");

		sc.close();
	}

}
