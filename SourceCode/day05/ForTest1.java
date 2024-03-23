package day05;

public class ForTest1 {

	public static void main(String[] args) {

		for(int i=0; i<5; i++) {
			System.out.println("hello");
			System.out.println(i + "번째 출력");
			
			//Self
			System.out.printf("%d.hello\n",i);
			System.out.println((i+1)+".hello");
		}
		System.out.println();
		
//		//변수 i는 for문 영역에서만 사용 가능
//		//System.out.println(i);
//		
//		for(int i=10; i>0; i--) {
//			System.out.println(i + "번째 출력");
//		}
		
		//증감식에 복합대입연산자 사용
		//조건문과 반복문을 같이 쓸 수 있다. = 조건문과 같이 사용 가능하다.
		for(int i=0; i<10; i+=2) {
			System.out.println(i+"번째 출력");	
			if(i==0) {
				System.out.println("시작입니다");
			}
		}
		
			
	}

}
