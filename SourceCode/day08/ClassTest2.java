package day08;

public class ClassTest2 {

	public static void main(String[] args) {

		// 실습1. 비행기 클래스 만들기(Flight)
		// 필드(좌석수, 직항여부, 출발 국가, 도착국가, 운행회사)
		// 필드(seats, isDirect, flightromCountry, toCountry, company)
		// 메소드 depart() 비행기가 출발합니다 출력
		// 메소드 arrive() 비행기가 도착합니다 출력

		Flight flight = new Flight();
		System.out.println(flight.seats);
		System.out.println(flight.isDirect);
		System.out.println(flight.fromCountry);
		System.out.println(flight.toCountry);
		System.out.println(flight.company);

		flight.depart();
		flight.arrive();

		flight.company = "대한항공";
		System.out.println(flight.company);
		System.out.println();

///////////////////////////////////////////////////////////////
		// 실습2.
		// 생성자 오버로딩
		// 1.company, seats를 초기화하는 생성자
		// 2.모든 필드를 초기화하는 생성자
		// 3.위의 코드는 수정하지 않는다.

		// 1.
		Flight flight2 = new Flight("항공사2", 100);
		System.out.println(flight2.seats);
		System.out.println(flight2.company);
		// 모범답안
		Flight flight4 = new Flight("아시아나 항공", 50);
		flight4.arrive();
		flight4.depart();
		System.out.println();

		// 2.
		Flight flight3 = new Flight(150, true, "출발", "도착", "항공사3");
		System.out.println(flight3.seats);
		System.out.println(flight3.isDirect);
		System.out.println(flight3.fromCountry);
		System.out.println(flight3.toCountry);
		System.out.println(flight3.company);
		// 모범답안
		Flight flight5 = new Flight(30, false, "대한민국", "영국","서울항공");
		flight5.arrive();
		flight5.depart();
		

	}

}
