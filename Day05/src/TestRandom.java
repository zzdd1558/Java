import java.util.Scanner;

/**
 * 랜덤 : 무작위
 * 
 * @author yunjin Math.random() , Ramdon 클래스
 */
public class TestRandom {
	public static void main(String[] args) {
		// 변수 : 기본형 , 참조형
		// 연산자 : 단항 , 이항(산술 , 비교 , 비트 , 논리) , 삼항 , 대입
		// 흐름제어 : if ~ else , switch ~ case , 삼항연산자
		// 반복문 : for , while , do ~ while

		// 0.0 이상 1.0d 미만의 수를 리턴해준다.
		// Math.random();
		// min ~ max는 Math.random() * ( max - min +1 ) + min);
		// 1 ~ 45사이의 수를 출력
		System.out.println((int) (Math.random() * 45 + 1));

		// 1 ~ 5 사이의 수를 출력
		System.out.println((int) (Math.random() * 5 + 1));

		Scanner scan = new Scanner(System.in);
		//
		// //1~100사이의 랜덤값
		// int ran = (int)(Math.random() * 100 + 1);
		// // 사용자에게 입력받는값
		// int value;
		// int gameCnt=0;
		// do {
		// 		System.out.print("숫자를 입력하세요 : ");
		// 		value = scan.nextInt();
		//
		// 		if(ran > value){
		// 			System.out.println("랜덤 숫자는 " + value + "보다 큽니다");
		// 		}else if ( ran< value){
		// 			System.out.println("랜덤 숫자는 " + value + "보다 작습니다");
		// 		}
		// 		gameCnt++;
		// 	} while (ran != value);
		//
		// 	System.out.println("ran값은 : " + ran + " 이었습니다.");
		// 	System.out.println(gameCnt + "번 만에 이겼습니다!");
		//

		// 사용자가 입력한 값에 상품을 출력
		// 1.콜라 , 2.사이다 , 0. 반복 종료 이 외의 다른 값 : 다시 입력 하세요

		System.out.print("1.콜라 , 2.사이다 , 0. 반복 종료  : ");
		int input = scan.nextInt();
	exit:switch (input) {
		case 1:
			System.out.println("콜라 선택");
			break;

		case 2:
			System.out.println("사이다 선택");
			break;
		case 0:
			System.out.println("반복 종료");
			break exit;

		default:
			System.out.println("다시 입력하세요");
			break;
		}

	} // end of main
} // end of class
