
public class Z08_Thread {
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		mt.start();
		
		
		for (int i = 0; i < 10000; i++) {
			System.out.println("II");
		}
	} // end of main 
} // end of class


class MyThread extends Thread{
	//run 메서드를 작성한다 . - 별도의 쓰레드에서 할 작업
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10000000; i++) {
			System.out.println("==");
		}
	}
	
}