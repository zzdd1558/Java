
/**
 * 인캡슐레이션 ( Encapsulation ) - 캡슐화 : 내부의 데이터를 보호
 *
 */
public class Z03_Encapsulation {
	public static void main(String[] args) {
		Time t1 = new Time();
//		t1.setHour(-8);
//		t1.setMinute(590);
//		t1.setSecond(-110);
		System.out.println(t1.getHour() + " : " + t1.getMinute() + " : " + t1.getSecond());
		// //번외
		// int num = 8;// 10진수 처리
		// num = 017; // 8진수 처리
		// num = 0xf1; // 16진수 처리
		// System.out.println(num);
		//

	} // end of main
} // end of class

class Time {
	private int hour;
	private int minute;
	private int second;
	private boolean open;
	// getter/setter 메서드
	// setter : 값을 설정 ( 저장 ) // private로 설정해주면 쓰기 X 읽기 O 한마디로 읽기 전용. 사용자가 변경 불가.
	// getter : 값을 참조 ( 읽기 )
	
	
	
	public boolean isOpen(){  // boolean 타입일 경우
		return open;
	}
	
	
	public int getHour() {
		return hour;
	}

	private void setHour(int hour) {
		// 범위에 벗어나는 값은 저장하지 않기
		if (hour < 0 || hour > 23) {
			System.out.println("시간 범위를 벗어났습니다.");
			return;
		}
		this.hour = hour;

	}

	public int getMinute() {
		return minute;
	}

	private void setMinute(int minute) {
		if (minute < 0 || minute > 59) {
			System.out.println("분 범위를 벗어났습니다.");
			return;
		}
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	private void setSecond(int second) {
		if (second < 0 || second > 59) {
			System.out.println("초 범위를 벗어났습니다.");
			return;
		}
		this.second = second;
	}

}