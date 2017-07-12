import java.util.Arrays;

public class Quiz {
	public static void main(String[] args) {

		
		long a=1;
		for (int i = 1; i <= 10; i++) {
			a = a * (41-i) / i;
		}
		System.out.println(a);	
		
		
		
		
		/*
		double a= 1;
		for (int i = 1; i <= 40; i++) {
			a = a * i;
		}
		
		double b= 1;
		for (int i = 1; i <= 10; i++) {
			b = b * i;
		}
		
		
		double c= 1;
		for (int i = 1; i <= 30; i++) {
			c = c * i;
		}
		
		System.out.println((int)(a/(b*c)));*/
	} // end of main
} // end of class
