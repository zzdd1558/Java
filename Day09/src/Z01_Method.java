
/**
 * @author yunjin 재귀 함수 - 자신의 함수내에서 자신의 함수를 또 호출하는 함수
 * 재귀 함수와 반복문의 비교
 *     재귀 함수 : 설계가 쉽다 ( 이전 차수와의 관계식 : 점화식 )
 *     		반복문으로 구현할 수 없는 동적인 코드를 소화할 수 있다.
 * 			callStack 에  함수가 쌓이기 때문에 , 메모리를 많이 점유하고(stackOverFlow 발생할수도 있다), 속도가 느림
 *     반복문 : cpu만 점유하기 때문에 속도가 빠르다.
 *     		재귀함수, 반복무 두가지 다 구현가능하면 , 반복문으로 처리하는것이 좋다
 *     		반복문으로 처리 불가능한 코드는 재귀함수를 써야만 한다.
 * 
 */
public class Z01_Method {
	public static void main(String[] args) {
		AAA a = new AAA();
//		a.p(0, 5);
//		a.r(5, 1);
//
//		// 5! 반복적으로 출력
//		int num = a.f(5);
//		System.out.println("5!의 값 : " + num);
//
//		
//		/***************************************/
//		//for문을 이용한 부분집합. 일단 0 , 1 만있다는가정하에 코드를 작성함.
		int b[] = { 0, 1, 2, 3 };
//		//반복문 => 원소의 개수에 따라 for 중첩수가 결정.
//		for (int i = 0; i < 2; i++) { // 0 , 1
//			for (int j = 0; j < 2; j++) {// 0 , 1
//				for (int l = 0; l < 2; l++) {
//					for (int k = 0; k < 2; k++) {
//						if(i==1)System.out.print(b[0]);
//						else	System.out.print(" ");
//						if(j==1)System.out.print(b[1]);
//						else	System.out.print(" ");
//						if(k==1)System.out.print(b[2]);
//						else	System.out.print(" ");
//						if(l==1)System.out.print(b[3]);
//						else	System.out.print(" ");
//						System.out.println();
//					}
//				}
//			}
//		}
		
		/***************************************/
		
		int c[] = new int[b.length];
		a.s(b,c,0);
	} // end of main
} // end of class


class AAA {

	
	//b[] : 부분집합을 구할 배열,
	//c[] : b배열 원소의 사용 여부를 저장.
	//i : 현재 단계
	void s(int b[], int c[] , int i){ // 부분집합을 구하는 재귀함수.
		if (i == b.length) { // 종료파트
			//c 배열이 다 채워졌고 , c배열의 원소를 읽어서 1이면 b배열의 원소를 출력
			for (int j = 0; j < b.length; j++) {
				if(c[j] == 1) System.out.print(b[j]);
				else System.out.print(" ");
			}
			System.out.println();
			
		}else{ // 유도파트
			//b 배열 원소의 사용 여부를 저장할 c배열을 채우는 작업.
			c[i] = 0; // i 번째 원소를 사용 안함.
			s(b,c,i+1);
			c[i] = 1; // i 번째 원소를 사용 함.
			s(b,c,i+1);
		}
	}
	
	
	/*----------------------------*/
	
	
	int f(int i) {
		if (i < 1) {
			System.out.println("종료");
			return 1;
		} else {
			return f(i - 1) * i;
		}
	}

	void r(int i, int g) {
		if (i < g) {
			System.out.println("종료");
		} else {
			System.out.print(i + " ");
			r(i - 1, g);
		}
	}

	void p(int i, int g) { // 재귀 함수
		if (i == g) { // 조율 파트
			System.out.println("종료");
		} else { // 유도 파트 - 재귀적으로 자신을 호출
			System.out.print(i + " ");
			p(i + 1, g);
		}
	}

	void myP(int i) {
		if (i == 8) {
			System.out.println("종료");
		} else {
			System.out.println(i);
			myP(i + 1);
		}
	}
}