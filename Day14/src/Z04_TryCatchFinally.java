/**
 * 예외 처리 활용 - try ~ catch ~ finally 자동완성 활용 
 * 1. Alt + Shift + Z ( Surround With ) 
 * 2. Ctrl + Space 2번
 */
public class Z04_TryCatchFinally {
	public static void main(String[] args) {
		System.out.println("main 시작");
		
		
		try {
			System.out.println(1);
			System.out.println(3/0); // ArithmeticException 발생
			System.out.println(3);
		} catch (NullPointerException | ArithmeticException e) { // multi catch
//			jdk 7버전에서 추가된 문법
			// TODO Auto-generated catch block
			System.out.println(3);
		}finally { // 반드시 실행해야 하는 코드.
//			정상적인 경우 try -> finally
//			Exception 발생후 처리시 try -> catch -> finally
//			Exception 발생후 미처리시 try -> finally -> 비정상 종료.
			System.out.println(4);
			
		}
		
		
		
		
		System.out.println("main 시작");
	} // end of main
} // end of class
