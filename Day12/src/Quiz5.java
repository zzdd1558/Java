
/**
 *  홈페이지 문제 Problem 116
 *  http://euler.synap.co.kr/prob_detail.php?id=116
 *
 */
public class Quiz5 {
	public static void main(String[] args) {
		 // 점화식 
//		빨강색 f(n) = f(n-1) + f(n-2)
//		초록색 g(n) = g(n-1) + g(n-3)
//		파란색 b(n) = b(n-1) + b(n-4)
		
		long f[] = new long[60];
		long g[] = new long[60];
		long b[] = new long[60];
		
		f[1] = 1; // 시드값 채우기
		f[2] = 2;
		
		g[1] = 1;
		g[2] = 1;
		g[3] = 2;
		
		b[1] = 1;
		b[2] = 1;
		b[3] = 1;
		b[4] = 2;
		
		
		for (int i = 3; i < f.length; i++) {
			f[i] = f[i-1] + f[i-2];
		}
		
		for (int i = 4; i < g.length; i++) {
			g[i] = g[i-1] + g[i-3];
		}
		
		for (int i = 5; i < b.length; i++) {
			b[i] = b[i-1] + b[i-4];
		}
			
		
		System.out.println(f[50] - 1 + g[50] - 1 + b[50] - 1);
	} // end of main 
} // end of class
