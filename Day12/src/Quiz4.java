import java.util.Arrays;

public class Quiz4 {
	public static void main(String[] args) {
			
		int array[] = new int[8];
		array[1] = 2;
		array[2] = 3;
		
		
		for (int i = 3; i <= 5; i++) {
			array[i] = array[i-1] + array[i-2];
		}
		System.out.println(Arrays.toString(array));
	} // end of main
} // end of lass
