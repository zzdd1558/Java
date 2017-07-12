
public class Z03_TestUnit {
	public static void main(String[] args) {

	} // end of main;
} // end of class;

class Point {
	int x;
	int y;
}

class Marine extends Unit{ // 보병을 정의한 클래스
	void move(Point p) {
		System.out.println("마린이 언덕을 돌아감");
	}
	void stimPack() {
		System.out.println("스팀패애애액~~~~~~");
	}
}

class Tank extends Unit{ // 탱크에 관한 클래스
	void move(Point p) {
		System.out.println("탱크가 뒤뚱뒤뚱");
	}
	void changeMode() {
		System.out.println("모드변경 쓍 퉁~~~~~~");
	}
}

class Dropship extends Unit{ // 드랍쉽을 정의한 클래스
	void move(Point p) {
		System.out.println("sdfsdf");
	}
	void load() {

	}

	void unload() {
		
	}
}


abstract class Unit{
	Point P;
	abstract void move(Point p);
	void stop(){
		System.out.println("정지");
	}
}
