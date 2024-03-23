package day08;

public class MethodTest {
	
	static void printData(int num){
		System.out.println(num);
	}
	
	void printData(double num) {
		System.out.println(num);
	}
	
	void printData(String msg) {
		System.out.println(msg);
	}
	
	void printData(int num1, int num2){
		System.out.println(num1);
		System.out.println(num2);
	}
	
	// 리턴타입은 메소드 오버로딩에 영향을 주지 않는다.
//	void printData(int num){
//		System.out.println(num);
//	}
	
////////////////////////////////////////////
	public static void main(String[] args) {
		
		// 함수 오버로딩 연습
		MethodTest m = new MethodTest();
		m.printData(1.1);
		m.printData("hello");
		m.printData(1, 2);
		// static method를 인스턴스 메소드로 호출해서 경고 뜨는 듯.
//		m.printData(4);
		System.out.println();
		
		MethodTest.printData(4);
		
	}

}
