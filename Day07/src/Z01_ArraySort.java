import java.util.Arrays;

public class Z01_ArraySort {
	public static void main(String[] args) {
		
		//선택정렬과 버블정렬은 원본이 손상된다. 
//		원본이 손상되길 원하지 않는다면 다른 배열에 똑같이 복사를 하고 시작하면 된다.
		// 1. 선택 정렬
		int a[] = { 3, 4, 5, 2, 2, 3, 4, 1, 1, 5, 1, 0, 1, 0, 2, 0, 2, 5, 3 };

		for (int i = 0; i < a.length; i++) {
			int min = i;
			for (int j = i; j < a.length; j++) {
				if (a[min] > a[j]) {
					min = j;
				}
			}

			int temp = a[i];
			a[i] = a[min];
			a[min] = temp;
		}
		System.out.println("선택정렬 : "  + Arrays.toString(a));

		// 2. 거품 정렬
		int b[] = { 3, 4, 5, 2, 2, 3, 4, 1, 1, 5, 1, 0, 1, 0, 2, 0, 2, 5, 3 };
		for (int i = b.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (b[j] > b[j + 1]) {
					int temp = b[j];
					b[j] = b[j + 1];
					b[j + 1] = temp;
				}
			}

		}
		System.out.println("버블 정렬  : " +   Arrays.toString(b));

		// 3. 카운팅 정렬 - 사용된 회수를 세어서 정렬 , 가장 빠른 정렬 방법
		// Cointing Sort - 제한 조건 : 정렬 대상이 정수이어야 한다. 메모리 낭비가 심하다.
		int c[] = { 3, 4, 5, 2, 2, 3, 4, 1, 1, 5, 1, 0, 1, 0, 2, 0, 2, 5, 3 };
		int cnt[] = new int[6];

		for (int i = 0; i < c.length; i++) {
			cnt[c[i]]++;
		}

		// 출력할 필요는 없으나 숫자가 몇개씩 저장되있나 확인하기 위해 출력
		System.out.println("카운터 정렬 : " + Arrays.toString(cnt));

		for (int i = 0; i < cnt.length; i++) {
			for (int j = 0; j < cnt[i]; j++) {
				System.out.print(i + " ");
			}
		}
		System.out.println();

		// 4. 삽입정렬
		// Insert Sort = 정렬된 범위내에 새로운 데이터를 정렬위치를 찾아 삽입
		int d[] = { 3, 4, 5, 2, 2, 3, 4, 1, 1, 5, 1, 0, 1, 0, 2, 0, 2, 5, 3 };

		for (int i = 0; i < d.length; i++) { // 정렬 범위 의 끝
			// i - 1을 했는데 에러가 안나는이유는 if 문안으로 들어가지않아서 에러가 없다.
			for (int j = i - 1; j >= 0; j--) { // 정렬 범위 지정 0 ~ i -1;
				if (d[j] > d[j + 1]) {
					int temp = d[j];
					d[j] = d[j + 1];
					d[j + 1] = temp;
				} else {
					break; // 성능이 좋아진다.
				}
			}
		}

		System.out.println(Arrays.toString(d));
		
		
		
		
		
		
		
		
		
		

	}
}
