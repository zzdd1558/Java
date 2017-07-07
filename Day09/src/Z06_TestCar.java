
/**
 * @author yunjin
 *	this  -  나 자신의 객체를 가리키는 참조변수
 */
public class Z06_TestCar {
	public static void main(String[] args) {
		Car sport = new Car();
		Car ddong = new Car();
	} // end of main
} // end of class


class Car{
	
	/** 이름 */
	String name = "";
	/** 색상 */
	String color = "";
	/** 속도 */
	int speed;
	
	Car(){ // 기본생성자
		
	}
	
//	this : 나 자신의 객체를 가리키는 참조변수,
//	this. 로는 멤버(변수 , 메서드) 이상에 접근 할 수 있다.
	public Car(String name, String color, int speed) {
		super();
		this.name = name;
		this.color = color;
		this.speed = speed;
	}

	void speedUp() {
		// TODO Auto-generated method stub
		speed++;
	}
	
	void speedDown() {
		// TODO Auto-generated method stub
		speed--;
	}
	
	void stopCar() {
		// TODO Auto-generated method stub
		speed = 0;
	}
	
	void printCar() {
		// TODO Auto-generated method stub
		System.out.println("name : " + name + " , color : " + color + " , speed : " + speed );
	}
	
	
}
