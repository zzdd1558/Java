import java.util.Scanner;

/**
 * 예외 처리 활용 - try ~ catch 자동완성 활용 
 * 1. Alt + Shift + Z ( Surround With ) 
 * 2. Ctrl + Space 2번
 */
public class Z03_TryCatch {
	public static void main(String[] args) {
		// try ~ catch 로 예외 처리
		// 숫자입력시 출력후 종료
		// 문자입력시 숫자를 다시 입력받기
		Scanner scan = new Scanner(System.in);

		int num;
		while (true) {

			try {
				System.out.println("숫자를 입력하세요");
				num = scan.nextInt();
				scan.close();
				break;
			} catch (Exception e) {
				// TODO: handle exception
				
//				 buffer에 있는 값들을 가져가는데 아직 버퍼에 못가져간 문자들이 남아있어서 계속 반복하게 된다.
//				 따라서 buffer를 비워줘야한다
//				다른방법으로는 scan.nextLine()으로 한줄을 소비해도 된다.
				scan = new Scanner(System.in);
				System.out.println("숫자를 다시 입력하세요");
			}
		}

	} // end of main
} // end of class
