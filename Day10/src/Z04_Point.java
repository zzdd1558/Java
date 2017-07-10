
/**
 * @author yunjin
 * 메서드의 오버라이딩 Overriding
 * 	// 상속 : PP 클래스를 상속 PP클래스가 갖고있는 멤버(변수 , 메서드)를 물려받는다. 
 *  // 오버라이딩 : 부모클래스의 메서드를 자식클래스에서 재정의 하는기법
 *  // 메서드의 선언부( 리턴 타입 , 메서드명 , 인자값)이 같아야한다.
 */
public class Z04_Point {
	public static void main(String[] args) {
		PP pp = new PP();
		pp.x = 10; pp.y = 20;
		pp.print();
		
		Math.random();
		
		PPP ppp  = new PPP();
		ppp.x=3; ppp.y=4; ppp.z=5;
		ppp.print();
		
	} // end of main
} // end of class

/** 2차원 좌표계*/
class PP{
	int x;
	int y;
	void print(){
		System.out.println(x + " , " + y);
	}
}


/**
 * 3차원 좌표를 추상화한 클래스
 *	
 */
class PPP extends PP{

	int z;
	
	@Override // 어노테이션 : 개발자의 실수를 미연에 방지할 수 있도록 체크해준다. 
	void print(){
		System.out.println(x + " : " +   y + " : " + z);
	}
}






















