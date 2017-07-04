import java.util.Arrays;

public class Z05_SelectSort {
	public static void main(String[] args) {

		int a[] = { 3, 7, 4, 5, 6, 1, 2 };

		int cnt = 0;
		for (int i = 0; i < a.length-1 ; i++) {
			int min = i;
			for (int j = i; j < a.length; j++) {
				if (a[min] > a[j]) {
					min = j;
				}
			}
			
			int temp = a[min];
			a[min] = a[i];
			a[i] = temp;
 

		}

		System.out.println(Arrays.toString(a));

	} // end of main
} // end of class
