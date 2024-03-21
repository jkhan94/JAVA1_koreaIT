package day03;

public class Oper2 {

	public static void main(String[] args) {
		
		//관계 연산자
		System.out.println("관계 연산자");
		System.out.println(1 == 3);
		System.out.println(1 != 3);
		System.out.println(1 > 3);
		System.out.println(1 >= 3);
		System.out.println();
		
		//문자열은 문자열.equals() 메소드를 사용한다. 관계연산자 안 쓴다.
		//같지 않다는 문자열 비교 메소드는 없다.
		System.out.println("문자열.equals() 메소드");
//		System.out.println("ABC" == "ABC"); 
		System.out.println("ABC".equals("ABC")); 
		System.out.println(!("ABC".equals("ABC"))); 
		System.out.println();
		
		
		//논리 연산자
		System.out.println("논리 연산자 && ||");
		System.out.println(true && false);
		System.out.println(true || false);
		
		System.out.println(1==3 && 1==4); //무의미한 코드라서 노란줄.
		System.out.println(1==3 || 1==1);
		
		// 10 < 20 < 30
//		System.out.println(10 < 20 < 30);
		System.out.println(10 < 20 && 20 < 30);

	}

}
