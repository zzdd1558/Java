
public class Z02_TestTv {
	public static void main(String[] args) {

	} // end of main
} // end of class

class CaptionTv extends Tv { // 자막 방송 티비

	boolean caption; // 자막 표시 여부

	@Override
	void print() {
		// TODO Auto-generated method stub
		System.out.println(volumn + " , " + channel + " , " + power + " , " + caption);
	}
}

class VCRTv extends Tv {
	int playPosition; // 비디오 플레이 가능한 티비

	void print() {
		System.out.println(volumn + " , " + channel + " , " + power + " , " + playPosition);
	}
}

abstract class Tv { // 객체생성용 아님 , 자식클래스의 표준안을 제시하기 위한 클래스
	int volumn; // 볼륨
	int channel; // 채널
	boolean power; // 전원

	abstract void print(); // 자식 클래스에서 완성해야하는 내용이므로
	// 선언부만 작성하여 메서드의 표준을 만들어둔다
	
	void channelUp(){
		channel++;
		print();
	}
}