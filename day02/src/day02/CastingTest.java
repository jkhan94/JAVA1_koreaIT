package day02;

public class CastingTest {
	public static void main(String[] args) {
		
		// 정수 + 실수 = 실수
		System.out.println(3 + 3.0); // 자료형이 섞여있을 경우 큰 것에 맞춰서 출력
		
		// 문자 + 정수 = 정수
		System.out.println('a'+10); // a=97
		
		//문자열은 +가 연상이 아닌 연결이다.
		System.out.println("A"+10);
		
		// 자동 형변환
		// int 4바이트 - long, double 8바이트 
//		int intNum1 = 10L; // long이 커서 못 들어감
//		int intNum2 = 3.7; // double이 커서 못 들어감
//		int intNum3 = 3.7F; // 크기는 같지만 float는 int에 들어갈 수 없음
		int intNum4 = 'A'; // 아스키코드가 있어서 가능
//		int intNum5 = true; //boolean은 안 들어감. boolean은 형변환 안 됨.

		float intNum6 = 10L; // long으로 표시가능한 숫자가 float에 포함됨.
//		float intNum7 = 3.7; // double이 커서 못 들어감
		float intNum8 = 10; // int는 float에 들어갈 수 없음
		float intNum9 = 'A'; // 아스키코드가 있어서 가능
//		float intNum10 = true; 
		
		double intNum11 = 10L; // 크기 같은 정수라서 들어감
		double intNum12 = 10; // int 들어감
		double intNum13 = 3.7F; // float 들어감
		double intNum14 = 'A'; // 아스키코드가 있어서 가능
//		double intNum15 = true; 
		
		
		// 강제 형변환
		int intVar = 1;
		double doubleVar = 3.10;
		boolean boolVar = true;
		char charVar = 'A';
		
		System.out.println((double)intVar);
//		System.out.println((boolean)intVar);
		System.out.println((char)intVar); // 아스키코드 기준 SOH. 볼 수 없는 문자란 뜻의  출력
		
		System.out.println((int)doubleVar);
		System.out.println((char)doubleVar);
		System.out.println(doubleVar);
		
		System.out.println((int)charVar);
		System.out.println((double)charVar);
		
	}

}
