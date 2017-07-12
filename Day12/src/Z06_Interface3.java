
public class Z06_Interface3 {
	public static void main(String[] args) {
		FFightable f;
//		f = new FFightable() 생성 불가 Interface는 객체 생성 불가
		Fighter ff = new Fighter(); // interface 를 구현한 클래스로 객체 생성 가능
		f = ff; // 다형성
	} // end of main
} // end of class



class Fighter implements FFightable{

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fight() {
		// TODO Auto-generated method stub
		
	}
}

interface FFightable extends Movable, Attackable{
	void fight();
}

interface Movable{
	abstract void move(); // public 생략
}

interface Attackable{
	public void attack(); // abstract 생략
}