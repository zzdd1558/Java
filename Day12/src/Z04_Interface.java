
/**
 * @author yunjin
 * 인터페이스 interface : 추상클래스보다 추상화도가 높다
 */
public class Z04_Interface {

}



//  인터페이스 : 추상메서드만존재 - 껍데기만 있는 설계도
//	추상메서드가 존재, 일반 메서드 안됨 , 상수만 가능 , 변수는 안됨
// 인터페이스로는 객체생성이 불가능.
// 인터페이스를 구현한 자식 클래스로 객체생성이 가능하다.
// 표준안을 제시하기위해서 작성한다.

interface Fightable{ // interface 키워드로 선언
				 // 첫글자 대문자 , ~able로 끝나는 단어로 지정하자.(권장 사항)
	public static final int x = 3; // public static final을 붙여야함.
	int y = 4; // error가 나지 않는다.  이유 , 부족한 제어자는 컴파일러가 추가해 준다. 초기화를 꼭 해야한다.
	public abstract void print(); // public abstract를 붙여야함
	
	/* public abstract가 없어도 컴파일러가 자동으로 추가 */ 
	void ppp();
	
}


//추살클래스 : 추상메서드 , 일반 메서드가 존재 - 미 완성 설계도
abstract class B{ // 첫글자 대문자, 일반 클래스와 명명 규칙 동일
	abstract void pp();
}

//일반 클래스 : 일반 메서드만 존재 - 설계도
class A{ // 클래스 명의 첫글자 대문자.
	
}
//BB클래스 추상클래스 B를 상속받는다.
class BB extends B{
	@Override
	void pp() {
		// TODO Auto-generated method stub
	}
}

// FF클래스가 인터페이스 Fightable 구현 
class FF implements Fightable{
	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void ppp() {
		// TODO Auto-generated method stub
		
	}
	
}

