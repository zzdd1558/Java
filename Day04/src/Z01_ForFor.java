
/**
 * @author yunjin 이중 for문
 */
public class Z01_ForFor {
	public static void main(String[] args) {

		// ******
		// ******
		// ****** 출력하기

		for (int i = 0; i < 3; i++) { // 행
			for (int j = 0; j < 6; j++) { // 열
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		// 숫자를 통한 행 열 숫자 확인
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.println(i + " , " + j);
			}
		}
		System.out.println();

		// 구구단
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				// (i*j) 는 괄호로 묶어주지 않아도 + 보다 우선순위가 높기때문에 문자열연산이 되기전에 먼저 연산된다.
				// System.out.println(i + " X " + j + " = " + (i*j));

				// 10보다 작을때는 자릿수를 맞춰주기 위해서 printf()를 사용하였다.
				System.out.printf("%d X %d = %2d\n", i, j, i * j);
			}
			System.out.println();
		}

		// 1234
		// 2345
		// 3456
		// 4567

		for (int i = 1; i <= 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(j + i);
			}
			System.out.println();
		}
		System.out.println();

		// 34567
		// 45678
		// 56789

		for (int i = 3; i < 6; i++) {
			for (int j = 0 + i; j < i + 5; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

		// 0123456
		// 1234567

		for (int i = 0; i < 2; i++) {
			for (int j = 0 + i; j < i + 7; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

		// 123
		// 345
		// 567
		// 789

		for (int i = 0; i < 7; i += 2) {
			for (int j = 1 + i; j < 4 + i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();

		// 2345
		// 4567
		// 6789

		for (int i = 2; i <= 6; i += 2) {
			for (int j = i; j < i + 4; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

		System.out.println();

		// 0123
		// 3456
		// 6789

		for (int i = 0; i < 7; i += 3) {
			for (int j = i; j < i + 4; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

		System.out.println();

		// 135
		// 357
		// 579

		for (int i = 1; i < 6; i += 2) {
			for (int j = i; j < i + 5; j += 2) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();

		// 0246
		// 3579

		for (int i = 0; i < 5; i += 3) {
			for (int j = i; j < i + 7; j += 2) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();

		// abcde
		// bcdef
		// cdefg

		for (char i = 'a'; i < 'd'; i++) {
			for (char j = i; j < i + 5; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();

		// cfil 99 102 105 108
		// ehkn 101 104 107 110
		// gjmp
		// ilor
		// knqt

		for (char i = 'c'; i <= 'k'; i += 2) {
			for (char j = i; j <= i + 9; j += 3) {
				System.out.print(j);
			}
			System.out.println();
		}

		System.out.println();

		// 01234
		// 1234
		// 234
		// 34
		// 4

		for (int i = 0; i < 5; i++) {
			for (int j = i; j < 5; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

		// *
		// **
		// ***
		// ****
		// *****

		System.out.println();

		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// ***
		// ****
		// *****
		// ******
		System.out.println();

		for (int i = 3; i <= 6; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		// *1
		// ***3
		// *****5
		// *******7
		// *********9

		for (int i = 1; i < 10; i += 2) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		// *****
		// ****
		// ***
		// **
		// *

		for (int i = 5; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		// ********
		// ******
		// ****
		// **

		for (int i = 8; i > 0; i -= 2) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		// *************
		// **********
		// *******
		// ****
		// *

		for (int i = 13; i > 0; i -= 3) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		// 1
		// 12
		// 123
		// 1234
		// 12345
		// 123456

		for (int i = 1; i < 7; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();

		// 34
		// 345
		// 3456
		// 34567
		// 345678

		for (int i = 4; i <= 8; i++) {
			for (int j = 3; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

		/*------------------------------------------*/
		// 1
		// 13
		// 135
		// 1357
		// 13579

		for (int i = 1; i < 10; i += 2) {
			for (int j = 1; j <= i; j += 2) {
				System.out.print(j);
			}
			System.out.println();
		}

		System.out.println();

		// 0
		// 03
		// 036
		// 0369

		for (int i = 0; i <= 9; i += 3) {
			for (int j = 0; j <= i; j += 3) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();

		// 1 2 4 7 11 16 22
		int sum = 1;
		for (int i = 1; i < 8; i++) {
			System.out.print(sum + "  ");
			sum = sum + i;

		}
		System.out.println();
		System.out.println();

		// A
		// AB
		// ABC
		// ABCD
		// ABCDE

		for (char i = 'A'; i < 'F'; i++) {
			for (char j = 'A'; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

		System.out.println();

		/*------------------------------------*/

		// 문제!
		// **2
		// ****4
		// ******6
		// ********8
		// **********10
		// ********8
		// ******6
		// ****4
		// **2

		for (int i = 2; i <= 18; i += 2) {
			// 방법 1!!
			/*
			 * int x; //10까지 증가하면서 별을 찍는부분 if(i<=10){ x = i; }else{ // 10보다
			 * 크기때문에 점차 줄면서 내려오면서 별을찍는 부분 x = 20-i; }
			 */

			// 방법2!!
			int x = i;
			if (x > 10)
				x = 20 - i;
			
			// 방법3!!
			// for문 조건식 부분에 삼항연산자를 써서 계산할수 있으나
			// for문 을할때마다 연산을 수행하기때문에 속도가 눈에는 보이지 않으나
			// 비효율적이다.

			for (int j = 0; j < x; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();
		
		
		
		
				
		//		      6*1    space 6번  * 1번
		//		     5**2    space 5번  * 2번
		//		    4***3    space 4번  * 3번
		//		   3****4    space 3번  * 4번
		//		  2*****5    space 2번  * 5번
		//		 1******6    space 1번  * 6번
		for (int i = 0; i <6; i++) {
			
			for (int j = 1; j<6-i ; j++) {
				System.out.print(" ");
			}
			
			for (int j = 0; j <=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

			
			System.out.println();
		
			
			
//			******	space 0번 * 6번
//			 *****	space 1번 * 5번
//			  ****	space 2번 * 4번
//			   ***	space 3번 * 3번
//			    **	space 4번 * 2번
//			     *	space 5번 * 1번
			
			
			
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			
			for (int j = 0; j < 6-i; j++) {
				System.out.print("*"); 
			}
			System.out.println();
		}		
		System.out.println();
			
			
		//	 ******     * 6번  space 1번
		//	 *****	    * 5번  space 2번
		//	 ****	    * 4번  space 3번
		//	 ***    	* 3번  space 4번
		//	 **   	 	* 2번  space 5번
		//	 *   		* 1번  space 6번
				
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6-i; j++) {
				System.out.print("*");
			}
			
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		
		System.out.println();
//		
//		    *			41
//		   ***			33
//		  *****			25
//		 *******		17
//		*********		09
//		 *******		17
//		  *****			25
//		   ***			33
//		    *			41
		
		
		
		
		for (int i = 4; i >= 0; i--) {
			
			//포문으로 빈칸 , 별
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < (2*-i+9); j++) {
				System.out.print("*");
			}
			System.out.println();
			
			
		}
		
		
		for (int i = 1; i <= 4; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < (-2*i+9); j++) {
				System.out.print("*");
			}
			System.out.println();
		}


		for (int i = 1; i < 6; i++) {
//			System.out.print(-2*i+10 + " ");                    //			8 6 4 2 0
//			System.out.print(-3*i+12 + " "); 					//			9 6 3 0 -3
//			System.out.print(4 * i -7 + " "); 					//			-3 1 5 9 13
//			System.out.print(2 * i -7 + " "); 					//			-5 -3 -1 1 3
//			System.out.print(3 * i - 7 + " "); 					//			-4 -1 2 5 8
//			System.out.print(-4 * i + 9 + " "); 				//			5 1 -3 -7 -11
//			System.out.print(2 * i + 6 + " ");					//			8 10 12 14 16
//			System.out.print(-3 * i + 7 + " "); 				//			4 1 -2 -5 -8
		}
		
		
		/*-------------break와 continue 예제-------------------------------------*/
		
		//break : 가장 가까이 있는 switch문 or 반복문 하나만 빠져나간다
		//continue : 가장 가까운 반복문의 다음 차수를 진행한다.
		
		
		//2의 배수면 출력하지마시요
		System.out.print("2의 배수가 아닌 숫자 : ");
		for (int i = 0; i < 10; i++) {
			if(i%2 == 0){// i를 2로 나누었을때 나머지가 0이라면 continue; 실행
				continue;
			}
			System.out.print(i + " ");
			
		}
		System.out.println();
		
		
		//continue를 사용하여 7의 배수만 출력하시오.
		System.out.print("1~100사이의 7의 배수는 : ");
		
		for (int i = 1; i < 100; i++) {
			
			if(i % 7 != 0){// i를 7로 나누었을때 나머지가 0이 아니라면 continue; 실행
				continue;
			}
			System.out.print(i + " ");
			
		}
		System.out.println();
		
			
		// 라벨 : 분기할 위치를 지정. 세미콜론이 아닌 콜론, 
		
		
		//break , continue; , label을 최소화해서 쓰는게 좋다. 가독성을 해침.
		//라벨명 : label
		label : for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				if(i == 1 && j ==2){
					break label; // label이름을 갖고있는 반복문을 빠져나간다.
				}
				System.out.print("( " + i + " , " + j + " )");
			}
			System.out.println();
		}
		System.out.println();
		
		
		
		
//		*** *
//		***
//		 ***
//		** **
//		찍어보기
		
		System.out.println();
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				if((i==0 &&j == 3)  ||( i==2 && j==0) || (i==3 && j==2)){
					System.out.print(" ");
					continue;
				}else if((i==1 && j==3) || (i ==2 && j==4)){
					break;
				}
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 0 1 2 3 4 5 6 7 8 9 
		// ■ ■ ■ ■ ■ ■ ■ ■ ■ ■ 0 
		// □ □ □ □ □ □ □ □ □ ■ 1
		// □ ■ ■ ■ ■ ■ ■ ■ □ ■ 2
		// □ ■ □ □ □ □ □ ■ □ ■ 3
		// □ ■ □ ■ ■ ■ □ ■ □ ■ 4
		// □ ■ □ ■ □ ■ □ ■ □ ■ 5
		// □ ■ □ ■ □ □ □ ■ □ ■ 6
		// □ ■ □ ■ ■ ■ ■ ■ □ ■ 7
		// □ ■ □ □ □ □ □ □ □ ■ 8
		// □ ■ ■ ■ ■ ■ ■ ■ ■ ■ 9
		
		
		
		
		
		
		
		
		
		
		
		
		
	} // end of main
} // end of class
