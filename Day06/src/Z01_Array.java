import java.util.Arrays;
import java.util.Scanner;

/**
 * @author yunjin
 * 배열 : 같은 타입 변수들의 묶음
 */
public class Z01_Array {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arr[]; // 배열 변수의 선언
		arr = new int[3]; // 배열 변수의 객체 생성
		
		//배열의 장점 : 순차적 삽입, 순차적 삭제 속도가 가장 빠르다.
		//배열의 단점 : 객체 생성시 크기를 지정해야하고 , 변경이 불가능하다.
		
		arr[0] = 100; // 배열 변수의 초기화
		arr[1] = 90;
		arr[2] = 80;
//		arr[5] = 50 ; //ArrayIndexOutOfBoundsException 발생 ; array의 크기를 벗어남
		
//		System.out.println("arr배열의 크기 : " + arr.length);  // length를 통해 배열의 크기를 알 수 있다.
//		
//		
//		int sum = 0;
//		//for문을 이용해 배열 값 출력하기
//		for (int i = 0; i < arr.length; i++) {
//			sum += arr[i];
//		}
//		System.out.println("총점 : " + sum);
//		System.out.println("평균 : " + sum / arr.length);
//		
		
		////////////////////////////////////
		// 배열 선언의 다른 방법
		int brr[] = new int[3]; // 배열변수 선언 , 객체생성을 한번에 할 수 있다.
		int crr[] = {10,12,14}; // 배열변수 선언, 객체생성, 초기화를 한번에 한것이다.
		
		
		
		
		
		//사용자에게 숫자입력 5개 받아서 , 5개의 점수 출력 , 평균 , 총점 출력
		
		int score[] = new int[5];
		
		//각 사용자에게 입력받은 점수들의 합계를 저장할 변수 
		int scoreSum = 0;
		
		// 총점을 가지고 평균을 내 저장하기 위한 변수
		double avg;
		
		
		for (int i = 0; i < score.length; i++) {
			System.out.print("index : " + i + " 번째 점수를 입력하세요 : ");
			score[i] = scan.nextInt();
			scoreSum += score[i]; 
			
		}
		
		//Arrays는 배열에 관한 유용한 메서드들이 정의되어있다.
		System.out.println(Arrays.toString(score));
		
		System.out.println("총점 : " + scoreSum);
		System.out.println("평균 : " + scoreSum / (double)score.length);
		
		
		
		
		
		
		
		
	}//end of main
} // end of class
