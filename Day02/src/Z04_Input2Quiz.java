import java.util.Scanner;

public class Z04_Input2Quiz {
	public static void main(String[] args) {
		// 몇월인지 사용자의 입력을 숫자로 받아서 (1~12사이의 숫자)
		// 그달의 마지막 날짜를 출력
		// 1 3 5 7 8 10 12 : 31일
		// 4 6 9 11 : 30일
		// 2 : 29일
		Scanner scan = new Scanner(System.in);

		System.out.println("월을 입력하세요");
		int month = scan.nextInt();
		

		/*switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println(month + "월은 31일까지 있습니다");
			break;

		case 2:
			System.out.println(month + "월은 29일까지 있습니다");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println(month + "월은 30일까지 있습니다");
			break;

		default:
			System.out.println("잘못된 월을 입력하셨습니다");
		}*/

	} // end of main
} // end of class