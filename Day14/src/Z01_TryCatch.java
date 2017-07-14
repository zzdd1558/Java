
/**
 * Compile Error : 소스 -> 기계어로 번역과정 에러 발생     ( Exception Handling 없이 처리 가능 )
 * Runtime Error : 기계어 -> 실행되는 과정에서 에러 발생  ( Exception Handling 없이 처리 불가능 )
 * 
 * Runtime Error : Error ( 처리 불가 ) , Exception ( 소스코드로 피해갈 수 있다 . )
 * 
 * Exception Handling( 예외 처리 ) : 정상적 실행 상태를 프로그램의 끝까지 유지 목적
 * 
 * try ~ catch를 안쓰는것이 best코드이긴하나
 * 복잡해지기때문에 try~catch로 처리한다.
 * 
 */
public class Z01_TryCatch {
	public static void main(String[] args) {
		
		System.out.println(" main 시작 ");
		try { // Exception 이 발생할 소지가 이는 코드를 try 블럭에 담는다
			
			System.out.println(3/0);  // ArithmeticException
			
//			ArithmeticException이 발생하는데
//			이와 다른 예외 catch를 만들어놓으면 비정상종료
//			단, 자신보다 상위 예러들로는 처리 가능.
			
			
		} catch (ArithmeticException e) { // 해당 Exception 발생시 발생
//			 발생한 Exception 종류의 catch에서 핸들링할 수 있다.
			e.printStackTrace();
			String msg = e.getMessage();
			System.out.println(" catch 발생 ");
			System.out.println(msg);
			
			
		}
		System.out.println(" main 종료 ");
		
		
	} // end of main
} // end of class
