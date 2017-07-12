import java.util.Arrays;

public class Quiz3 {
	public static void main(String[] args) {
		int array[] = new int[7];
		
		array[1] = 2;
		array[2] = 5;
		
		for (int i = 3; i <=6 ; i++) {
			array[i] = (array[i-1]* 2 ) + array[i-2];
		}
		
		System.out.println(Arrays.toString(array));
		
	}// end of main
} // end of class
