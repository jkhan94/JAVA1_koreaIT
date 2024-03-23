package day06;

public class ArrayTest2 {

	public static void main(String[] args) {

		// 실습1.
		// double 타입의 2칸짜리 배열 만들고 모든 칸 출력
		// char 타입의 5칸짜리 배열 만들고 모든 칸 출력
		// String 타입의 3칸짜리 배열 만들고 모든 칸 출력
		// boolean 타입의 2칸짜리 배열을 만들도 모든 칸 출력
		// int 타입 배열 (아직 칸과 값을 모른다) 만들기

//		double[] ar1 = new double[2];
//		for (int i = 0; i < ar1.length; i++) {
//			System.out.println(ar1[i]);
//		}
//		char[] ar2 = new char[5];
//		for (int i = 0; i < ar2.length; i++) {
//			System.out.println(ar2[i]);
//		}
//		String[] ar3 = new String[3];
//		for (int i = 0; i < ar3.length; i++) {
//			System.out.println(ar3[i]);
//		}
//		boolean[] ar4 = new boolean[2];
//		for (int i = 0; i < ar4.length; i++) {
//			System.out.println(ar4[i]);
//		}
//		int[] ar5 = null;

		// 모범답안
		double[] doubleAr = new double[2];
		for (int i = 0; i < doubleAr.length; i++) {
			System.out.println(doubleAr[i]);
		}

		char[] charAr = new char[5];
		for (int i = 0; i < charAr.length; i++) {
			System.out.println(charAr[i]);
		}

		String[] stringAr = new String[3];
		for (int i = 0; i < stringAr.length; i++) {
			System.out.println(stringAr[i]);
		}

		boolean[] boolAr = new boolean[2];
		for (int i = 0; i < boolAr.length; i++) {
			System.out.println(boolAr[i]);
		}

		int[] intAr = null;
		System.out.println();

///////////////////////////////////////////////////////////////////////////////////		
		// 실습2.
		// doubleAr -> 인덱스번호*10.0
		// charAr -> 'A' 5칸 모두
		// stringAr -> 인덱스번호를 문자열로
		// boolAr -> true
		// intAr -> 1부터 5까지
		// 값을 다 넣고 출력하기

		// 실습1에서 이미 생성한 배열들이므로 재선언은 필요 없다.
		// 그러나 실습1의 주석처리가 번거로우므로 배열을 재선언한다.
//		double[] ar1 = new double[2];
//		for (int i = 0; i < ar1.length; i++) {
//			ar1[i]=i*10.0;
//			System.out.println(ar1[i]);
//		}
//		char[] ar2 = new char[5];
//		for (int i = 0; i < ar2.length; i++) {
//			ar2[i]='A';
//			System.out.println(ar2[i]);
//		}
//		String[] ar3 = new String[3];
//		for (int i = 0; i < ar3.length; i++) {
//			ar3[i] = i+""; 
//			System.out.println(ar3[i]);
//		}
//		boolean[] ar4 = new boolean[2];
//		for (int i = 0; i < ar4.length; i++) {
//			ar4[i]=true;
//			System.out.println(ar4[i]);
//		}
//		int[] ar5 = null;
//		ar5=new int[5];
//		for (int i = 0; i < ar5.length; i++) {
//			ar5[i]=i+1;
//			System.out.println(ar5[i]);
//		}

		// 모범답안
		// 실습1에서 배열을 생성했기 때문에 다시 만들 필요는 없다.
		// 코드 실행 전에 실습1 주석해제
		for (int i = 0; i < doubleAr.length; i++) {
			doubleAr[i] = i * 10.0;
			System.out.println(doubleAr[i]);
		}

		for (int i = 0; i < charAr.length; i++) {
			charAr[i] = 'A';
			System.out.println(charAr[i]);
		}

		for (int i = 0; i < stringAr.length; i++) {
			stringAr[i] = i + "";
			System.out.println(stringAr[i]);
		}

		for (int i = 0; i < boolAr.length; i++) {
			boolAr[i] = true;
			System.out.println(boolAr[i]);
		}

		// 배열의 길이를 정해서 0으로 초기화.
		intAr = new int[5];
		for (int i = 0; i < intAr.length; i++) {
			intAr[i]=i+1;
			System.out.println(intAr[i]);
		}

		// null로 초기화하면 아래처럼 초기화해야 한다.
		// 하드 코딩.
		intAr = new int[] { 1, 2, 3, 4, 5 };
		for (int i = 0; i < intAr.length; i++) {
			System.out.println(intAr[i]);
		}

	}

}
