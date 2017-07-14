import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 메서드 폭탄 던지기
 *
 */
public class Z05_TryCatch {
	public static void main(String[] args) {
		System.out.println("main 시작");
		try {
			p();
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block

		}
		System.out.println("main 종료");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} // end of main

	static void p() throws ArithmeticException {
		System.out.println("p 시작");
		p2();
		System.out.println("p 종료");
	} // end of p

	static void p2() throws ArithmeticException { // 폭탄 떠넘기기
		System.out.println("p2 시작");
		int a = 3 / 0;
		System.out.println("p2 종료");
	} // end of p

} // end of class
