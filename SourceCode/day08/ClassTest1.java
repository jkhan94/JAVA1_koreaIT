package day08;

public class ClassTest1 {

	public static void main(String[] args) {

		// ctrl+클래스명 -> 해당 클래스의 코드로 이동
		
		// Bike 클래스 객체화
		// int age = 10;
		// 자료형 변수명 = 값;
		// Bike 객체 b를 힙 메모리에 생성
		// 생성자 Bike()가 해당 자료형의 초기값으로 필드를 자동 초기화	
		// 예) String -> null
		Bike b = new Bike();

		// 필드 호출
		// 생성자가 자동으로 초기화함.
		System.out.println(b.color);
		System.out.println(b.isBell);
		System.out.println(b.price);
		System.out.println(b.wheel);

		// 메소드 호출
		b.move();
		b.stop();

		b.color = "red";
		System.out.println(b.color);
		
		// 사용자 정의 생성자로 객체 생성
		Bike b2 = new Bike("blue", 130000, 2, true);
		System.out.println(b2.color);
		System.out.println(b2.isBell);
		System.out.println(b2.price);
		System.out.println(b2.wheel);
	}

}
