
/**
 * instanceof : 객체 타입을 확인하는데 사용한다. 속성은 이항연산자이고 형변환 가능여부를 가능하면 true 불가능하면 false로 리턴해준다. 
 * 				주로 상속 관계에서 부모객체인지 자식객체인지 확인하는데 사용한다.
 */
public class InstanceofExam {
	public static void main(String[] args) {
		
		A a = new A();
		B b = new B();
		
		
		//객체 a는 자기 자신의 객체이기 때문에 형변환 가능.
		System.out.println(a instanceof A);  //true 출력
		
		//객체 b는 A의 자식객체이기 때문에 A로 형변환 가능.
		System.out.println(b instanceof A);  //true 출력
		
		
		//객체 a는 B의 부모객체이기때문에 형변환 불가능.
		System.out.println(a instanceof B);  //false 출력
		
		//객체 b는 자기 자신의 객체이기때문에 형변환 가능.
		System.out.println(b instanceof B);  //true 출력
		
	} // end of main 
} // end of class


class A{
	
}

class B extends A{
	
}