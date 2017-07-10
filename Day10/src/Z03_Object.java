
public class Z03_Object {
	public static void main(String[] args) {
		
	} // end of main
} // end of class


// 자바의 모든 class는 최고 조상 클래스 Object클래스를 상속받는다. ( Object 캘르스는 제외  Object클래스는 아무것도 상속받지 않는다.)
class A { // 아무것도 상속받지 않은 클래스 컴파일러는  extends Object을 자동으로 추가해준다. 
	int a;
}


class B extends A{
	 int b;
}
