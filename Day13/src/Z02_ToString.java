
/**
 * 최고 조상 클래스 Object의 toString() 메서드
 * toString() 출력시 : 클래스명@참조변수값으로 출력해준다
 */
public class Z02_ToString {
	public static void main(String[] args) {
		Pen p = new Pen("모나미" , "검정" , 1);
//		System.out.println(p); // 참조변수 호출시 .toString() 자동호출
//		System.out.println(p.toString()); //위의 코드와 같다.
		
		
//		toString() 을 재구현해서 실행하면 
//		[제품 : 모나미, 색상 : 검정 , 두께 : 1 ] 다음과 같이 나온다. 
		System.out.println(p);
		
		
	} // end of main
} // end of class

class Pen{
	String name = ""; // 제품 이랑
	String color = ""; // 색
	int boldWidth; // 굵기
	
	public Pen() {
	}

	public Pen(String name, String color, int boldWidth) {
		super();
		this.name = name;
		this.color = color;
		this.boldWidth = boldWidth;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[제품 : " + name + ", 색상 : " + color + " , 두께 : " + boldWidth + " ] " ;
	}
	
	
}