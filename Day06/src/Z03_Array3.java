import java.util.Arrays;
import java.util.Scanner;

/**
 * @author yunjin
 * 배열의 활용
 */
public class Z03_Array3 {
	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		//사용자 입력으로 4명의 이름을 입력받아서 배열에 저장후
//		// "홍길동" 이름이 배열에 있는지 확인하여 있으면 index 출력 없으면 -1 출력
//		
//		String name[] = new String[4];
//		int result = -1;
//		for (int i = 0; i < name.length; i++) {
//			System.out.print(i + "번째 이름을 입력하세요 : ");
//			name[i] = scan.next();
//			
//			if("홍길동".equals(name[i])){
//				result = i;
//			}
//		}
//		System.out.println(result + "번째 index에 홍길동이 있습니다.");
//		
//		
		
		
//		출력 결과
//		0123
//		1234
//		2345
//		3456
//		4567
//		5678
//		6789
		
		int num[] = {0,1,2,3,4,5,6,7,8,9};
		
		for (int i = 0; i < num.length - 3; i++) {
			for (int j = i; j < i+4; j++) {
				System.out.print(num[j]);
			}
			System.out.println();
		}
		
		
		
	}//end of main
} // end of class
