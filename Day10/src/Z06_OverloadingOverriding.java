
/**
 * @author yunjin
 * Overloading 오버로딩 :  같은 클래스 내에서 동일한 메서드명을 허용하는 기법. 
 *                      매개변수의 갯수가 다르거나 , 타입이다르거나 , 순서가 달라야한다.
 * Overriding 오버라이딩 : 부모 클래스의 메서드를 자식클래스에서 재정의하는 기법.
 */
public class Z06_OverloadingOverriding {
	public static void main(String[] args) {
		P p = new P();
		
	} // end of main
} // end of class


class P{
	
//	void a(int y){} // 변수명은 오버로딩의 대상이 아니다.
	void a(int x){}
	void a(){}
//	int a(){}//  리턴 타입은 오버로딩의 대상이 아니다.
	
}


class C extends P{
	void a(){ } // 메서드의 오버라이딩
	void a(double a , double b) {}// 오버로딩
}