
/**
 * 다형성 ( polymorphism ) : 여러가지 형태로 저장할 수 있는 성질. 부모의 참조변수의 자식의 객체를 저장할 수 있다.
 * 
 * 여러가지 형태를 가질 수 있는 능력
 * 하나의 참조변수로 여러 타입의 객체를 참조할 수 있는것.
 */
public class Z06_Polymorphism {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv t1 = new Tv();
		
		CaptionTv c1 = new CaptionTv();
		CaptionTv c2 = new CaptionTv();
		
		Tv t = c1; // 부모의 참조변수에 자식의 객체를 저장할 수 잇는 성질.
		
		System.out.println(c1.name + " , " + c1.caption);
		System.out.println(t.name); // t.caption 불가
		
		// 참조변수의 멤버까지 접근가능하다.
		// 원래 객체의 멤버를 모두 사용하려면 , 실체 객체의 참조변수로 캐스팅해야한다.
		
		
		// 부모의 객체를 자식의 참조변수에 저장하는 것은 불가. ( 강제 or 명시적 형변환을 해줘야 한다. ) 
		CaptionTv c = (CaptionTv)t;
		
		
		Tv t2 = new Tv();
		//컴파일 타임에는 에러 없음. ( 부모 자식간의 상속의 관계가 맺어져있으면 컴페일 에러 안남 )
		//런타임에 ClassCastException
		//자식의 객체로 강제 형변환시에는 주의할 필요가 있다.
		// instanceof 이항 연산자를 통해서 미리 확인한다
		
		if(t2 instanceof CaptionTv){ // 변환해도 에러가 발생하지 않는지 체크
			CaptionTv c3 = (CaptionTv)t2;
			System.out.println("형변환 가능");
		}else{
			System.out.println("형변환 불가");
		}
	} //end of main
} // end of class

class Tv{
	String name = "";
}


class CaptionTv extends Tv{
	boolean caption;
}