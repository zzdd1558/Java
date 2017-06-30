
public class Star {
	public static void main(String[] args) {

	/*	System.out.println("         *");
		for (int i = 0; i < 4; i++) {
			for (int j = 8; j > i; j--) {
				System.out.print(" ");
			}

			System.out.print("*");

			for (int z = 0; z <= i * 2; z++) {
				System.out.print(" ");
			}

			System.out.print("*");
			System.out.println();

		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < i + 6; j++) {
				System.out.print(" ");
			}
			System.out.print("*");

			for (int z = 6; z > i * 2 + 1; z--) {
				System.out.print(" ");
			}

			System.out.print("*");
			System.out.println();

		}
		System.out.print("         *");
		System.out.println();
*/
		int cnt=0;
		System.out.println("       *");
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < ( -1 * i + 6) - cnt ; j++) {
				System.out.print(" ");
			}
			
			System.out.print("*");
			for (int j = 0; j < 2*i+1; j++) {
				System.out.print(" ");
			}
			System.out.print("*");
			
			cnt++;
			System.out.println();
		}
		System.out.print("      *");
		
	}
}
