import java.util.Arrays;

public class Z06_BubbleSort {
	public static void main(String[] args) {
		int a[] = { 3, 7, 4, 6, 1, 2 };

		for (int i = a.length-2; i >=0 ; i--) {
			for (int j = 0; j <=i; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}

		System.out.println(Arrays.toString(a));
	}
}
