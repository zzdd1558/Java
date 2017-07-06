
/**
 * @author yunjin CallStack : 메서드의 호출정보를 기록하는 저장소
 */
public class Z09_CallStack {
	public static void main(String[] args) {
		System.out.println("메인 시작");
		Test t1 = new Test();
		t1.p1();

		System.out.println("메인 종료");
	} // end of main
} // end of class

class Test {
	void p1() {
		System.out.println("p1 시작");
		p2();
		System.out.println("p1 종료");
	}

	void p2() {
		System.out.println("p2 시작");
		p3();
		System.out.println("p2 종료");
	}

	void p3() {
		System.out.println("p3 시작");
		
		System.out.println("p3 종료");
	}
}
