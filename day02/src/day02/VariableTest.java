package day02;

public class VariableTest {

	public static void main(String[] args) {
// 각각의 자료형을 가지고 변수를 선언하기
// 자료형 변수명 = 초기값; 왼쪽에 오른쪽을 대입. 같다가 아니다.

		int a = 10; // 이런 식으로 쓰면 10이 들어가는 건 아는데 어디에 쓰는 지 알 수 없음.
		long b = 10L;
		double c = 10.7;
		float d = 10.7F;
		char e = 'A';
		boolean f = true, t = false;
		String g = "min";

		System.out.println(a);
		System.out.println(f);
		System.out.println(t);
		System.out.println(g);

		// 변수 여러 개 선언 및 초기화
		int aa, bb;
		aa = bb = 10;

		// 변수 여러 개 선언과 동시에 초기화
		int cc = 3, dd = 4;
		System.out.println(cc);
		System.out.println(dd);

//잘못된 변수 선언		
//		int age! = 10;
//		int my name = 10;
//		int age1 = 10;
//		int 1age = 10;
//		int 나이 = 13;

		
// 실습1. 변수명 짓기
// 주어진 값과 자료형을 가지고 선언과 동시에 초기화		
//	오늘의 날짜 4 int
//	키 180.6 double
//	몸무게 30.5 float	
//	지하철역 역삼역 String
//	대면 비대면 여부 true boolean
//	성별 F char

		int date = 4; // today
		double height = 180.6;
		float weight = 30.5F; // 30.5f도 가능
		String SubwayStation = "역삼역"; // station //String은 클래스명
		boolean InPerson = true; // zoom
		char gender = 'F';

//변수의 사용
		int data = 20;
		System.out.println(data + 7);
		data = data + 17;
		System.out.println(data);
		
//Self	
		System.out.println(Math.PI);
	}

}
