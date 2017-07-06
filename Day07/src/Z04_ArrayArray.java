
/**
 * @author yunjin 다차원 배열 - 이차원 , 삼차원 배열등을 다차원 배열이라고 한다 1차원 배열 : 같은 타입의 변수들의 묶음
 *         2차원 배열 : 같은 타입의 1차원 배열들의 묶음 3차원 배열 : 같은 타입의 2차원 배열들의 묶음
 */
public class Z04_ArrayArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*int a[]; // 배열 변수의 선언
		a = new int[3]; // 배열변수의 객체 생성
		int b[] = new int[3]; // 배열 변수의 선언 , 객체 생성을 한번에
		int c[] = { 2, 3, 4 }; // 배열 변수의 선언 , 객체생성 , 초기화를 한번에.

		int d[][]; // 2차원 배열의 선언
		d = new int[3][3]; // 3*3 배열의 선언

		int e[][] = new int[3][3];
		int f[][] = { { 1, 2 }, { 3, 4 }, { 5, 6 } };

		System.out.println(f.length);
		System.out.println(f[0].length);

		for (int i = 0; i < f.length; i++) {
			for (int j = 0; j < f[i].length; j++) {
				System.out.print(f[i][j]);
			}
			System.out.println();
		}
*/
		
		
		//다차원 배열에서 가변 배열을 허용
		
		//2행 3열 배열
//		int y[][] = { { 1, 2, 3 }, { 6, 7, 8 } };
//		
//		
//		for (int i = 0; i < y.length; i++) { // 행우선 순회
//			for (int j = 0; j < y[0].length; j++) {
//				System.out.print(y[i][j]);
//			}
//			System.out.println();
//		}
		

		
		// 열 우선 순회
//		for (int i = 0; i < y[0].length; i++) {
//			for (int j = 0; j < y.length; j++) {
//				System.out.print(y[j][i]);
//			}
//			System.out.println();
//		}
//		
//		
		
		//지그재그 순회
		int zig[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		
		for (int i = 0; i < zig.length; i++) {
			for (int j = 0; j < zig[i].length; j++) {
				if(i % 2 == 0){
					System.out.print(zig[i][j] + " ");
				}else{
					System.out.print(zig[i][zig[i].length-1-j] + " ");
				}
			}
			System.out.println();
		}
		
		
		
		
	}
}
