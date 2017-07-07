
/**
 * @author yunjin
 *	생성저 Constructor - 객체의 초기화 작업
 */
public class Z05_TestTv {
	public static void main(String[] args) {
		Tv samsung = new Tv("파브",11,true);
		
		Tv lg = new Tv("시네마",6,false);
		
		
		samsung.printTv();
		lg.printTv();
		
	} // end of main
} // end of class



class Tv{
	String name="";
	int channel;
	boolean power;
	
	// 모든 class에는 반드시 생성자가 하나 이상 존재햐아 한다. 없으면 error
	// 개발자가 생성자를 작성하지 않으면 컴파일러가 기본 생성자를 만들어서 넣어준다. 
	// 만약 개발자가 생성자를 직접 작성한다면 , 컴파일러가 자동으로 기본생성자를 작성해주지 않기때문에
	// 개발자가 직접 기본생성자를 작성해야한다.
	
	//생성자의 오버로딩 overloading
	public Tv() {// 기본 생성인자값이 하나도 없는 생성자
		// TODO Auto-generated constructor stub
	}
	
	// 생성자명은 클래스명과 도잉ㄹ , 메서드의 사용법과 유사 , return 값은 없다. 
	public Tv(String name, int channel, boolean power) {
		this.name = name;
		this.channel = channel;
		this.power = power;
	}



	void channelUp(){
		channel++;
	}
	
	void powerOn(){
		power = !power;
	}
	
	void printTv(){
		System.out.println(name + " , " + channel + " , " + (power?"켜짐": "꺼짐"));
	}
	
	
}