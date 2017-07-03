import java.util.Scanner;

public class Z03_DoWhile {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 반드시 1회 이상의 실행을 보장해야할 때
		// 마지막에 ; 를 붙인다
		// do~while 조건문에 사용할 변수는 do~while 이전에 선언해야 한다.
		// do~while 문장은 {} 생략할 수 없다.
//		do{
//			 반복할 실행문
//		}while(조건문) //true or false
		
		
		
//		
//		//사용자의 이름을 입력받아서 출력(반복), 입력값이 x라면 종료
//		String name;
//		do{
//			System.out.print("이름을 입력 : ");
//			name = scan.nextLine();
//		}while(!"x".equals(name));

		
		
		
		
//		1. 1~1000 까지의 숫자중 7의 배수를 출력하세요
//		for while do~while 사용하시오.
		
		for (int i = 1; i <= 1000; i++) {
			if(i % 7 == 0){
				System.out.print(i + " ");
			}
		}
		System.out.println();
		
//		2. 1~1000 까지의 숫자중 7의 배수이고 , 14의 배수가 아닌 수를 출력하세요
		
		
		for(int i = 1; i<= 1000; i++){
			if(i % 7 == 0  && i % 14 != 0){
				System.out.print(i + " ");
			}
		}
		System.out.println();
		
		
//		3. 1~1000 까지의 숫자중 7의 배수 개수를 출력하세요
		int sevenCnt=0;
		for (int i = 1; i <= 1000; i++) {
			if(i % 7 == 0){
				sevenCnt++;
			}
		}
		System.out.println("7의 배수의 갯수는 : " + sevenCnt + "개 입니다");
		
		
		
//		4. 1~1000 까지 숫자중 7의 배수이고 , 14의 배수가 아닌 수의개수를 출력하세요.
		
		int numCnt=0;
		for(int i = 1; i<= 1000; i++){
			if(i % 7 == 0  && i % 14 != 0){
				numCnt++;
			}
		}
		System.out.println("7의배수이고 14의 배수가 아는 수의 갯수는 : " + numCnt + "개 입니다");
		
		
		
		
		
		
		
		
	} // end of main
} // end of class
