
/**
 * 최고조상 클래스 Object
 *
 */
public class TestObject {
	public static void main(String[] args) {
		Boy b1 = new Boy();
		b1.age = 20;
		b1.gender = true;
		Boy b2 = new Boy();
		b2.age = 20;
		b2.gender = true;
		
		//주소 비교
		if(b1 == b2){
			System.out.println(" == 같다");
		}else{
			System.out.println(" == 다르다");
		}
		
		// 참조변수의 객체의 내용을 비교
		
		if(b1.equals(b2)){
			System.out.println(" equals 같다");
		}else{
			System.out.println(" equals 다르다");
		}
		
		
//		실행결과는 equals또한 다르다고 나온다.
//		Object 안에있는 equals가 리턴하는건 결과적으로 주소 비교이다.
//		따라서 상속받은 equals를 재정의해야 한다.
//		equals를 추상메서드로 안하고 일반적인 메서드로 만든이유는
//		매번 재구현해서 쓰기는 힘드니까 강제성을 배제하고
//		필요할 경우에만 구현해서 쓰라는 의미로 몸통코드를 만들어 놓은것이다.
		
		
//		 public boolean equals(Object obj) {
//		        return (this == obj);
//		    }

	} // end of main
} // end of class


class Boy extends Object{
	int age;
	boolean gender;
	String name= "";
	/** 객체의 냉용물 비교하는 메서드로 재정의 */
	
	
	// 매개변수 타입이 Object인 이유는 비교대상으로 어떤 클래스가 들어올지 모르기 때문.
	@Override
	public boolean equals(Object obj) {  
		// TODO Auto-generated method stub
		
//		obj안에 들어있는 객체의 멤버를 사용 하려면 원래 타입으로 강제 형변환 해줘야 한다.
		if(obj instanceof Boy){
			Boy b = (Boy)obj;
			if(this.age == b.age && this.gender == b.gender){
				return true;
			}
		}
		
		return false;
	}
	
	
	
	
}