
public class Z02_StaticMethod {
	public static void main(String[] args) {
		
		
		//static 메서드 : 객체생성 없이, 클래스명으로 접근이 가능하다.
		System.out.println(Test.add(3,7)); // 10
		
		
		//Math클래스 : 수학 관련 메서드를 제공
		Math.random();
		System.out.println(Math.max(3, 7));
		
	}// end of main
} // end of class


class Test{
	void p(){ // non-static, 인스턴스 메서드
		
	}
	static int add(int a , int b){ // static 메서드
		return a+b;
	}
}