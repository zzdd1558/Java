import java.util.Scanner;

/**
 * @author yunjin
 * switch ~ case 활용
 */
public class Z08_SwitchQuiz {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 사용자로 부터 달을 입력받아서 (1 ~ 12) 해당 월의 가장 마지막 날을 출력
		System.out.println("월을 입력하세요");
		switch (scan.nextInt()) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println(31 + "일");
			break;

		case 2 : 
			System.out.println(28 + "일");
		case 4 : 
		case 6 : 
		case 9 : 
		case 11 :
			System.out.println(30 + "일");
		default:
			System.out.println("잘못 입력하셨습니다");
			break;
		}
	} //end of main
} // end of class