package day05;

public class ForTest3 {

	public static void main(String[] args) {

		// 기타 제어문
		// break : 즉시 해당 중괄호 영역을 탈출
		// continue : 즉시 다음 반복 실행(건너띄기)

		// break문
		for (int i = 0; i < 5; i++) {
			System.out.print(i+" ");//			
			//0 출력 후 탈출
//			break;
			
			//출력 후 멈추는 거라 0 1 2 3 출력
			if(i==3) {
				break;
			}
		}
		System.out.println();
		
		//멈춘 후 출력이라서 0 1 2 출력
		for (int i = 0; i < 5; i++) {
			if(i==3) {
				break;
			}
			System.out.print(i+" ");
		}
		System.out.print("\n\n");
		
		// continue문
		// 아래에 있는 코드를 실행하지 않는다.
		// 출력 후 건너띄어서 의미 0 1 2 3 4 출력
		for (int i = 0; i < 5; i++) {
			System.out.print(i+" ");
			if (i == 2) {
				continue;
				// 아래에 코드가 없다.
			}
		}
		System.out.println();

		// 출력 전에 건너띄어서 0 1 3 4 출력
		for (int i = 0; i < 5; i++) {
			if (i == 2) {
				continue;
			}
			System.out.print(i+" ");
		}
		System.out.print("\n\n");
		
///////////////////////////////////////////////////////////////////////////
		//실습1.
		//1부터 10까지 중에서 5까지만 출력
		for (int i = 1; i <= 10; i++) {
			if(i==6) {
				break;
			}
			System.out.print(i+" ");						
		}
		System.out.println();
		
		for (int i = 1; i <= 10; i++) {
			System.out.print(i+" ");	
			if(i==5) {
				break;
			}								
		}
		System.out.print("\n\n");
		
		//모범답안
//		for (int i = 1; i < 11; i++) {
//			System.out.println(i);
//			if(i==5) {
//				break;
//			}
//		}
//		
//		for (int i = 1; i < 11; i++) {
//			if(i==6) {
//				break;
//			}
//			System.out.println(i);						
//		}
		
		
///////////////////////////////////////////////////////////////////////////		
		//실습2.
		//1부터 10까지 중에서 5를 제외하고 출력
		for (int i = 1; i < 11; i++) {
			if(i==5) {
				continue;
			}
			System.out.print(i+" ");			
		}
		
		//모범답안
//		for (int i = 1; i < 11; i++) {
//			if(i==5) {
//				continue;
//			}
//			System.out.println(i);			
//		}

	}

}
