
public class Z07_TestTv {
	public static void main(String[] args) {
			Tv tv = new Tv("삼성");
			tv.powerOnOff();
			tv.channelUp();
			tv.powerOnOff();
			tv.channelUp();
			tv.printTv();
			tv.powerOnOff();
			tv.channelUp();
			tv.printTv();
	} // end of main
} // end of class


class Tv{
	String name = "";
	//마지막으로 본 채널 기억하기 위해 static로 선언
	static int channel;
	boolean power;
	Tv(){
		
	}
	Tv(String name){
		this.name = name;
	}
	
	// tv가 꺼져잇다면 꺼져있다고 출력 켜져있다면 채널 up
	void channelUp(){
		if(power){
			System.out.println("채널Up" + ++channel);
		}else{
			System.out.println("Tv가 꺼져있습니다.");
		}
	}
	
	//power가 true이면 false로 바꾸고 false면 true로 바꾸준다.
	void powerOnOff(){
		//tv가 켜져있으경우 power를 false로바꾸고 tv껐다고 출력
		power = !power;
	}
	
	void printTv(){
		System.out.println("TV 모델명 : " + name + "  현재 tv 상태 : " + (power ? "켜짐" : "꺼짐") + " , 현재 채널 : " + channel);
	}
	
}