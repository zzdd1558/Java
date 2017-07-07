
/**
 * @author yunjin
 *	static 멤버에서 non-static 멤버를 참조 불가
 */
public class Z03_Static {
	public static void main(String[] args) {
		Book b1 = new Book();
		Book b2 = new Book();
		
	}// end of main
} // end of class

class Book{
	int a; // 전역변수 , 멤버 , 인스턴스 변수 , non - static 변수
	static int b; // 전역변수 , 멤버 , static변수 , 공유 변수 , 클래스 변수
	int d= a;
	int e = b;
//	static int f = a; // 에러 : static 멤버 변수에서 non-static 변수 참조 불가.
//	static int g = b; // 
	
	static void t(){ 
//		p(); // static 메서드안에서 non-static 메서드 참조 불가.
	}
	
	
	
	static void w(){
//		a++; // 에러 : static 멤버 변수에서 non-static 변수 참조 불가.
		b++;
	}
	
	
	void q(){
		a++;
		b++; // static 
	}
	
	
	void p(){//non-static 메서드
		//지역변수 영역에는 static가 들어올 수 없다.
		int c = 0;; // 지역변수 
	}
}
