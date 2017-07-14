import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = a%b;
		int[] array = new int[b];
		long result = 1;
		
		for (int i = 0; i < c; i++) {
			array[i] += 1;
		}
		for (int i = 0; i < array.length; i++) {
			array[i] += a/b;
			result *= array[i];
		}
	
		System.out.println(result);
		
	}
}
