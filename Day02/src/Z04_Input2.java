import java.util.Scanner;

/**
 * @author yunjin
 * Scanner은 JDK 1.5부터 추가되었다.
 */
public class Z04_Input2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("이름을 입력하세요 : ");
		String name = scan.nextLine();
		System.out.println(name);
		
		System.out.println("나이를 입력하세요");
		int age = scan.nextInt();
		System.out.println("나이 : " + age + " 살");
		
	}
}
