import java.util.Scanner;

/**
 * @author yunjin 자바의 흐름제어 : if ~ else , switch ~ case , 삼항연산자
 */
public class Z07_Switch {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		/*//Switch ~ case 설명
		 *
		 * Switch(key){// key에 변수가 들어갈수있다. 
		 * case value: //value에는 변수에 대한 값들을 넣어주고 그 값과 같으면 case문 실행
		 *	  ****
		 *	  break; //  코드 실행후 멈춤.
		 *	
		 *	  default : //case에 없을경우 실행하는곳
		 *		break;
		 *  
		 * }
		 */
		
		// 사용자의 입력을 바나나 , 사과 , 귤 , 포도
		System.out.println("바나나, 사과 , 귤 , 포도 중에 한개를 입력하세요");
		switch (scan.nextLine()) {
		case "바나나":
			System.out.println("banana");
			break;
		case "사과" : 
			System.out.println("apple");
			break;
		case "귤" : 
			System.out.println("mandarin");
			break;
		
		case "포도" : 
			System.out.println("grape");
			break;
		}

	} // end of main
} // end of class