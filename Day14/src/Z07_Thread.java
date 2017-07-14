
/**
 * 프로그램 이 실행되면 프로세스라고 칭한다.
 * 
 * 멀티 프로세스 : OS ( windows ) 에서 동시에 여러개의 프로그램을 실행할 수 있다. 
 * 멀티 쓰레드 : 하나의 프로그램에서 동시에
 * 여러개의 작업을 실행할 수 있다.
 * 
 */
public class Z07_Thread {
	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() { // 쓰레드 객체 생성 ( 익명 클래스 )

			@Override
			public void run() { // 해야할 작업
				// TODO Auto-generated method stub
				for (int i = 0; i < 200000; i++) {
					System.out.println("ㅡ");
				}

			}
		});
		thread.start(); // 쓰레드 시작
		for (int i = 0; i < 200000; i++) {
			System.out.println("ㅣ");
		}

	} // end of main
} // end of class
