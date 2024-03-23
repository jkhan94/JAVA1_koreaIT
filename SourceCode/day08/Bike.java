package day08;

public class Bike {

// 필드
	String color;
	int price;
	int wheel;
	boolean isBell;

// 메소드
	void move() {
		System.out.println("자전거를 움직입니다.");
	}

	void stop() {
		System.out.println("자전거를 멈춤니다.");
	}

// 생성자를 여러 개 선언할 수 있다.
// 원하는 생성자를 사용하여 객체를 생성할 수 있다.
	
// 마우스로 생성자 만들기
// Source > Generate constructor using Fields >
// 사용할 매개 변수 선택 > Generate

// 생성자 단축키
// alt + shift + s + o
// 메뉴에서 언더바 되어 있는 부분이 단축키 경로.
////////////////////////////////////////////////////////////
	// 기본 생성자
	// ctrl + space를 누르면 기본 생성자를 선택할 수 있다.
	// 중괄호 안에 ; 넣어두면({;}) 수정하지 말란 뜻.
//	Bike() {
//		System.out.println("생성자1 호출");
//	}	

	public Bike() {
		;
	}

////////////////////////////////////////////////////////////	
	// 사용자 정의 생성자
	// 초기값을 매개변수로 받는 생성자
	Bike(String color, int price, int wheel, boolean isBell) {

		// 생성자3과 코드가 동일하다.
		// 코드를 중복 작성하지 말고 해당 생성자의 매개변수를 받는 this()를 사용
		// 이렇게 되면 생성자3이 일을 함.
		// this()는 생성자를 의미.
		this(color, price);
//		this.color = color;
//		this.price = price;

		// 매개변수명을 c, p, w, isB로 적으면 문제가 없다.
		// 그러나 이렇게 작성하명 각 변수가 뭔지 한 눈에 파악하기 어렵다.
		// 또 필드명=매개변수명일 경우 구분할 수 없다.
		// 따라서 필드명 앞에 this.를 붙인다.
		this.wheel = wheel;
		this.isBell = isBell;
		System.out.println("생성자2 호출");
	}

////////////////////////////////////////////////////////////	
	public Bike(String color, int price) {
		super();
		this.color = color;
		this.price = price;
		System.out.println("생성자3 호출");
	}

}
