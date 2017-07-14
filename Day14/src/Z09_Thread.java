
public class Z09_Thread {
	public static void main(String[] args) {
		MyThread2 myThread = new MyThread2();
		Thread thread = new Thread(myThread);
		thread.start();
		
		for (int i = 0; i < 100000; i++) {
			System.out.println("ㅣㅣ");
		}
	} // end of main
} // end of class



class A{}
class MyThread2 extends A implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 100000; i++) {
			System.out.println("ㅁㅁㅁ");
		}
	}
}
