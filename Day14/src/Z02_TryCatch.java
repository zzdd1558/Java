import java.util.InputMismatchException;
import java.util.Scanner;

public class Z02_TryCatch {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		
		int num = 0;
		try{
			num = scan.nextInt();
			System.out.println("입력한 숫자는 : " + num);
		}catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("숫자를 잘못 입력하셨습니다.");
		}
		
		System.out.println("main 종료");
	}
 }
