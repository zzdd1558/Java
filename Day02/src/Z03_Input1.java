import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author yunjin
 * 사용자의 입력 받기 1 : BufferedReader     - jdk 1.1 초기부터 사용가능
 */
public class Z03_Input1 {
	public static void main(String[] args) throws IOException {
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("이름을 입력하세요");
		String name = buffer.readLine();// 사용자가 입력한 한줄을 받아옴
		System.out.println(name);
		
		System.out.println("나이를 입력하세요");
		int age = Integer.valueOf(buffer.readLine()); // 숫자가 아니면 에러 발생 123 (O)  12b(x)
		System.out.println("당신의 나이는 " + age + "살 입니다");
	}// end of main
}// end of class
