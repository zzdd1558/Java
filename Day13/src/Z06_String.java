import java.util.Arrays;
import java.util.Scanner;

/**
 * String 활용 
 *
 */
public class Z06_String {
	public static void main(String[] args) {
		Login l = new Login();
		while(true) ;
		
	} // end of main
} // end of class


class Login{
	char[] id;
	char[] pw;
//	String id = "";
//	String pw = "";
//	String 으로 하면 힙영역에 데이터가 남는다
//	gc가 언제처리해줄지 모른다.
//	String 을 수정하면 전에있언 객체가 사라지는게아니라 새로 만들기 때문에
//	String 는 안된다.
	
	public Login() {
		
		// TODO Auto-generated constructor stub
		Scanner scan = new Scanner(System.in);
		System.out.println("아이디와 비밀번호를 입력하세요.");
		id = scan.nextLine().toCharArray();
		pw = scan.nextLine().toCharArray();
		
		Arrays.fill(id, ' '); // 배열의 각각의 원소의 내용을 두번째 인자로 모두채우기
		Arrays.fill(pw, ' '); // 배열의 각각의 원소의 내용을 두번째 인자로 모두채우기
		
		id = null;
		pw = null;
	}
}