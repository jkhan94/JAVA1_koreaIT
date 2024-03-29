package day03;

public class CastingTest {

	public static void main(String[] args) {
		
		//문자열은 다른 자료형과 다르다.
		//문자열은 +가 연결. 연산 아님.
		System.out.println(3+5);
		System.out.println('3'+"5");
		
		//다른 자료형 문자열로 형변환
		String intStr = 10 + "";
		String longStr = 10L + "";
		String douStr = 10.7 + "";
		String floStr = 10.7F + "";
		String boolStr = true + "";
		String charStr = 'A' + "";
		
		System.out.println(intStr);
		System.out.println(longStr);
		System.out.println(douStr);
		System.out.println(floStr);
		System.out.println(boolStr);
		System.out.println(charStr);
		System.out.println();
		
		//문자열을 다른 자료형으로 형변환
		//변환할 수 있는 자료형을 넣어야 한다.
		int num = Integer.parseInt("117"); //정수형만 넣어야 한다.
		double num2 = Double.parseDouble("117.7");
		boolean bool = Boolean.parseBoolean("true"); //boolean만 넣어야 한다.
		char spell = "ABC".charAt(0); // 0이 첫번째.
		
		System.out.println(num);
		System.out.println(num2);
		System.out.println(bool);
		System.out.println(spell);
		System.out.println();
		
		//자동 형변환
		long longNum = 10;
		double douNum = 10;
		float floaNum = 10L;
		
		//작은 저장공간에 큰 값이 들어가지 못한다.
//		int intNum = 10.7;
		
		//강제 형변환
		int intVar = 1;
		double doubleVar = 3.10;
		boolean boolVar = true;
		char charVar = 'A';
		
		System.out.println((double)intVar);
//		System.out.println((boolean)intVar);
		System.out.println((char)intVar);
		
		System.out.println((int)doubleVar); //소수점 아래는 버림.
//		System.out.println((boolean)doubleVar);
		System.out.println((char)doubleVar);
		
		System.out.println((int)charVar);
		System.out.println((double)charVar);
//		System.out.println((boolean)charVar);

	}

}
