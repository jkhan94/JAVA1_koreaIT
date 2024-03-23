package day08;

public class Flight {

// 실습1. 비행기 클래스 만들기(Flight)
// 필드(좌석수, 직항여부, 출발국가, 도착국가, 운행회사)
// 필드(seats, isDirect, fromCountry, toCountry, company)
// 메소드 depart() 비행기가 출발합니다 출력
// 메소드 arrive() 비행기가 도착합니다 출력

// 필드
	// 비행기마다 필드값이 달라진다.
	// 따라서 객체를 생성할 때 결정해야 한다.
	int seats;
	boolean isDirect;
	String fromCountry;
	String toCountry;
	String company;

// 메소드
	void depart() {
		System.out.println("비행기가 출발합니다");
		// age는 사용되지 않고 버려진다.
//		int age = 10;
	}

	void arrive() {
		System.out.println(company + " 비행기가 도착합니다");

//		// 다른 메소드에서 선언한 변수는 사용하지 못 한다.
//		// 따라서 다른 값을 넣어서 사용해도 영향이 없다.
//		int age = 20;
//		System.out.println(age);
//
//		// 같은 클래스에서 선언된 필드는 갖다 쓸 수 있다
//		System.out.println(company);
	}

///////////////////////////////////////////////////////////////
// 실습2.
// 생성자 오버로딩
// 1.company, seats를 초기화하는 생성자
// 2.모든 필드를 초기화하는 생성자
// 3.위의 코드는 수정하지 않는다.

//	public Flight() {
//		;
//	}
//
//	Flight(int seats, String company) {
//		this.seats = seats;
//		this.company = company;
//	}
//
//	Flight(int seats, boolean isDirect, String fromCountry, String toCountry, String company) {
//		this(seats, company);
//		this.isDirect = isDirect;
//		this.fromCountry = fromCountry;
//		this.toCountry = toCountry;
//	}

	// 모범답안
	public Flight() {
		;
	}
	
	Flight(String company, int seats) {
		this.company = company;
		this.seats = seats;
	}

	public Flight(int seats, boolean isDirect, String fromCountry, String toCountry, String company) {
		super();
		this.seats = seats;
		this.isDirect = isDirect;
		this.fromCountry = fromCountry;
		this.toCountry = toCountry;
		this.company = company;
	}

	public Flight(int seats, boolean isDirect, String company) {
		this(company, seats);
		this.isDirect = isDirect;
	}

}
