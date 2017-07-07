
public class Z07_TestTime {
	public static void main(String[] args) {
		Time t = new Time();
		t.printTime();
	} // end of main
} // end of class



class Time{
	int hour;
	int minute;
	int second;

	
	public Time() {
		this(7,1,0); // 또 다른 생성자 호출.
		//생성자 호출 시에는 this()를 사용한다.
		//또다른 생성자를 호출하는 실행문은 반드시 생성자의 첫번째 줄에 작성해야한다.
	}
	
	public Time(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}




	void printTime() {
		// TODO Auto-generated method stub
		System.out.println(hour + "시  " + minute + "분  " + second + "초");
	}
	
}