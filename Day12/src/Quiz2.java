
/**
 * DP ( Dynamic Programming ) 동적 계획법 - 색칠 , 동전 거스름돈 , 배낭 채우기
 *
 */
public class Quiz2 {
	public static void main(String[] args) {
//		 피보나치 수열 1 1 2 3 5 8 13 21 34 .... 
//		 1. 재귀함수 장점 : 코드구현은 매우 간단
//					 단점 : 중복호출이 많이 발생 , 속도가 느림
//		 2. 재귀 함수 + 메모이제이션
//					 장점 : 코드 구현은 매우 간단
//					 단점 : 연산의 횟수는 많이 줄었지만 , 중복 호출 발생
//		 3. DP
		
		int f[] = new int[14];
		f[1] = 1; // 씨드값 채우기
		f[2] = 1; // 
		
		// 점화식 : 이전 차수와의 관계식 f(n) = f(n-1) + f(n-2)
		
		for (int i = 3; i <= 13; i++) {
			f[i] = f[i-1] + f[i-2];
		}
		
		System.out.println(f[13]);
		
	} // end of main
} // end of class
