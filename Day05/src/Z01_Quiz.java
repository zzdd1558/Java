
/**
 * Quiz
 * 
 * @author yunjin
 * 
 */

public class Z01_Quiz {
	public static void main(String[] args) {
		//
		// ********* 0,9
		//  ******* 1,7
		//   ***** 2,5
		//    *** 3,3
		//     * 4,1
		//    *** 3,3
		//   ***** 2,5
		//  ******* 1,7
		// ********* 0,9

		for (int i = 0; i < 9; i++) {
			int n;

			if (i < 5) {
				n = i;

			} else {
				n = -i + 8;
			}

			for (int j = 0; j < n; j++) {
				System.out.print(" ");
			}

			for (int j = 0; j < (-2 * n + 9); j++) {
				System.out.print("*");

			}
			System.out.println();
		}

		System.out.println();
		
		
//		
//		
//		* 0 ,1
//		** 0 , 2
//		*** 0 , 3
//		**** 0 , 4
//		***** 0 , 5
//		 **** 1 , 4
//		  *** 2 , 3
//		   ** 3 , 2
//		    * 4 , 1
		
		for (int i = 1; i <= 9; i++) {
			//n : 별의 갯수
			int star;
			int space;
			if(i <=5){
				star = i;
				space = 0;
			}else{
				star = -i+10;
				space = i-5;
			}
			for (int j = 0; j < space; j++) {
				System.out.print(" ");
			}
			
			for (int j = 0; j < star; j++) {
				System.out.print("*");
			}
			System.out.println("  " + space + " , " + star);
		}
		
		
		
		
		
		
		
		
	} // end of main
} // end of class
