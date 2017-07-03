import java.util.Scanner;

public class study1 {
	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);
		
		Double a = i.nextDouble();
		Double b = i.nextDouble();
		char c = i.next().charAt(0);
		
		System.out.printf("%.2f\n",a);
		System.out.printf("%.2f\n",b);
		System.out.printf("%s\n",c);
		
	}
}
