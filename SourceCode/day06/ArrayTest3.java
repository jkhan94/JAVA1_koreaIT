package day06;

import java.util.Iterator;
import java.util.Scanner;

public class ArrayTest3 {

	public static void main(String[] args) {

		// 실습1.
		// 3명의 나이를 입력받아 배열에 저장하고 출력
		// 평균 나이와 합계 나이를 출력
//		Scanner sc = new Scanner(System.in);
//		int[] ageAr = new int[3];
//		int avgAge = 0;
//		int sumAge = 0;
//		
//		for (int i = 0; i < ageAr.length; i++) {
//			System.out.println("나이를 입력하세요");
//			ageAr[i] = sc.nextInt();			
//		}
//		
//		for (int i = 0; i < ageAr.length; i++) {
//			sumAge +=ageAr[i];
//			System.out.println(ageAr[i]);
//		}
//		avgAge = sumAge/3;
//		System.out.println(sumAge);
//		System.out.println(avgAge);

		// 모범답안
		Scanner sc = new Scanner(System.in);
		int[] person = new int[3];
		int age = 0;
		int total = 0;
		// 평균은 나누므로 소수가 나올 수 있다.
		double avg = 0.0;

		for (int i = 0; i < person.length; i++) {
			System.out.println("나이를 입력하세요");
			age = sc.nextInt();
			person[i] = age;
			// 합계 나이 구하기
			total += age;
			// 배열 값 출력
//			System.out.println(person[i]);
		}

		// total, person.length는 int라서 double로 형변환이 필요하다.
//		avg = 1.0 * total / person.length;
		avg = (double) total / person.length;

		System.out.println("합계 나이 = " + total + "살");
		System.out.println("평균 나이 = " + avg + "살");
		System.out.println();

/////////////////////////////////////////////////////////////////////////
		// 실습2.
		// 3개의 양의 정수를 입력받고 배열에 저장한 뒤 출력
		// 최대값과 최소값을 구하고 출력
//		Scanner sc = new Scanner(System.in);
//		int[] numAr = new int[3];
//		int max=0;
//		int min=0;
//		
//		for (int i = 0; i < numAr.length; i++) {
//			System.out.println("양의 정수를 입력하세요");
//			numAr[i]=sc.nextInt();
//			System.out.println(numAr[i]);
//		}
//		
//		max=numAr[0];
//		min=numAr[0];
//		
//		for (int i = 0; i < numAr.length; i++) {
//			if(max<numAr[i]) {
//				max=numAr[i];
//			}
//			
//			if(min>numAr[i]) {
//				min=numAr[i];
//			}
//		}
//		
//		System.out.println("최대값은 "+max);
//		System.out.println("최소값은 "+min);

		// 모범답안
//		Scanner sc = new Scanner(System.in);
		int[] ar = new int[3];
		int num = 0;
		
		for (int i = 0; i < ar.length; i++) {
			System.out.println("양의 정수를 입력하세요");
			num = sc.nextInt();
			ar[i] = num;
		}
		
		int max = ar[0];
		int min = ar[0];
		
		// min, max 모두 검사시켜도 되지만 max에 해당되면 min은 검사할 필요가 없다.
		// 따라서 else if 활용하여 연산을 줄이는 게 낫다.
		for (int i = 0; i < ar.length; i++) {
			if(ar[i] >= max) {
				max=ar[i];
			}else if(ar[i] <= min) {
				min = ar[i];
			}
			
//			System.out.println(ar[i]);
		}
		
		System.out.println("최대값 = "+max);
		System.out.println("최소값 = "+min);

		sc.close();
	}

}
