package day02;

public class EscapeStringTest {

	public static void main(String[] args) {
		System.out.println("줄바꿈 \n연습");
		System.out.println("\t탭 연습");
		System.out.println("     탭 연습\t"); // 띄어쓰기 5칸
		System.out.println("\"아버지가 말씀하셨다\"");
		System.out.println("\'이것\'을 강조\\");
		
		
		//실습1. 문자열을 수정하여 실행결과처럼 출력하기
		System.out.print("봄여름가을겨울\n");		
		//실행결과:
		//봄
		//	여름
		//가을
		//	겨울
		System.out.print("봄\n\t여름\n가을\n\t겨울\n"); // 줄바꿔 줌.
		System.out.print("봄\t\t여름\t가을\t\t겨울"); // 탭만 함.

	}

}
