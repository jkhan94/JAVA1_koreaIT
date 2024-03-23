package day07;

import java.util.Scanner;

public class MethodTest2 {

	// 실습1.
	// 사용자에게 정수를 입력받고 1부터 정수까지 3의 배수의 개수를 출력한다.
	// 매개변수O ,리턴값X
	void threeMultiples(int num) {
		int count = 0;
		for (int i = 1; i <= num; i++) {
			if (i % 3 == 0) {
				count++;
			}
		}
		System.out.println("3의 배수는 " + count + " 개 입니다.");
	}

	// 모범답안
	static void getThreeMultiples(int num) {
		System.out.println("3의 배수는 " + (num / 3) + " 개 있습니다.");
	}

/////////////////////////////////////////////////////////////////
	// 실습2.
	// 1부터 100까지 중에서 짝수의 합계를 반환하다.
	// 매개변수X ,리턴값O
	int evenSum() {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0)
				sum += i;
		}
		return sum;
	}

	// 모범답안
	static int getEvenSum() {
		int total = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0)
				total += i;
		}
		return total;
	}

/////////////////////////////////////////////////////////////////
	// 실습3.
	// 사용자에게 아이디와 비밀번호를 입력받고 기존의 정보와 동일 여부를 반환한다.
	// 기존 아이디: minmin 기존 비밀번호: min1234
	// 매개변수O ,리턴값O
	boolean idMatch(String id, String password) {
		String usedID = "minmin";
		String usedPW = "min1234";
		return (id.equals(usedID) && password.equals(usedPW));
	}

	// 모범답안
	static boolean login(String id, String pw) {
		String userID = "minmin";
		String userPw = "min1234";
		boolean check = false;
		if (id.equals(userID)) {
			check = pw.equals(userPw) ? true : false;
		}
		return check;
	}

/////////////////////////////////////////////////////////////////
	// 실습4.
	// 사용자에게 월을 입력받고 해당 월의 마지막 일을 출력한다.
	// 2월은 28일 / 4,6,9,11월 은 30일, 나머지는 31일
	// 매개변수O ,리턴값X
	void lastDate(int month) {
		switch (month) {
		case 2:
			System.out.println(month + "월의 마지막 일은 28일입니다.");
			break;
		// @formatter:off
		case 4: case 6: case 9: case 11:
		// @formatter:on	
			System.out.println(month + "월의 마지막 일은 30일입니다.");
			break;
		default:
			System.out.println(month + "월의 마지막 일은 31일입니다.");
			break;
		}
	}

	// 모범답안
	static void getLastDate(int month) {
		switch (month) {
		case 2:
			System.out.println(month + "월의 마지막 일은 28일입니다.");
			break;
		// @formatter:off
		case 4: case 6: case 9: case 11:
		// @formatter:on	
			System.out.println(month + "월의 마지막 일은 30일입니다.");
			break;
		default:
			System.out.println(month + "월의 마지막 일은 31일입니다.");
			break;
		}
	}

/////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////
	public static void main(String[] args) {

		// 실습1.
		// 사용자에게 정수를 입력받고 1부터 정수까지 3의 배수의 개수를 출력한다.
		// 매개변수O ,리턴값X
		MethodTest2 m = new MethodTest2();
		Scanner sc = new Scanner(System.in);
		int num = 0;
		System.out.println("정수를 입력하세요");
		num = sc.nextInt();

		m.threeMultiples(num);

		// 모범답안
		MethodTest2.getThreeMultiples(num);

		System.out.println();
/////////////////////////////////////////////////////////////////
		// 실습2.
		// 1부터 100까지 중에서 짝수의 합계를 반환하다.
		// 매개변수X ,리턴값O
		System.out.println(m.evenSum());

		// 모범답안
		System.out.println(MethodTest2.getEvenSum());

		System.out.println();
/////////////////////////////////////////////////////////////////
		// 실습3.
		// 사용자에게 아이디와 비밀번호를 입력받고 기존의 정보와 동일 여부를 반환한다.
		// 기존 아이디: minmin 기존 비밀번호: min1234
		// 매개변수O ,리턴값O
		String id = null;
		String pw = null;

		System.out.println("아이디를 입력하세요");
		id = sc.next();
		System.out.println("비밀번호를 입력하세요");
		pw = sc.next();
		
		System.out.println(m.idMatch(id, pw));

		// 모범답안
		System.out.println(MethodTest2.login(id, pw));

		System.out.println();
/////////////////////////////////////////////////////////////////
		// 실습4.
		// 사용자에게 월을 입력받고 해당 월의 마지막 일을 출력한다.
		// 2월은 28일 / 4,6,9,11월 은 30일, 나머지는 31일
		// 매개변수O ,리턴값X
		int month = 0;
		System.out.println("월을 입력하세요");
		month = sc.nextInt();
		
		m.lastDate(month);
		
		// 모범답안
		MethodTest2.getLastDate(month);
	}

}
