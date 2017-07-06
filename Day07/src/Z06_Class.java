
/**
 * @author yunjin
 *	클래스 : 새로운 타입의 정의
 *  변수 : 배열(같은타입 변수의 묶음) -> 구조체(변수, 다른타입 변수 , 다른 타입 배열, 배열 ) 처리가능
 *  			-> 클래스 ( 구조체 + 메서드 + ...)
 */
public class Z06_Class {
	public static void main(String[] args) {
		int w; // 변수의 선언
		w = 3; // 변수의 초기화 ( 변수에 값을 할당 )
		int y = 3; // 변수의 선언과 동시에 초기화
				
				
		Apple apple = new Apple();// 참조 변수의 선언
		apple = new Apple(); // 클래스의 객체 생성
//		Apple p2 = new Apple(); // 참조변수의 선언과 동시에 객체생성
		
		apple.a = 6; // 참조변수의 초기화 ( 변수에 값을 할당 )
//					. 멤버 접근 연산자
		
//		apple.a를 출력하면 6이 출력되는 것을 확인 할 수 있다.
		System.out.println(apple.a);
		/* 멤버에 접근할 수 있는 다양한 방법 */
		apple.b = true;
		System.out.println(apple.b);
		
		apple.x[0] = 3;
		System.out.println(apple.x[0]);
		
		apple.f[1] = 3.14f;
		System.out.println(apple.f[1]);
		
		
		
	} // end of main
} // end of class



/**
 * 
 *	새로운 타입의 정의
 */
class Apple{
	int a;
	boolean b;
	int x[] = new int[2];
	float f[] = new float[3];
}