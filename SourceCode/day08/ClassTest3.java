package day08;

//public class MyClass로 선언하면 에러
//public class는 파일당 한 개만 선언 가능하며 파일명=클래스명이어야 함.
class MyClass {

	// 인스턴스 변수(필드)
	int data;

	// static 변수(필드)
	// 모든 객체들의 data2 = 50
	static int data2 = 50;

	// 인스턴스 메소드
	void printData() {
		System.out.println(data);
	}

	// static 메소드
	static void printData2() {
		// static 메소드는 인스턴스 변수를 사용하지 못한다
//		System.out.println(data);
		System.out.println(data2);
	}

}

// public class는 main 클래스란 뜻.
// 소스파일명과 클래스명이 일치해야 한다.
public class ClassTest3 {

	public static void main(String[] args) {

		// 인스턴스 변수 사용
		// 객체화
		MyClass mc = new MyClass();
		System.out.println(mc.data);

		// static 변수 사용
		// static 필드와 메소듣 이탤릭체
		System.out.println(MyClass.data2);
		System.out.println();

		// 인스턴스 메소드 사용
		mc.printData();

		// static 메소드 사용
		MyClass.printData2();
		System.out.println();

		mc.data = 10;
		mc.printData();
		MyClass.data2 = 10;
		MyClass.printData2();

	}

}
