
/**
 * abstract  
 * 선언부만 있고 구현부가 없는 메서드
 * 꼭 필요하지만 자손마다 다르게 구현될 것으로 예상되는 경우에 사용
 * 다른 클래스를 작성하는데 도움을 주기 위해 사용
 *
 */
public class Z01_AbstractClass {
	public static void main(String[] args) {
		Boy b;
		b = new BBoy();
		
	} // end of main
} // end of class

abstract class C{ // 추상클래스에 추상메서드가 없을 수도 있다.
	
}

abstract class Boy{
	abstract void print(); // 추상 메서드 : 바디를 구현하지 않은 메서드
	// 추상 메서드에는 메서드 선언부에 abstract를 선언해 줘야 한다.
	// 추상 메서드를 보유한 클래스는 반드시 abstract를 선언해야 한다.
}

//객체를 생성할 클래스를 만드려면 - 미구현된 추상메서드를 완성한 클래스를 작성해야한다.

class BBoy extends Boy{

	@Override // 부모의 미구현된 메서드를 overriding 해서 바디를 완성해야한다.
	void print() {
		// TODO Auto-generated method stub
		
	}
	
}