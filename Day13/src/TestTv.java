
public class TestTv {
	
	static Tv t3; // 전역변수 : 각 타입의 기본값으로 초기화 된다.
	static Tv t4;
	public static void main(String[] args) {
		Tv t1 = new Tv();
		t1.name = "삼성";
		t1.channel = 5;
		t1.power = true;
		t1.printTv();
		
		Tv t2 = new Tv();
		t2.name = "삼성";
		t2.channel = 5;
		t2.power = true;
		t2.printTv();
		
		
		
//		참조변수의 멤버접근연산자 , 참조변수가 null 이 아니어야 한다 . 확인 필요 
//		t1이 null일경우 nullPointException이 발생하기때문에 체크해 줘야한다.
		
		if( t1 !=null && t1.equals(t2)){
			System.out.println("같다");
		}else{
			System.out.println("다르다");
		}
		
		
		if(t3 != null){
			System.out.println( t3.equals(t4));
		}
		
	} // end of main
} // end of class


class Tv extends Object{
	String name = ""; // 문자열 String 의 초기화를 빈문자열로하자
	int channel;
	boolean power;
	
	void channelUp(){
		channel++;
	}
	
	void powerOn(){
		power = !power;
	}
	void printTv(){
		System.out.println(name + " : " + channel + " : " + power);
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Tv){
			Tv tvObj = (Tv) obj;
			/* 첫번째 방법 : if(this.name != null && (this.name).equals(tvObj.name) && this.channel == tvObj.channel && this.power == tvObj.power)*/
			
			//두번째 방법을쓰면 무조건 tvObj는 객체를 같고있기때문에 nullPointException을 발생할 일이 없다.
			if((tvObj.name).equals(this.name) && this.channel == tvObj.channel && this.power == tvObj.power){
				return true;
			}
		}
		return false;
	}
	
}
