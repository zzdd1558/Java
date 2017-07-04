import java.util.Arrays;
import java.util.Collections;

public class Z04_Array4 {
	public static void main(String[] args) {

		// 주어진 배열을 역순으로 출력
		int a[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		for (int i = a.length - 1; i >= 0; i--) {
			System.out.print(a[i] + " ");
		}

		System.out.println();

		// a 배열에 7,8,9 가 포함되어 있는지 여부를 확인하여 포함되어 있다면 "포함" 없다면 "미포함" 출력
		boolean check = false;
		for (int i = 0; i < a.length - 2; i++) {

			if (a[i] == 7 && a[i + 1] == 8 && a[i + 2] == 9) {
				check = true;
			}
		}

		System.out.println(check ? "포함" : "미포함");

		System.out.println();
		System.out.println();

		// b 배열에서 연속된 3개의 값의 합을 구해 출력하세요.

		int b[] = { 7, 2, 6, 9, 3, 2, 1, 7, 9, 3, 4, 8 };

		int sum = 0;
		for (int i = 0; i < b.length - 2; i++) {
			sum = b[i] + b[i + 1] + b[i + 2];
			System.out.print(sum + " ");
		}
		System.out.println();
		System.out.println();
		
		
//		c배열은 0~5 숫자를 원소로 갖는 배열이다. 이중에 1의 개수를 출력하시오.
//		각각의 숫자별, 몇번씩 사용되었는지 개수를 출력하시오.
		
		int c[] = { 4, 2, 3, 5, 1, 2, 3, 4, 1, 1, 2, 3, 3, 4, 0 };
		
		int numOfOneCnt = 0;
		for (int i = 0; i < 6; i++) {
			int tempCount = 0;
			for (int j = 0; j < c.length; j++) {
				if( i == 1 && c[j] == i){
					numOfOneCnt++;
				}
				if(c[j] == i) {
					tempCount++;
				}
			}
			System.out.println(i + "가(이) 포함된 숫자의 갯수는 : " + tempCount++ + "입니다");
		}
		
		System.out.println("숫자 1이 포함된 갯수는 : " + numOfOneCnt);
		
		
		
		

	} // end of main
}// end of class
