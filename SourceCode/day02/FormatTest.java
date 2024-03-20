package day02;

public class FormatTest {

	public static void main(String[] args) {
		
		String weather = "Sunny";
		int month = 12;
		int date = 4;
		double max = 0.7;
		double min = 6.3;
		
		System.out.printf("오늘은 %d월 %d일 입니다.\n",month,date);
		System.out.printf("오늘은 %d월 %d일 입니다.",12,4);
		
		// 실수
		// 소수점 자리를 지정해서 출력하면 반올림하고 출력이 진행된다
		System.out.printf("오늘의 최고 기온은 %f도 입니다.\n",max);
		System.out.printf("오늘의 최고 기온은 %.2f도 입니다.\n",max); //소수점 아래 둘째 자리까지만 출력
		
		// 정수
		System.out.printf("코카콜라의 가격은 %5d원 입니다.\n",5); // 5를 다섯칸 차지한다.
		System.out.printf("코카콜라의 가격은 %-5d원 입니다.\n",5); //-는 오른쪽에 여백을 둔다
		System.out.printf("코카콜라의 가격은 %05d원 입니다.\n",5); //여백에 0을 넣는다
		
		// 문자열
		// 글자도 잘라서 출력 가능하다.
		String menu = "펩시콜라";
		System.out.printf("%.2s의 가격은 1000원 입니다.\n",menu);
		System.out.printf("%.2s의 가격은 1000원 입니다.\n","코카콜라");
		System.out.printf("테스트 %s 입니다.\n",Math.PI); // %s는 다른 자료형도 출력 가능.

		//실습1.
		//아래의 코드를 완성해서 오늘은 월요일입니다 날씨는 맑음 출력하기
		System.out.printf("오늘은 %c요일 입니다. 날씨는 %s.\n",'월',"맑음");
	
		char day = '월';
		String weather2 = "Sunny";
		System.out.printf("오늘은 %c요일 입니다. 날씨는 %s.\n",day,weather2);
		
		
		// Self
		System.out.printf("16진수 %x.\n",10); // 10을 10진수로 인식
//		char hextest = 'a';
//		System.out.printf("%x.\n",hextest); // 문자를 16진수로 출력하진 못 하는 듯.
		int num3 = 10; // 10진수
		int bnum = 0B1010; // 2진수
		int onum= 012; // 8진수
		int xnum = 0XA; //16진수
		System.out.printf("%d %d %o %x",num3, bnum, onum, xnum);
	}

}
