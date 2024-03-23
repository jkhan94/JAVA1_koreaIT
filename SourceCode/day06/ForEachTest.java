package day06;

import java.util.Scanner;

public class ForEachTest {
	public static void main(String[] args) {

		int[] ar = { 1, 2, 3, 4, 5 };

		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
		System.out.println();

		// ar의 값을 하나씩 꺼내 num에 대입.
		for (int num : ar) {
			System.out.print(num + " ");
		}
		System.out.print("\n\n");

////////////////////////////////////////////////////////////////////		
		// 실습1.
		// 아이디 중복 체크
		// 사용자에게 아이디를 입력받고 중복체크 하기
		// 중복 아이디일 경우 중복된 아이디입니다 출력
		// 중복 아닐 경우 사용 가능한 아이디입니다. 출력
		// 결과 출력은 1번만 된다.
		String[] userList = { "kim1234", "seo1234", "hong1234" };

//		Scanner sc = new Scanner(System.in);
//		String inID = null;
//		String msg = null;
//
//		System.out.println("아이디를 입력하세요");
//		inID = sc.next();
//
//		// 마지막 인덱스의 값을 제외하면 전부 사용 가능으로 뜸.
//		// 왜냐하면 인덱스1 값을 비교 후 중복된 아이디로 판별해도
//		// 인덱스2의 값과 비교한 뒤에는 사용가능한 아이디가 되기 때문.
//		// 고로 잘못 짠 코드.
//		for (String usedID : userList) {
//			if (inID.equals(usedID)) {
//				msg = "중복된 아이디입니다.";
//			} else if (!(inID.equals(usedID))) {
//				msg = "사용 가능한 아이디입니다.";
//			}
//		}
//		System.out.println(msg);

		// 모범답안
		Scanner sc = new Scanner(System.in);
		String id = null;
		String result = "사용 가능한 아이디입니다";

		System.out.println("아이디를 입력하세요");
		id = sc.next();

		for (String userID : userList) {
			if (userID.equals(id)) {
				result = "중복된 아이디입니다.";
			}
		}
		System.out.println(result);
		sc.close();

	}

}
