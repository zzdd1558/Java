
/**
 * 디버깅 Debug
 *
 *
 * 원하지 않은 결곽 나왔을경우 원인을 찾을수 있어야한다.
 * 
 * eclipse에서느 line by line으로 한줄씩 확인할 수 있다.
 * 
 */
public class TestDebug {
	public static void main(String[] args) {
		System.out.println("메인 시작");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println(i + " : "+ j);
			}
		}
		
		for (int i = 0; i < 3; i++) {
			go();
		}
		System.out.println("메인 종료");
		
		
	} // end of main
	
	private static void go() {
		// TODO Auto-generated method stub
		System.out.println("go");
	}//end of go
} // end of class
