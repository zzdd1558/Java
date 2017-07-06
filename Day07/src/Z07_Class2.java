
/**
 * 클래스의 활용
 *
 */
public class Z07_Class2 {
	public static void main(String[] args) {
		Time t1 = new Time();
		Time t2 = new Time();
		
		
		t1.hour = 8;
		t1.minute = 50;
		t1.second = 0;
		
		t2.hour = 18;
		t2.minute = 59;
		t2.second = 58;
		
		
		System.out.println("출근시간 : " + t1.hour + "시 " + t1.minute + "분 " + t1.second + "초");
		System.out.println("퇴근시간 : " +t2.hour + "시 " + t2.minute + "분 " + t2.second + "초");
		
		
		
	}// end of main
} // end of class


/** 시간을 추상화한 클래스 */ 
class Time { // 클래스 이름 : 변수명명 규칠과 동일, 첫글자를 대문자로 하자 (권장)
	int hour;
	int minute;
	int second;
}