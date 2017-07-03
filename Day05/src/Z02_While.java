import java.util.Scanner;

/**
 * @author yunjin 
 * 자바의 반복문 : for , while , do~ while
 */
public class Z02_While {
	public static void main(String[] args) {
		
		
//		for(;;){ // 조건식에 아무것도 작성 안하면 true
//			System.out.println("3"); // 무한 루프
//		}
		
		
		//초기식 , 증감식에 콤마 연산자로 같은 타입의 변수를 여러개 사용 가능.
		//단 , 조건식은 반드시 1번만 작성가능.
//		for( int i = 0,j,k,t=8; i<3; i++, t-=2){
//			
//		}
		
		
		
		//초기식에 다양하게 작성 가능.
//		int a = 0;
//		for (System.out.println("안녕"); a<2; a++) {
//			System.out.println(a);
//		}
		
		
//		while(조건식){ // 조건식이 true이면 반복 , false 면 실행(X)
//			반복할 실행문;
//		}
		
		
//		int n = 0;						// 왼쪽의 while문을 for문으로 변경한것.
//		while(n<3){						// for (int i = 0; i < 3; i++) {
//			System.out.println(n);		// 		System.out.println(i);
//			n++;						// }
//		}
		
//		while	: 몇번 반복해야할지 횟수를 미리 모를때.
//		for		: 몇번 반복 횟수, 범위를 미리 알경우 for문을 사용
		
		
		

//		첫번째 방법. 사용자의 입력을 숫자로 받아서 출력, 무한 반복 , 종료 조건 : 사용자가 -1을 입력했을떄
		Scanner scan = new Scanner(System.in);
		
//		int value = 0;
//		while(value != -1){
//			System.out.print("숫자를 입력하세요 : ");
//			value = scan.nextInt();
//			System.out.println("입력한 숫자 : " + value);
//		}
//		System.out.println("종료!");
//		
//
//		두번째 방법. 사용자의 입력을 숫자로 받아서 출력, 무한 반복 , 종료 조건 : 사용자가 -1을 입력했을떄
//		
//		
//		while(true){
//			System.out.print("숫자를 입력하세요 : ");
//			int secondValue = scan.nextInt();
//			System.out.println("입력한 숫자 : " + secondValue );
//			if(secondValue  == -1){
//				System.out.println("종료!");
//				break; // 가장 가까운 switch문 or 반복문 1개만 빠져나간다.
//			}
//		}
//		
		
		//사용자의 입력을 숫자로 받아서 총점과 평균을 출력. 사용자가 -1입력시 반복 종료 , 그시점까지의 총점과 평균을 출력.
		
//		int sum=0; // 총점이 저장될 변수
//		double avg; // 평균을 저장할 변수.
//		int count = 0; // 입력된 횟수 카운트 변수
//		while(true){
//			System.out.print("점수를 입력하세요 : ");
//			int score = scan.nextInt();
//			if(score == -1){
//				avg = sum / (double)count;
//				System.out.printf("총점 : %d , 평균 : %.2f" ,sum,avg);
//				break;
//			}
//			sum += score;
//			count++;
//			
//		}
		/*-------------------------------------------------------------------*/
		
		
//		1부터 10 까지의 곱을 출력
		
//		int multi = 1;
//		int cnt = 1;
//		while(cnt<11){
//			multi *= cnt;
//			cnt++;
//		}
//		
//		System.out.println("1~10까지의 곱 : " + multi);
		
		
//		소인수 분해
//		24의 소인수는 2, 2, 2, 3
//		13195의 소인수는 5, 7, 13, 29 이다.
//		600851475143의 소인수를 출력
		
		Long x = 600851475143L;
		int cnt = 2;
		while(x != 1){
			
			if( x % cnt == 0){
				x = x / cnt;
				continue;
			}
			cnt++;
		}
		System.out.println("가장 큰수 : " + cnt);
		
		
		
		
	}
}
