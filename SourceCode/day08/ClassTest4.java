package day08;

//리턴타입 메소드명(자료형 매개변수명) {
// 실행할 코드 }
// 리턴타입 매개변수 자료형에 클래스, 배열도 사용 가능
class User {

	int data;

/////////////////////////////////////////////////////////////
	// 정수형 매개변수
	void printData(int num) {
		System.out.println(num);
	}

	// 배열 매개변수
	void printData(int[] ar) {
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
		System.out.println();
	}

	// 클래스 매개변수
	void printData(User user) {
		System.out.println(user.data);
	}

/////////////////////////////////////////////////////////////
	// 정수형 리턴
	int changeData(int num) {
		return num = 10;
	}

	// 배열 리턴
	int[] changeData(int[] ar) {
		for (int i = 0; i < ar.length; i++) {
			ar[i] = 20;
		}
		return ar;
	}

	// 클래스 리턴
	User changeDtata(User user) {
		user.data = 300;
		return user;
	}
}

/////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////
public class ClassTest4 {

	public static void main(String[] args) {

		int num = 7;
		int[] ar = new int[3];
		// 클래스 객체화. 클래스 객체 user 생성
		User user = new User();

//		// ar 주소 확인
//		System.out.println("ar의 주소 : " + ar);

		// user 메소드 실행
		user.printData(num);
		user.printData(ar);
		user.printData(user);
		System.out.println();

//////////////////////////////////////////////////////				
		int changeNum = user.changeData(num);
		System.out.println(changeNum);

		// ar이 가리키는 배열의 원소를 전부 20으로 바꾸고 ar 리턴.
		// ar의 값은 주소. 이 주소를 changeAr에 저장.
		// 따라서 changeAr과 ar은 동일한 주소값을 가리킨다.
		int[] changeAr = user.changeData(ar);
//		// changeAr 주소 확인
//		System.out.println("changeAr의 주소 : " + changeAr);
		for (int i = 0; i < changeAr.length; i++) {
			System.out.print(changeAr[i] + " ");
		}
		System.out.println();

		User changeUser = user.changeDtata(user);
		System.out.println(changeUser.data);
		System.out.println();

//////////////////////////////////////////////////////
		// 기본형 매개변수(int, char..)는 메모리 영역에 값이 있다.
		// 배열, 클래스는 주소값이 있다.
		// changeAr, ar은 같은 주소값을 가진다.
		// 따라서 changeAr을 바꾸면 ar도 바뀌게 된다.
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
		System.out.println();
		
//		// changeAr, ar 주소 확인
		System.out.println("ar의 주소 : " + ar);
		System.out.println("changeAr의 주소 : " + changeAr);
		if (changeAr == ar)
			System.out.println("chnageAr, ar의 주소가 같다");
		else
			System.out.println("chnageAr, ar의 주소가 다르다");

	}

}
