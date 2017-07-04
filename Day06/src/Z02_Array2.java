import java.util.Arrays;
import java.util.Scanner;

public class Z02_Array2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//1번 문제
		
//		int a[]={4,9,1,8,5,3,2,0,7,6};
		
//		//배열 a를 toString을통해 console창에 출력하여 보여준다.
//		System.out.println(Arrays.toString(a));
//		
//		//a 배열의 원소중에 7이 들어있는지 확인후 index 출력
//		//들어 있지 않다면 -1 을 출력
//		int result = -1;
//		for (int i = 0; i < a.length; i++) {
		
//			배열안에 정수 7이 들어있다면 result를 index값으로 바꾸면 간단하게 출력가능 
//			if(a[i] == 7){
//				result = i;
//			}
//		}
//		
//		System.out.println(result);
		
		
		
		
		//2번 문제
//		사용자의 입력을 5개 받아서
//		최대값 , 최소값 출력
//		"최대값과 최대값의 index , 최소값과 최소값의 인덱스"
		int score[] = new int[5];
		int maxIndex = 0;
		int minIndex = 0;
		int max=0,min=100;
		for (int i = 0; i < score.length; i++) {
			System.out.print("점수 입력 : ");
			score[i] = scan.nextInt();
			if(score[i] > max){
				maxIndex = i;
				max = score[i];
			}
			if(score[i] < min){
				minIndex = i;
				min = score[i];
			}
		}
		
		
		System.out.println("최대값 : " + max + "  최대값의 인덱스 " + maxIndex);
		System.out.println("최소값 : " + min + "  최소값의 인덱스 " + minIndex);
		
		
		
		
		
		
		
		
		
		
		
		
	} //end of main
} // end of class
