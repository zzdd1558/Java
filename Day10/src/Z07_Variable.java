
/**
 * this , super
 *
 */
public class Z07_Variable {
	public static void main(String[] args) {
		MyC mc = new MyC();
		mc.print();
	} // end of class
} // end of main

class MyGP {
	int x = 4000;

}

class MyP extends MyGP {
	int x = 300; // 부모의 전역변수
	int y = super.x; // 처음 객체 생성시 변수값이 복사 저장된다.

	int ppp() {
		return super.x;
	}
}

class MyC extends MyP {
	int x = 20; // 전역변수

	void print() {
		int x = 1; // 지역변수
		// 변수 참조의 원칙 : 참조위치에서 가장 가까운 곳에 선언된 변수를 참조한다.

		System.out.println("안녕 " + x); // 1.지역변수
		System.out.println("반가워 this야 : " + this.x); // 지역변수 이상을참조.
		System.out.println("부모의 변수 : " + super.x); // 부모의 전역변수 이상을 참조한다.
		System.out.println(super.ppp()); // MyGP의 x를 출력.
	}
}